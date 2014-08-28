/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tdd.mavenproject1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author agu
 */
public class ListaEnlazadaTest {
    
    public ListaEnlazadaTest() {
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
     * Test of insert method, of class ListaEnlazada.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        String element = "data";
        ListaEnlazada instance = new ListaEnlazada();
        instance.insert(element);
        assertEquals(1, instance.size());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class ListaEnlazada.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ListaEnlazada instance = new ListaEnlazada();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class ListaEnlazada.
     */
    @Test
    public void testRemove() throws Exception{
        System.out.println("remove");
        ListaEnlazada instance = new ListaEnlazada();
        String data = "data";
        instance.insert(data);
        int expResult = 0;
        Object result = instance.remove();
        assertEquals(data, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
        /**
     * Test of remove method, of class ListaEnlazada.
     */
    @Test(expected = Exception.class)
    public void testRemoveInvalido()throws Exception  {
        System.out.println("remove");
        ListaEnlazada instance = new ListaEnlazada();
        int expResult = 0;
        Object result = instance.remove();
        
        //assertEquals(expResult, instance.size());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
