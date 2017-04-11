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
public class BulletinElectroniqueTest {
    
    public BulletinElectroniqueTest() {
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
     * Test of estInvalide method, of class BulletinElectronique.
     */
    @Test
    public void testEstInvalide1() {
        System.out.println("estInvalide 2 < (dateScrut - dateBull)");
        int dateBull = 1;
        int dateScrut = 5;
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        BulletinElectronique instance = new BulletinElectronique(hommePolitique,dateBull,dateScrut);
        boolean expResult = true;
        boolean result = instance.estInvalide();
        assertEquals(expResult, result);
    }
    @Test
    public void testEstInvalide2() {
        System.out.println("estInvalide 2 = (dateScrut - dateBull)");
        int dateBull = 3;
        int dateScrut = 5;
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        BulletinElectronique instance = new BulletinElectronique(hommePolitique,dateBull,dateScrut);
        boolean expResult = true;
        boolean result = instance.estInvalide();
        assertEquals(expResult, result);
    }
    @Test
    public void testEstInvalide3() {
        System.out.println("estInvalide 2 > (dateScrut - dateBull)");
        int dateBull = 4;
        int dateScrut = 5;
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        BulletinElectronique instance = new BulletinElectronique(hommePolitique,dateBull,dateScrut);
        boolean expResult = false;
        boolean result = instance.estInvalide();
        assertEquals(expResult, result);
    }
    @Test
    public void testEstInvalide4() {
        System.out.println("estInvalide 2 > (dateScrut - dateBull)");
        int dateBull = 7;
        int dateScrut = 5;
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        BulletinElectronique instance = new BulletinElectronique(hommePolitique,dateBull,dateScrut);
        boolean expResult = false;
        boolean result = instance.estInvalide();
        assertEquals(expResult, result);
    }
    

    /**
     * Test of getHommePolitique method, of class BulletinElectronique.
     */
    @Test
    public void testGetHommePolitique() {
        System.out.println("getHommePolitique");
        int dateBull = 7;
        int dateScrut = 5;
        HommePolitique expResult = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        BulletinElectronique instance = new BulletinElectronique(expResult,dateBull,dateScrut);
        HommePolitique result = instance.getHommePolitique();
        assertEquals(expResult, result);
    }

    /**
    * Test of getDate method, of class BulletinElectronique.
    */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        int expResult = 5;
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        BulletinElectronique instance = new BulletinElectronique(hommePolitique,expResult,6);
        int result = instance.getDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of checkDate method, of class BulletinElectronique.
     */
    @Test
    public void testCheckDate() {
        System.out.println("checkDate");
        int dateBull = 7;
        int dateScrut = 6;
        HommePolitique hommePolitique = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        BulletinElectronique instance = new BulletinElectronique(hommePolitique,dateBull,dateScrut);
        boolean expResult = false;
        boolean result = instance.checkDate(dateScrut);
        assertEquals(expResult, result);
    }
    
}
