/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chainofresponsibility;

/**
 *
 * @author edgar
 */
public class Manager implements LoanApprover {
    //Concrete handler
    private LoanApprover nextApprover;

    @Override
    public void setNextApprover(LoanApprover nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public boolean approveLoan(LoanRequest request) {
        if (request.getLoanAmount() <= 10000) {
            System.out.println("Manager approved the loan.");
            return true;
        } else if (nextApprover != null) {
            return nextApprover.approveLoan(request);
        }
        return false;
    }
}