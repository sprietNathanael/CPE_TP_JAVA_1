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
        Candidat instance = new Candidat(candidatScrutin, 100);
        double expResult = 5.0;
        double result = instance.getPourcentage();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of compareTo method, of class Candidat.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Candidat o = null;
        Candidat instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Candidat.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Candidat instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Candidat.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Candidat instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParti method, of class Candidat.
     */
    @Test
    public void testGetParti() {
        System.out.println("getParti");
        Candidat instance = null;
        String expResult = "";
        String result = instance.getParti();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Candidat.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Candidat instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrenom method, of class Candidat.
     */
    @Test
    public void testGetPrenom() {
        System.out.println("getPrenom");
        Candidat instance = null;
        String expResult = "";
        String result = instance.getPrenom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCivilite method, of class Candidat.
     */
    @Test
    public void testGetCivilite() {
        System.out.println("getCivilite");
        Candidat instance = null;
        Civilite expResult = null;
        Civilite result = instance.getCivilite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Candidat.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Candidat instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
