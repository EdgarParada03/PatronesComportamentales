/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.templatemethod;

/**
 *
 * @author edgar
 */
public abstract class ComputerBuilder {
    // Método de plantilla
    public final void buildComputer() {
        addMotherboard();
        setupMotherboard();
        addProcessor();
        // Otros pasos comunes...
    }

    // Métodos abstractos que deben ser implementados por las subclases
    protected abstract void addMotherboard();
    protected abstract void setupMotherboard();
    protected abstract void addProcessor();
}