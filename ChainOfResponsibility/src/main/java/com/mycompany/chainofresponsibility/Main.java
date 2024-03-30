/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.chainofresponsibility;

/**
 *
 * @author edgar
 */
public class Main {

    public static void main(String[] args) {
        LoanApprover manager = new Manager();
        LoanApprover director = new Director();
        LoanApprover vicePresident = new VicePresident();

        manager.setNextApprover(director);
        director.setNextApprover(vicePresident);

        // Simulación de solicitud de préstamo
        LoanRequest smallLoan = new LoanRequest(8000);
        LoanRequest mediumLoan = new LoanRequest(45000);
        LoanRequest largeLoan = new LoanRequest(120000);

        if (manager.approveLoan(smallLoan)) {
            System.out.println("Prestamo pequeño aprobado.");
        } else {
            System.out.println("Prestamo pequeño no aprobado.");
        }

        if (manager.approveLoan(mediumLoan)) {
            System.out.println("Prestamo mediano aprobado.");
        } else {
            System.out.println("Prestamo mediano no aprobado.");
        }

        if (manager.approveLoan(largeLoan)) {
            System.out.println("Prestamo grande aprobado.");
        } else {
            System.out.println("Prestamo grande no aprobado.");
        }
    }
}

