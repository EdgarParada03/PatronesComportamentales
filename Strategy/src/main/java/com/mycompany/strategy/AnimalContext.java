/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author edgar
 */
public class AnimalContext {
    private AnimalSoundStrategy soundStrategy;

    public void setSoundStrategy(AnimalSoundStrategy soundStrategy) {
        this.soundStrategy = soundStrategy;
    }

    public void makeAnimalSound() {
        soundStrategy.makeSound();
    }
}
