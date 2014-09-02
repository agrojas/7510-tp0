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
public class NodoVacioTest {

    public NodoVacioTest() {
    }

    /**
     *
     */
    @Test(expected = AssertionError.class)
    public void testFailedGetSiguiente() {
        NodoVacio nodo = new NodoVacio(null);
        nodo.getSiguiente();
    }

    /**
     *
     */
    @Test
    public void testSize() {
        NodoVacio nodo = new NodoVacio(null);
        int result = nodo.size();
        int expResult = 0;
        assertEquals(expResult, result);
    }

    /**
     *
     */
    @Test(expected = AssertionError.class)
    public void testFailedGetDati() {
        NodoVacio nodo = new NodoVacio(null);
        nodo.getDato();
    }
}
