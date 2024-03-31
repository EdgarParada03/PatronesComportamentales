/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.templatemethod;

/**
 *
 * @author edgar
 */
public class HighEndComputerBuilder extends ComputerBuilder {
    @Override
    protected void addMotherboard() {
        System.out.println("Adding high-end motherboard.");
    }

    @Override
    protected void setupMotherboard() {
        System.out.println("Setting up high-end motherboard.");
    }

    @Override
    protected void addProcessor() {
        System.out.println("Adding high-end processor.");
    }
}