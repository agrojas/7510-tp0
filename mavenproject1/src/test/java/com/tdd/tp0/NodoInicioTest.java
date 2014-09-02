/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tdd.tp0;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author agu
 */
public class NodoInicioTest {
    
    public NodoInicioTest() {
    }

    /**
     * Test of nuevoNodoInicio method, of class NodoInicio.
     */
    @Test
    public void testNuevoNodoInicio() {
        System.out.println("nuevoNodoInicio");
        NodoInicio expResult = null;
        NodoInicio result = NodoInicio.nuevoNodoInicio();
        assertEquals(expResult, result);
    }
    
}
