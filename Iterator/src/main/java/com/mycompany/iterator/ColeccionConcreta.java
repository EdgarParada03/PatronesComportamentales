/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iterator;

/**
 *
 * @author edgar
 */
public class ColeccionConcreta<T> implements ColeccionIterable<T> {
    private T[] elementos;
    private int tamaño;

    @SuppressWarnings("unchecked")
    public ColeccionConcreta(int capacidad) {
        elementos = (T[]) new Object[capacidad];
        tamaño = 0;
    }

    public void agregarElemento(T elemento) {
        if (tamaño < elementos.length) {
            elementos[tamaño] = elemento;
            tamaño++;
        } else {
            System.out.println("La colección está llena. No se pueden agregar más elementos.");
        }
    }

    @Override
    public Iterador<T> crearIterador() {
        return new IteradorConcreto<>(elementos);
    }
}
