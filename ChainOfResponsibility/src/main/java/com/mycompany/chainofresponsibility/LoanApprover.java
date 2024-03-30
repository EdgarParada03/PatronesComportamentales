/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chainofresponsibility;

/**
 *
 * @author edgar
 */
public interface LoanApprover {
    //Handler
    void setNextApprover(LoanApprover nextApprover);
    boolean approveLoan(LoanRequest request);
}

