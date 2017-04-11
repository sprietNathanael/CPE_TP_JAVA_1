/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpe_tp_java_1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nathanael
 */
public class CandidatTest {
    
    public CandidatTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPourcentage method, of class Candidat.
     */
    @Test
    public void testGetPourcentage() {
        System.out.println("getPourcentage");
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        CandidatScrutin candidatScrutin = new CandidatScrutin(hommePolitique, 5);
        candidatScrutin.incrementeVoix();
        Candidat instance = new Candidat(candidatScrutin, 10);
        double expResult = 5.0;
        double result = instance.getPourcentage();
        assertEquals(expResult, result, 10.0);
    }

    /**
     * Test of compareTo method, of class Candidat.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        CandidatScrutin candidatScrutin = new CandidatScrutin(hommePolitique, 5);
        Candidat o = new Candidat(candidatScrutin, 100);
        Candidat instance = new Candidat(candidatScrutin, 100);
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class Candidat.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        double pourcentage = 10.0;
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        CandidatScrutin candidatScrutin = new CandidatScrutin(hommePolitique, 5);
        candidatScrutin.incrementeVoix();
        Candidat instance = new Candidat(candidatScrutin, 10);
        int expResult = 7;
        expResult = 53 * expResult +candidatScrutin.hashCode();
        expResult = 53*expResult + ((int)(Double.doubleToLongBits(pourcentage) ^ (Double.doubleToLongBits(pourcentage) >>> 32)));
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Candidat.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        CandidatScrutin candidatScrutin = new CandidatScrutin(hommePolitique, 5);
        Candidat instance = new Candidat(candidatScrutin, 5);
        candidatScrutin.incrementeVoix();
        Candidat obj = new Candidat(candidatScrutin, 6);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of getParti method, of class Candidat.
     */
    @Test
    public void testGetParti() {
        System.out.println("getParti");
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        CandidatScrutin candidatScrutin = new CandidatScrutin(hommePolitique, 5);
        Candidat instance = new Candidat(candidatScrutin, 5);
        String expResult = "parti";
        String result = instance.getParti();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNom method, of class Candidat.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        CandidatScrutin candidatScrutin = new CandidatScrutin(hommePolitique, 5);
        Candidat instance = new Candidat(candidatScrutin, 5);
        String expResult = "nom";
        String result = instance.getNom();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrenom method, of class Candidat.
     */
    @Test
    public void testGetPrenom() {
        System.out.println("getPrenom");
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        CandidatScrutin candidatScrutin = new CandidatScrutin(hommePolitique, 5);
        Candidat instance = new Candidat(candidatScrutin, 5);
        String expResult = "prenom";
        String result = instance.getPrenom();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCivilite method, of class Candidat.
     */
    @Test
    public void testGetCivilite() {
        System.out.println("getCivilite");
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        CandidatScrutin candidatScrutin = new CandidatScrutin(hommePolitique, 5);
        Candidat instance = new Candidat(candidatScrutin, 5);
        Civilite expResult = Civilite.HOMME;
        Civilite result = instance.getCivilite();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Candidat.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        CandidatScrutin candidatScrutin = new CandidatScrutin(hommePolitique, 5);
        candidatScrutin.incrementeVoix();
        Candidat instance = new Candidat(candidatScrutin, 10);
        String expResult = "Candidat{candidatScrutin="+candidatScrutin+", pourcentage=10.0}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDate method, of class Candidat.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        CandidatScrutin candidatScrutin = new CandidatScrutin(hommePolitique, 5);
        Candidat instance = new Candidat(candidatScrutin, 10);
        int expResult = 5;
        int result = instance.getDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of compareCandidat method, of class Candidat.
     */
    @Test
    public void testCompareCandidat() {
        System.out.println("compareCandidat");
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        HommePolitique hommePolitique2 = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        CandidatScrutin candidatScrutin = new CandidatScrutin(hommePolitique, 5);
        Candidat instance = new Candidat(candidatScrutin, 10);
        boolean expResult = true;
        boolean result = instance.compareCandidat(hommePolitique2);
        assertEquals(expResult, result);
    }
    
}
