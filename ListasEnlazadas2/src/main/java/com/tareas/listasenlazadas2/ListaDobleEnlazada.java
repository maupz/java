/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tareas.listasenlazadas2;

/**
 *
 * @author maupz
 */
public class ListaDobleEnlazada<T> {
    private Nodo<T> primerNodo;
    private Nodo<T> ultimoNodo;

    public ListaDobleEnlazada() {
        this.primerNodo = null;
        this.ultimoNodo = null;
    }

    public boolean estaVacia() {
        return primerNodo == null;
    }

    public void agregarAlFinal(T valor) {
        Nodo<T> nuevoNodo = new Nodo<>(valor);
        if (estaVacia()) {
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;
        } else {
            nuevoNodo.setAnterior(ultimoNodo);
            ultimoNodo.setSiguiente(nuevoNodo);
            ultimoNodo = nuevoNodo;
        }
    }

    public void eliminar(Nodo<T> nodo) {
        if (nodo == primerNodo) {
            primerNodo = nodo.getSiguiente();
            if (primerNodo != null) {
                primerNodo.setAnterior(null);
            }
        } else if (nodo == ultimoNodo) {
            ultimoNodo = nodo.getAnterior();
            if (ultimoNodo != null) {
                ultimoNodo.setSiguiente(null);
            }
        } else {
            Nodo<T> anterior = nodo.getAnterior();
            Nodo<T> siguiente = nodo.getSiguiente();
            anterior.setSiguiente(siguiente);
            siguiente.setAnterior(anterior);
        }
    }

    public Nodo<T> buscar(T valor) {
        Nodo<T> actual = primerNodo;
        while (actual != null && !actual.getValor().equals(valor)) {
            actual = actual.getSiguiente();
        }
        return actual;
    }
    
    public void mostrar() {
        Nodo<T> actual = primerNodo;
        while (actual != null) {
            System.out.println(actual.getValor());
            actual = actual.getSiguiente();
        }
    }
    public Nodo<T> getPrimerNodo() {
        return primerNodo;
    }
}

