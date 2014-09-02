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
public class NodoInicio extends NodoConDato {

    /**
     *
     * @return
     */
    public static NodoInicio nuevoNodoInicio() {
        return new NodoInicio(null);
    }

    /**
     *
     * @param element
     */
    private NodoInicio(Object element) {
        super(null);
    }
}
