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
public interface Queue {

    /**
     *
     * @return
     */
    boolean isEmpty();

    /**
     *
     * @return
     */
    int size();

    /**
     * agregar un item
     *
     * @param item
     */
    void add(Object item);

    /**
     * retornar el primer item, lanzar exception si esta vacío.
     *
     * @return
     */
    Object top();

    /**
     * remover el primer item, lanzar exception si esta vacío.
     */
    void remove();
}
