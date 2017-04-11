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
public class BulletinPapierTest {
    
    public BulletinPapierTest() {
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
     * Test of estInvalide method, of class BulletinPapier.
     */
    @Test
    public void testEstInvalide() {
        System.out.println("estInvalide");
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        BulletinPapier instance = new BulletinPapier(hommePolitique,5,5,true);
        boolean expResult = false;
        boolean result = instance.estInvalide();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHommePolitique method, of class BulletinPapier.
     */
    @Test
    public void testGetHommePolitique() {
        System.out.println("getHommePolitique");
        HommePolitique expResult = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        BulletinPapier instance = new BulletinPapier(expResult,5,5,true);
        HommePolitique result = instance.getHommePolitique();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDate method, of class BulletinPapier.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        int expResult = 5;
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        BulletinPapier instance = new BulletinPapier(hommePolitique,expResult,5,true);
        int result = instance.getDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class BulletinPapier.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
         int dateBull = 6;
        int dateScrut = 7;
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        BulletinPapier instance = new BulletinPapier(hommePolitique,dateBull,dateScrut,true);
        String expResult = "Vote par BulletinPapier le 6 pour le scrutin du 7 pour " + hommePolitique + " -> valide";
        instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of checkSigne method, of class BulletinPapier.
     */
    @Test
    public void testCheckSigne() {
        System.out.println("checkSigne");
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        BulletinPapier instance = new BulletinPapier(hommePolitique,5,5,true);
        boolean expResult = true;
        boolean result = instance.checkSigne();
        assertEquals(expResult, result);
    }
    
}
