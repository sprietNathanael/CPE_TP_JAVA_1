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
    }
    
}
