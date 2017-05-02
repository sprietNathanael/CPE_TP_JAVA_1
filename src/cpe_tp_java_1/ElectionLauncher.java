package cpe_tp_java_1;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

/**
 * @author francoise.perrin
 * Inspiration MOOC sur Coursera "Introduction � la POO (en Java)"
 * by Jamila Sam, Jean-C�dric Chappelier - EPFL 
 */

public class ElectionLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

            Election election = new Election();
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

            ArrayList candidatList;
            dateSrutin = 15;		
            population = 100;
            votants = 75;

            /**
             * simulation de votes 
             * - tous sont envoyés à la même date 
             * - Tous passent le check de date
             * - 1 bulletins papier sur 2 passe check signature
             */				
            System.out.println("\n\t1ère simulation \n" );
            dateBulletin = 13;

            // simulation votes
            election.launchElection(hommePolitiques, votants, dateSrutin, dateBulletin, population);
            // Traitement après vote
            
            // Affichage résultat brut du scrutin
            
            System.out.println(election.getCandidatList(""));
            System.out.println(election.getCandidatList("pourcentage"));
            System.out.println("Taux de participation : "+election.getTauxDeParticipation());


            /**
             * simulation de votes 
             * - tous sont envoyés à la même date invalide
             * - Seuls les bulletins papier passent le check
             * - 1 bulletins papier sur 2 passe check signature
             */		
            System.out.println("\n\t2ème simulation \n" );
            dateBulletin = 16;		
            // simulation votes
            election.launchElection(hommePolitiques, votants, dateSrutin, dateBulletin, population);
            // Traitement après vote
            
            // Affichage résultat brut du scrutin
            System.out.println(election.getCandidatList(""));
            System.out.println(election.getCandidatList("pourcentage"));
            System.out.println("Taux de participation : "+election.getTauxDeParticipation());
                
                
		
		
	}
}
