/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tdd.tp0;

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
public class NodoConDatoTest {
    
    public NodoConDatoTest() {
    }


    /**
     * Test of setSiguiente method, of class NodoConDato.
     */
    @Test
    public void testSetSiguiente_Nodo() {
        System.out.println("setSiguiente");
        Nodo nodo = new NodoConDato("hola");
        NodoConDato instance = new NodoConDato("nodo");
        instance.setSiguiente(nodo);
        Nodo siguiente = instance.getSiguiente();
        assertEquals(nodo, siguiente);
    }

    /**
     * Test of setSiguiente method, of class NodoConDato.
     */
    @Test
    public void testSetSiguiente_NodoConDato() {
        System.out.println("setSiguiente");
        NodoConDato nodo = new NodoConDato("nodo1");
        NodoConDato instance = new NodoConDato("nodo");
        instance.setSiguiente(nodo);
        Nodo siguiente = instance.getSiguiente();
        assertEquals(nodo, siguiente);
    }

    /**
     * Test of setSiguiente method, of class NodoConDato.
     */
    @Test
    public void testSetSiguiente_NodoVacio() {
        System.out.println("setSiguiente");
        NodoVacio nodo = null;
        NodoConDato instance = null;
        instance.setSiguiente(nodo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertSiguiente method, of class NodoConDato.
     */
    @Test
    public void testInsertSiguiente() {
        System.out.println("insertSiguiente");
        NodoConDato nodo = null;
        NodoConDato instance = null;
        instance.insertSiguiente(nodo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSiguiente method, of class NodoConDato.
     */
    @Test
    public void testGetSiguiente() {
        System.out.println("getSiguiente");
        NodoConDato instance = null;
        Nodo expResult = null;
        Nodo result = instance.getSiguiente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class NodoConDato.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        NodoConDato instance = null;
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDato method, of class NodoConDato.
     */
    @Test
    public void testGetDato() {
        System.out.println("getDato");
        NodoConDato instance = null;
        Object expResult = null;
        Object result = instance.getDato();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
