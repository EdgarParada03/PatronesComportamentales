/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.state;

/**
 *
 * @author edgar
 */
public class LockState implements State {
    private final User user;

    public LockState(User user) {
        this.user = user;
    }

    @Override
    public void onActive() {
        System.out.println("La tarjeta esta bloqueada. No se puede comprar.");
    }

    @Override
    public void onDisable() {
        System.out.println("La tarjeta esta bloqueada. No se puede desactivar.");
    }

    @Override
    public void onLock() {
        System.out.println("La tarjeta ya está bloqueada.");
    }

    @Override
    public void onBuy() {
        System.out.println("La tarjeta esta bloqueada. No se puede comprar.");
    }
}