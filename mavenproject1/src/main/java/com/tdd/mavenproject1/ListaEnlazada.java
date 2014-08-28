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
public class ListaEnlazada {

    private Nodo nodo;

    public ListaEnlazada() {
        this.nodo = null;
    }

    public void insert(Object element) {
        this.nodo = new Nodo(element);
    }
    
    public boolean isEmpty(){
        return (nodo == null);
    }
    
    public Object remove()throws Exception{
        
        if(!isEmpty()){
            Nodo aux = this.nodo;
            this.nodo = this.nodo.getSiguiente();
            this.size--;
            return aux.getData(); 
        }
        throw new Exception("lista vacia");
    }

}
