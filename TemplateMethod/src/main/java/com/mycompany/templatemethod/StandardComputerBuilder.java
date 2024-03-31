/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.templatemethod;

/**
 *
 * @author edgar
 */
public class StandardComputerBuilder extends ComputerBuilder {
    @Override
    protected void addMotherboard() {
        System.out.println("Adding standard motherboard.");
    }

    @Override
    protected void setupMotherboard() {
        System.out.println("Setting up standard motherboard.");
    }

    @Override
    protected void addProcessor() {
        System.out.println("Adding standard processor.");
    }
}
