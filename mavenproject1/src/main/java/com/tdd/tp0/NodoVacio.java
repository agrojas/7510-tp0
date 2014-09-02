/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tdd.tp0;

/**
 *
 * @author agu
 */
public class NodoVacio implements Nodo {

    private NodoConDato anterior;
    protected int size = 0;
    protected Object dato;

    /**
     *
     * @param nodo
     */
    public NodoVacio(NodoConDato nodo) {
        anterior = nodo;
    }

    /**
     *
     * @return
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     *
     * @return @throws AssertionError
     */
    @Override
    public Nodo getDato() throws AssertionError {
        throw new AssertionError();
    }

    /**
     *
     * @param nodo
     */
    @Override
    public void setSiguiente(Nodo nodo) {
        //No usado
    }

    /**
     *
     * @param nodo
     */
    @Override
    public void setSiguiente(NodoConDato nodo) {
        anterior.insertSiguiente(nodo);
    }

    /**
     *
     * @param nodo
     */
    @Override
    public void setSiguiente(NodoVacio nodo) {
        //No usado
    }

    /**
     *
     * @return @throws AssertionError
     */
    @Override
    public Nodo getSiguiente() throws AssertionError {
        throw new AssertionError();
    }

}
