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
public class Cola implements Queue{
    /**
     * Inicio de la cola
     */
    private NodoConDato inicio;

    public Cola() {
        inicio = NodoConDato.nodoInicio();
    }

    @Override
    public void add(Object element) {
        inicio.setSiguiente(new NodoConDato(element));
    }

    @Override
    public Object top() {
        return inicio.getSiguiente().getDato();
    }


    @Override
    public void remove() {
        inicio.setSiguiente(this.inicio.getSiguiente().getSiguiente());
    }

    @Override
    public int size() {
        return inicio.getSiguiente().size();
    }

    @Override
    public boolean isEmpty() {
        return (this.size() == 0);
    }

}
