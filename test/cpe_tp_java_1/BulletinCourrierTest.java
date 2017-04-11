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
public class BulletinCourrierTest {
    
    public BulletinCourrierTest() {
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
     * Test of estInvalide method, of class BulletinCourrier.
     */
    @Test
    public void testEstInvalide() {
        System.out.println("estInvalide 0 < (dateScrut - dateBull) && signature");
        int dateBull = 1;
        int dateScrut = 5;
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        BulletinCourrier instance = new BulletinCourrier(hommePolitique,dateBull,dateScrut, true);
        boolean expResult = false;
        boolean result = instance.estInvalide();
        assertEquals(expResult, result);
    }
    @Test
    public void testEstInvalide2() {
        System.out.println("estInvalide 0 = (dateScrut - dateBull)  && signature");
        int dateBull = 5;
        int dateScrut = 5;
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        BulletinCourrier instance = new BulletinCourrier(hommePolitique,dateBull,dateScrut, true);
        boolean expResult = false;
        boolean result = instance.estInvalide();
        assertEquals(expResult, result);
    }
    @Test
    public void testEstInvalide3() {
        System.out.println("estInvalide 0 > (dateScrut - dateBull)  && signature");
        int dateBull = 5;
        int dateScrut = 4;
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        BulletinCourrier instance = new BulletinCourrier(hommePolitique,dateBull,dateScrut, true);
        boolean expResult = true;
        boolean result = instance.estInvalide();
        assertEquals(expResult, result);
    }
    @Test
    public void testEstInvalide4() {
        System.out.println("estInvalide 0 = (dateScrut - dateBull)  && !signature");
        int dateBull = 5;
        int dateScrut = 5;
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        BulletinCourrier instance = new BulletinCourrier(hommePolitique,dateBull,dateScrut, false);
        boolean expResult = true;
        boolean result = instance.estInvalide();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHommePolitique method, of class BulletinCourrier.
     */
    @Test
    public void testGetHommePolitique() {
        System.out.println("getHommePolitique");
        HommePolitique expResult = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        BulletinCourrier instance = new BulletinCourrier(expResult,5,5,true);
        HommePolitique result = instance.getHommePolitique();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDate method, of class BulletinCourrier.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        int expResult = 5;
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        BulletinCourrier instance = new BulletinCourrier(hommePolitique,expResult,5,true);
        int result = instance.getDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class BulletinCourrier.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        int dateBull = 6;
        int dateScrut = 7;
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        BulletinCourrier instance = new BulletinCourrier(hommePolitique,dateBull,dateScrut,true);
        String expResult = "Vote par BulletinCourrier le 6 pour le scrutin du 7 pour " + hommePolitique + " -> valide";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of checkSigne method, of class BulletinCourrier.
     */
    @Test
    public void testCheckSigne() {
        System.out.println("checkSigne");
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        BulletinCourrier instance = new BulletinCourrier(hommePolitique,5,5,true);
        boolean expResult = true;
        boolean result = instance.checkSigne();
        assertEquals(expResult, result);
    }

    /**
     * Test of checkDate method, of class BulletinCourrier.
     */
    @Test
    public void testCheckDate() {
        System.out.println("checkDate");
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        BulletinCourrier instance = new BulletinCourrier(hommePolitique,7,5,true);
        boolean expResult = false;
        boolean result = instance.checkDate();
        assertEquals(expResult, result);
    }
    
}
