/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.templatemethod;

/**
 *
 * @author edgar
 */
public class Main {

    public static void main(String[] args) {
        // Crear un constructor de computadoras estándar
        ComputerBuilder standardBuilder = new StandardComputerBuilder();
        standardBuilder.buildComputer();

        System.out.println("\n---\n");

        // Crear un constructor de computadoras de gama alta
        ComputerBuilder highEndBuilder = new HighEndComputerBuilder();
        highEndBuilder.buildComputer();
    }
}
