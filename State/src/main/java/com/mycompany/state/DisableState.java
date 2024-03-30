/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.state;

/**
 *
 * @author edgar
 */
public class DisableState implements State {
    private final User user;

    public DisableState(User user) {
        this.user = user;
    }

    @Override
    public void onActive() {
        System.out.println("La tarjeta esta desactivada. No se puede comprar.");
    }

    @Override
    public void onDisable() {
        System.out.println("La tarjeta ya esta desactivada.");
    }

    @Override
    public void onLock() {
        user.changeState(new LockState(user));
        System.out.println("Tarjeta bloqueada.");
    }

    @Override
    public void onBuy() {
        System.out.println("La tarjeta esta desactivada. No se puede comprar.");
    }
}