/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tdd.tp0;

/**
 * Interfaz nodo para la implementacion de la cola
 *
 * @author agu
 */
public interface Nodo {

    /**
     *
     * @param nodo
     */
    public void setSiguiente(Nodo nodo);

    /**
     *
     * @param nodo
     */
    public void setSiguiente(NodoConDato nodo);

    /**
     *
     * @param nodo
     */
    public void setSiguiente(NodoVacio nodo);

    /**
     *
     * @return
     */
    public Nodo getSiguiente();

    /**
     *
     * @return
     */
    public int size();

    /**
     *
     * @return
     */
    public Object getDato();

}
