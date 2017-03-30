/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpe_tp_java_1;

import java.util.Objects;
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
public class CandidatScrutinTest {
    
    public CandidatScrutinTest() {
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
     * Test of getParti method, of class CandidatScrutin.
     */
    @Test
    public void testGetParti() {
        System.out.println("getParti");
        HommePolitique h1 = new HommePolitique("parti", "nom", "prénom", Civilite.HOMME);
        CandidatScrutin instance = new CandidatScrutin(h1, 0);
        String expResult = "parti";
        String result = instance.getParti();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNom method, of class CandidatScrutin.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        HommePolitique h1 = new HommePolitique("parti", "nom", "prénom", Civilite.HOMME);
        CandidatScrutin instance = new CandidatScrutin(h1, 0);
        String expResult = "nom";
        String result = instance.getNom();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrenom method, of class CandidatScrutin.
     */
    @Test
    public void testGetPrenom() {
        System.out.println("getPrenom");
        HommePolitique h1 = new HommePolitique("parti", "nom", "prénom", Civilite.HOMME);
        CandidatScrutin instance = new CandidatScrutin(h1, 0);
        String expResult = "prénom";
        String result = instance.getPrenom();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCivilite method, of class CandidatScrutin.
     */
    @Test
    public void testGetCivilite() {
        System.out.println("getCivilite");
        HommePolitique h1 = new HommePolitique("parti", "nom", "prénom", Civilite.HOMME);
        CandidatScrutin instance = new CandidatScrutin(h1, 0);
        Civilite expResult = Civilite.HOMME;
        Civilite result = instance.getCivilite();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNbVoix method, of class CandidatScrutin.
     */
    @Test
    public void testGetNbVoix() {
        System.out.println("getNbVoix");
        HommePolitique h1 = new HommePolitique("parti", "nom", "prénom", Civilite.HOMME);
        CandidatScrutin instance = new CandidatScrutin(h1, 0);
        int expResult = 0;
        int result = instance.getNbVoix();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDate method, of class CandidatScrutin.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        HommePolitique h1 = new HommePolitique("parti", "nom", "prénom", Civilite.HOMME);
        CandidatScrutin instance = new CandidatScrutin(h1, 0);
        int expResult = 0;
        int result = instance.getDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class CandidatScrutin.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        HommePolitique h1 = new HommePolitique("parti", "nom", "prénom", Civilite.HOMME);
        CandidatScrutin instance = new CandidatScrutin(h1, 0);
        String expResult = "CandidatScrutin{Candidat = {Homme Politique : prénom nom ; civilité : homme ; parti : parti}, nbVoix=0, date=0}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class CandidatScrutin.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        String parti = "parti";
        String nom = "nom";
        String prenom = "prenom";
        int nbVoix = 0;
        int date = 0;
        Civilite civilite = Civilite.HOMME;
        int hash = 5;
        int prehash = 7;
        prehash = 97 * prehash + Objects.hashCode(parti);
        prehash = 97 * prehash + Objects.hashCode(nom);
        prehash = 97 * prehash + Objects.hashCode(prenom);
        prehash = 97 * prehash + Objects.hashCode(civilite);
        hash = 97 * hash + prehash;
        hash = 97 * hash + Objects.hashCode(nbVoix);
        hash = 97 * hash + Objects.hashCode(date);
        
        int expResult = hash;
        HommePolitique h1 = new HommePolitique(parti, nom, prenom, civilite);
        CandidatScrutin instance = new CandidatScrutin(h1, date);
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class CandidatScrutin.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        HommePolitique h1 = new HommePolitique("parti", "nom", "prénom", Civilite.HOMME);
        CandidatScrutin instance = new CandidatScrutin(h1, 0);
        Object obj = new CandidatScrutin(h1, 0);
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of incrementeVoix method, of class CandidatScrutin.
     */
    @Test
    public void testIncrementeVoix() {
        System.out.println("incrementeVoix");
        HommePolitique h1 = new HommePolitique("parti", "nom", "prénom", Civilite.HOMME);
        CandidatScrutin instance = new CandidatScrutin(h1, 0);
        instance.incrementeVoix();
        int expResult = 1;
        int result = instance.getNbVoix();
        assertEquals(expResult, result);
    }

    /**
     * Test of compareCandidat method, of class CandidatScrutin.
     */
    @Test
    public void testCompareCandidat() {
        System.out.println("compareCandidat");
        HommePolitique h1 = new HommePolitique("parti", "nom", "prénom", Civilite.HOMME);
        HommePolitique h2 = new HommePolitique("parti", "nom", "prénom", Civilite.HOMME);
        CandidatScrutin instance = new CandidatScrutin(h1, 0);
        CandidatScrutin cd = new CandidatScrutin(h2, 0);
        boolean expResult = true;
        boolean result = instance.compareCandidat(cd);
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class CandidatScrutin.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        HommePolitique h1 = new HommePolitique("parti", "nom", "prénom", Civilite.HOMME);
        HommePolitique h2 = new HommePolitique("parti", "nom", "prénom", Civilite.HOMME);
        CandidatScrutin instance = new CandidatScrutin(h1, 0);
        CandidatScrutin o = new CandidatScrutin(h2, 0);
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
    }
    
}
