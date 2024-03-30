/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mediator;

/**
 *
 * @author edgar
 */
public class ComponenteA {
    private Mediator mediator;

    public ComponenteA(Mediator mediator) {
        this.mediator = mediator;
    }

    public void enviar(String mensaje) {
        mediator.enviarMensaje(mensaje, this);
    }

    public void recibirMensaje(String mensaje) {
        System.out.println("Componente A recibio el mensaje: " + mensaje);
    }
}
