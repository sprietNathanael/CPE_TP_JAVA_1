/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpe_tp_java_1;

/**
 *
 * @author nathanael
 */
public class CPE_TP_JAVA_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        HommePolitique h1, h2, h3;
        h1 = new HommePolitique("parti1", "nom1", "prenom1", Civilite.FEMME);
        h3 = new HommePolitique("parti3", "nom3", "prenom3", Civilite.HOMME);
        System.out.println(h1.toString());
        System.out.println(h1 == h3); // false
        h1 = h3;
        System.out.println("h1 = "+h1);
        System.out.println("h3 = "+h3);
        System.out.println(h1 == h3); //true
        System.out.println(h1.equals(h3));
        h1.setCivilite(Civilite.FEMME);
        System.out.println("h1 = "+h1);
        System.out.println("h3 = "+h3);
        h2 = new HommePolitique(h1.getParti(), h1.getNom(), h1.getPrenom(), h1.getCivilite());
        System.out.println("-------------");
        System.out.println("h1 = "+h1);
        System.out.println("h2 = "+h2);
        System.out.println(h1 == h2); // false
        System.out.println(h1.equals(h2));
        h1.setCivilite(Civilite.HOMME);
        System.out.println(h1.equals(h2));
        System.out.println(h1.compareTo(h2));
        h1.setCivilite(Civilite.FEMME);
        System.out.println(h1.compareTo(h2));
        System.out.println("-------------");
        CandidatScrutin cd1, cd2;
        cd1 = new CandidatScrutin(h1, 54);
        cd2 = new CandidatScrutin(h2, 54);
        System.out.println((cd1.equals(cd2)));
        cd1.incrementeVoix();
        System.out.println((cd1.equals(cd2)));
        // rappellons nous que h1 et h2 sont la même personne...
        System.out.println(cd1.compareCandidat(cd2));
        System.out.println(cd1.compareTo(cd2));
        System.out.println(cd2);
        System.out.println("-------------");
        Candidat candidat1 = new Candidat(cd1, 10);
        System.out.println(candidat1);
    }
    
}
