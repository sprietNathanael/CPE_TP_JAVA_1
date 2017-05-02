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
import java.util.Collection;



/**
 * Classe pour tester la simulation
 */

public class Election {
        
    private Scrutin scrutin;

    public Election() {
        this.scrutin = null;
    }

   
    
    public void launchElection(List< HommePolitique> hommePolitiques, int votants,
                    int dateSrutin, int dateBulletin, int population)
    {
       this.scrutin = new Scrutin(hommePolitiques, population, dateSrutin);
       simulerVotes(hommePolitiques, votants, dateSrutin, dateBulletin, population);
       this.scrutin.countTheVotes();
       

    }
    
    public ArrayList getCandidatList(String type)
    {
        ArrayList candidatList = this.scrutin.getCandidatList();
        if(type.equals("pourcentage"))
        {
            candidatList.sort(new PercentageComparator());
        }
        return candidatList;
    }
    
    public int getTauxDeParticipation()
    {
        return(this.scrutin.tauxParticipation());
    }

    private void simulerVotes(List< HommePolitique> hommePolitiques, int votants,
                    int dateSrutin, int dateBulletin, int population) {

        

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
                this.scrutin.addBulletin(vote);				
            }
        }
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