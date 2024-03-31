/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author edgar
 */
public class DogSound implements AnimalSoundStrategy {
    @Override
    public void makeSound() {
        System.out.println("Woof woof!");
    }
}
