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
public class NodoTest {
    
    public NodoTest() {
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
     * Test of getSiguiente method, of class Nodo.
     */
    @org.junit.Test
    public void testGetSiguiente() {
        System.out.println("getSiguiente");
        Nodo instance = new Nodo();
        Nodo expResult = instance.getSiguiente();
        Nodo result = instance.getSiguiente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class Nodo.
     */
    @org.junit.Test
    public void testGetData() {
        System.out.println("getData");
        Nodo instance = new Nodo();
        String data = "hola";
        instance.setData(data);
        Object expResult = data;
        Object result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class Nodo.
     */
    @org.junit.Test
    public void testSetData() {
        System.out.println("setData");
        String data = "hola";
        Nodo instance = new Nodo();
        instance.setData(data);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(data, instance.getData());
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarSiguiente method, of class Nodo.
     */
    @org.junit.Test
    public void testCambiarSiguiente() {
        System.out.println("cambiarSiguiente");
        Nodo newSiguiente = new Nodo("caca", null);
        Nodo instance = new Nodo();
        instance.cambiarSiguiente(newSiguiente);
        assertEquals(newSiguiente, instance.getSiguiente());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
