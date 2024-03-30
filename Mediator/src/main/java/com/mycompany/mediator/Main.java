/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediator;

/**
 *
 * @author edgar
 */
public class Main {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ComponenteA componenteA = new ComponenteA(mediator);
        ComponenteB componenteB = new ComponenteB(mediator);

        mediator.setComponenteA(componenteA);
        mediator.setComponenteB(componenteB);

        componenteA.enviar("Hola desde Componente A!");
        componenteB.enviar("Saludos desde Componente B!");
    }
}
