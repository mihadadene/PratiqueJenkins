/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mihadadene.mavenjenkinscours;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mihadadene
 */
public class CalculTest {
    
    public CalculTest() {
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
     * Test of Add method, of class Calcul.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        double a = 5.0;
        double b = 4.0;
        Calcul instance = new Calcul();
        double expResult = 9.0;
        double result = instance.Add(a, b);
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of Devid method, of class Calcul.
     */
    @Test
    public void testDevid() {
        System.out.println("Devid");
        double a = 5.0;
        double b = 4.0;
        Calcul instance = new Calcul();
        double expResult = 1.25;
        double result = instance.Devid(a, b);
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of Multip method, of class Calcul.
     */
    @Test
    public void testMultip() {
        System.out.println("Multip");
        double a = 5.0;
        double b = 4.0;
        Calcul instance = new Calcul();
        double expResult = 20.0;
        double result = instance.Multip(a, b);
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of Sous method, of class Calcul.
     */
    @Test
    public void testSous() {
        System.out.println("Sous");
        double a = 5.0;
        double b = 4.0;
        Calcul instance = new Calcul();
        double expResult = 1.0;
        double result = instance.Sous(a, b);
        assertEquals(expResult, result, 0.0);
      
    }
    
}
