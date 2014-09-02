/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tdd.tp0;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author agu
 */
public class ColaTest {

    Cola instance;
    String dato1;
    int dato2;

    public ColaTest() {
    }

    @Before
    public void setUp() {
        dato1 = "dato1";
        dato2 = 2;
        instance = new Cola();

    }

    /**
     * Test of add method, of class Cola.
     */
    @Test
    public void testAdd() {
        System.out.println("insert");
        setUp();
        instance.add(dato1);
        Object expResult = 1;
        Object result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of top method, of class Cola.
     */
    @Test
    public void testTop() {
        System.out.println("top");
        setUp();
        instance.add(dato1);
        Object expResult = dato1;
        Object result = instance.top();
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class Cola.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        instance.add(dato2);
        instance.remove();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class Cola.
     */
    @Test
    public void testSizeUnElemento() {
        System.out.println("size");
        setUp();
        instance.add(dato1);
        int expResult = 1;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class Cola.
     */
    @Test
    public void testSizeDosElementos() {
        System.out.println("size");
        setUp();
        instance.add(dato1);
        instance.add(dato2);
        int expResult = 2;
        int result = instance.size();
        assertEquals(expResult, result);

    }

    /**
     * Test of isEmpty method, of class Cola.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        setUp();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test error al querer utilizar el metodo top de una cola vacia
     */
    @Test(expected = AssertionError.class)
    public void testFailedTop() {
        System.out.println("FailedTop");
        setUp();
        instance.top();
    }

    /**
     * Test error al querer utilizar el metodo erase de una cola vacia
     */
    @Test(expected = AssertionError.class)
    public void testFailedErase() {
        System.out.println("Failed Erase");
        setUp();
        instance.remove();
    }
}
