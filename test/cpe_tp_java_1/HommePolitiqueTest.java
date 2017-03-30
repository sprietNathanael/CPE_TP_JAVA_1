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
public class HommePolitiqueTest {
    
    public HommePolitiqueTest() {
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
     * Test of getParti method, of class HommePolitique.
     */
    @Test
    public void testGetParti() {
        System.out.println("getParti");
        HommePolitique instance = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        String expResult = "parti";
        String result = instance.getParti();
        assertEquals(expResult, result);
    }

    /**
     * Test of setParti method, of class HommePolitique.
     */
    @Test
    public void testSetParti() {
        System.out.println("setParti");
        String parti = "test";
        HommePolitique instance = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        instance.setParti(parti);
        String result = instance.getParti();
        assertEquals(parti, result);
    }

    /**
     * Test of getNom method, of class HommePolitique.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        HommePolitique instance = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        String expResult = "nom";
        String result = instance.getNom();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNom method, of class HommePolitique.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "test";
        HommePolitique instance = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        instance.setNom(nom);
        String result = instance.getNom();
        assertEquals(nom, result);
    }

    /**
     * Test of getPrenom method, of class HommePolitique.
     */
    @Test
    public void testGetPrenom() {
        System.out.println("getPrenom");
        HommePolitique instance = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        String expResult = "prenom";
        String result = instance.getPrenom();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrenom method, of class HommePolitique.
     */
    @Test
    public void testSetPrenom() {
        System.out.println("setPrenom");
        String prenom = "test";
        HommePolitique instance = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        instance.setPrenom(prenom);
        String result = instance.getPrenom();
        assertEquals(prenom, result);
    }

    /**
     * Test of getCivilite method, of class HommePolitique.
     */
    @Test
    public void testGetCivilite() {
        System.out.println("getCivilite");
        HommePolitique instance = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        Civilite expResult = Civilite.HOMME;
        Civilite result = instance.getCivilite();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCivilite method, of class HommePolitique.
     */
    @Test
    public void testSetCivilite() {
        System.out.println("setCivilite");
        Civilite civilite = Civilite.HOMME;
        HommePolitique instance = new HommePolitique("parti", "nom", "prenom", Civilite.HOMME);
        instance.setCivilite(civilite);
        Civilite result = instance.getCivilite();
        assertEquals(civilite, result);
    }

    /**
     * Test of toString method, of class HommePolitique.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String parti = "parti";
        String nom = "nom";
        String prenom = "prenom";
        Civilite civilite = Civilite.HOMME;
        HommePolitique instance = new HommePolitique(parti, nom, prenom, civilite);
        String expResult = "Homme Politique : "+prenom+" "+nom+" ; civilité : homme ; parti : "+parti;
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class HommePolitique.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        String parti = "parti";
        String nom = "nom";
        String prenom = "prenom";
        Civilite civilite = Civilite.HOMME;
        HommePolitique instance = new HommePolitique(parti, nom, prenom, civilite);
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(parti);
        hash = 97 * hash + Objects.hashCode(nom);
        hash = 97 * hash + Objects.hashCode(prenom);
        hash = 97 * hash + Objects.hashCode(civilite);
        int expResult = hash;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class HommePolitique.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        String parti = "parti";
        String nom = "nom";
        String prenom = "prenom";
        Civilite civilite = Civilite.HOMME;
        HommePolitique obj = new HommePolitique(parti, nom, prenom, civilite);
        HommePolitique instance = new HommePolitique(parti, nom, prenom, civilite);
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class HommePolitique.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        String parti = "parti";
        String nom = "nom";
        String prenom = "prenom";
        Civilite civilite = Civilite.HOMME;
        HommePolitique o = new HommePolitique(parti, nom, prenom, civilite);
        HommePolitique instance = new HommePolitique(parti, nom, prenom, civilite);
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
    }
    
}
