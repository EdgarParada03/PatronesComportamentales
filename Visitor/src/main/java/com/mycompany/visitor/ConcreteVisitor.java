/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visitor;

/**
 *
 * @author edgar
 */
public class ConcreteVisitor implements Visitor {
    @Override
    public void visitElementA(ConcreteElementA elementA) {
        System.out.println("Visiting ConcreteElementA");
        // Perform specific operation for ConcreteElementA
    }

    @Override
    public void visitElementB(ConcreteElementB elementB) {
        System.out.println("Visiting ConcreteElementB");
        // Perform specific operation for ConcreteElementB
    }
}

