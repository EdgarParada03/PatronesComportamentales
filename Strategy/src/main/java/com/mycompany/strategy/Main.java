/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.strategy;

/**
 *
 * @author edgar
 */
public class Main {

    public static void main(String[] args) {
        AnimalContext context = new AnimalContext();

        // Configuramos el contexto con diferentes estrategias
        context.setSoundStrategy(new DogSound());
        context.makeAnimalSound(); 

        context.setSoundStrategy(new CatSound());
        context.makeAnimalSound(); 
    }
}
