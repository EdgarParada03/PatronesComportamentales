/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.iterator;

/**
 *
 * @author edgar
 */
public class Main {

    public static void main(String[] args) {
        ColeccionConcreta<String> miColeccion = new ColeccionConcreta<>(5);
        miColeccion.agregarElemento("Manzana");
        miColeccion.agregarElemento("Banana");
        miColeccion.agregarElemento("Cereza");

        Iterador<String> iterador = miColeccion.crearIterador();
        while (iterador.tieneSiguiente()) {
            System.out.println(iterador.siguiente());
        }
    }
}
