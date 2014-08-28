/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tdd.mavenproject1;

/**
 *
 * @author agu
 */
public class Nodo {

    private Object data;
    private Nodo siguiente;

    public Nodo() {
        this.data = this.siguiente = null;
    }
    public Nodo(Object data){
        this.data = data;
    }

    public Nodo getSiguiente() {
        return this.siguiente;
    }

    public Object getData() {
        return this.data;
    }
    public void setData(Object data){
        this.data = data;
    }
    
    public void setSiguiente(Nodo newSiguiente) {
        this.siguiente = newSiguiente;
    }

}
