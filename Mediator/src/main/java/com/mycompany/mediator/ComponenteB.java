/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mediator;

/**
 *
 * @author edgar
 */
public class ComponenteB {
    private Mediator mediator;

    public ComponenteB(Mediator mediator) {
        this.mediator = mediator;
    }

    public void enviar(String mensaje) {
        mediator.enviarMensaje(mensaje, this);
    }

    public void recibirMensaje(String mensaje) {
        System.out.println("Componente B recibio el mensaje: " + mensaje);
    }
}
