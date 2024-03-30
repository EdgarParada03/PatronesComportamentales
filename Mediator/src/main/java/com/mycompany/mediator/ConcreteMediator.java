/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mediator;

/**
 *
 * @author edgar
 */
public class ConcreteMediator implements Mediator {
    private ComponenteA componenteA;
    private ComponenteB componenteB;

    public void setComponenteA(ComponenteA componenteA) {
        this.componenteA = componenteA;
    }

    public void setComponenteB(ComponenteB componenteB) {
        this.componenteB = componenteB;
    }

    @Override
    public void enviarMensaje(String mensaje, Object remitente) {
        if (remitente == componenteA) {
            componenteB.recibirMensaje(mensaje);
        } else if (remitente == componenteB) {
            componenteA.recibirMensaje(mensaje);
        }
    }
}
