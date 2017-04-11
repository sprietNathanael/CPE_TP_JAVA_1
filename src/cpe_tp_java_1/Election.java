package cpe_tp_java_1;

/**
 * @author francoise.perrin
 * Inspiration MOOC sur Coursera "Introduction � la POO (en Java)"
 * by Jamila Sam, Jean-C�dric Chappelier - EPFL 
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cpe_tp_java_1.Civilite;
import cpe_tp_java_1.HommePolitique;



/**
 * Classe pour tester la simulation
 */

public class Election {

	public static void main(String args[]) {

		Scrutin scrutin;
		int dateSrutin;	
		int population;
		int votants;
		int dateBulletin;
		List< HommePolitique> hommePolitiques;
		
		hommePolitiques = new ArrayList< HommePolitique>();
		hommePolitiques.add(new HommePolitique("parti1", "Oxlama","Tarek",Civilite.HOMME));
                hommePolitiques.add(new HommePolitique("parti2","Tarcozi","Nicolai",Civilite.HOMME));
                hommePolitiques.add(new HommePolitique("parti3","Imirboutine","Vlad",Civilite.HOMME));
                hommePolitiques.add(new HommePolitique("parti4","Anerckjel","Angel",Civilite.FEMME));
		
		scrutin = null;
		dateSrutin = 15;		
		population = 30;
		votants = 20;

		/**
		 * simulation de votes 
		 * - tous sont envoyés à la même date 
		 * - Tous passent le check de date
		 * - 1 bulletins papier sur 2 passe check signature
		 */				
		System.out.println("\n\t1ère simulation \n" );
		dateBulletin = 13;	
		// simulation votes
		scrutin = simulerVotes(hommePolitiques, votants, dateSrutin, dateBulletin, population);
		// Traitement après vote
		scrutin.countTheVotes();
		// Affichage résultat brut du scrutin
		System.out.println(scrutin);
                System.out.println("Taux de participation : "+scrutin.tauxParticipation());


		/**
		 * simulation de votes 
		 * - tous sont envoyés à la même date invalide
		 * - Seuls les bulletins papier passent le check
		 * - 1 bulletins papier sur 2 passe check signature
		 */		
		System.out.println("\n\t2ème simulation \n" );
		dateBulletin = 16;		
		// simulation votes
		scrutin = simulerVotes(hommePolitiques, votants, dateSrutin, dateBulletin, population);	
		// Traitement après vote
		scrutin.countTheVotes();
		// Affichage résultat brut du scrutin
		System.out.println(scrutin);
                System.out.println("Taux de participation : "+scrutin.tauxParticipation());
	}


	private static Scrutin simulerVotes(List< HommePolitique> hommePolitiques, int votants,
			int dateSrutin, int dateBulletin, int population) {

		Scrutin scrutin = new Scrutin(hommePolitiques, population, dateSrutin);

		// ou bien
		//		scrutin = new Scrutin(population, dateSrutin);
		//		for (HommePolitique hommePolitique : hommePolitiques )
		//			scrutin.addCandidat(hommePolitique);

		//System.out.println(scrutin);

		if (hommePolitiques!=null){
			for (int i = 0; i < votants; ++i) {

				int candNum = Utils.randomInt(hommePolitiques.size());
				Vote vote = null;

				// bulletins papiers impairs sont signés, pairs sont non signés
				boolean signature = true;
				if ((i % 2) == 0) {
					signature = false;
				}

				// simulation création bulletins de vote
				switch (i % 3) {
				case 0:{
					vote = new BulletinElectronique(hommePolitiques.get(candNum), dateBulletin, dateSrutin);			
					break;
				}			
				case 1:{
					vote = new BulletinPapier(hommePolitiques.get(candNum), dateBulletin, dateSrutin, signature);
					break;
				}
				case 2:{
					vote = new BulletinCourrier(hommePolitiques.get(candNum), dateBulletin, dateSrutin, signature);
				}
				default: // nothing			
				}
			//	System.out.println(vote);		// pour v�rif ToString() des classes qui impl�mentent Vote
				scrutin.addBulletin(vote);				
			}
		}
		return scrutin;
	}
}


/**
 * Classe utilitaire
 *
 */
class Utils {

	private static final Random RANDOM = new Random();

	// initialise le générateur de nombres aléatoires
	public static void setSeed(long seed) {
		RANDOM.setSeed(seed);
	}

	// génère un entier entre 0 et max (max non compris)
	public static int randomInt(int max) {
		return RANDOM.nextInt(max);
	}
}