/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iterator;

/**
 *
 * @author edgar
 */
public class IteradorConcreto<T> implements Iterador<T> {
    private T[] elementos;
    private int posición = 0;

    public IteradorConcreto(T[] elementos) {
        this.elementos = elementos;
    }

    @Override
    public boolean tieneSiguiente() {
        return posición < elementos.length;
    }

    @Override
    public T siguiente() {
        if (tieneSiguiente()) {
            T elemento = elementos[posición];
            posición++;
            return elemento;
        }
        throw new IndexOutOfBoundsException("No hay más elementos en la colección.");
    }
}