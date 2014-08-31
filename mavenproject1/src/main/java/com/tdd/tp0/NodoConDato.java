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
public class NodoConDato implements Nodo {

    protected int size = 1;
    protected Object dato;
    private Nodo siguiente = new NodoVacio(this);

    public static NodoConDato nodoInicio() {
        return new NodoConDato(null);
    }

    public NodoConDato(Object element) {
        this.dato = element;
    }

    @Override
    public void setSiguiente(Nodo nodo) {
        this.siguiente = nodo;

    }

    @Override
    public void setSiguiente(NodoConDato nodo) {
        this.siguiente.setSiguiente(nodo);

    }

    @Override
    public void setSiguiente(NodoVacio nodo) {
        this.siguiente = nodo;
    }

    public void insertSiguiente(NodoConDato nodo) {
        this.siguiente = nodo;
    }

    @Override
    public Nodo getSiguiente() {
        return this.siguiente;
    }

    @Override
    public int size() {
        return (this.size + this.siguiente.size());
    }

    @Override
    public Object getDato() {
        return this.dato;
    }

}
