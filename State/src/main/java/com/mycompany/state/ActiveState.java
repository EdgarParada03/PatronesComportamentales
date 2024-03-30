/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.state;

/**
 *
 * @author edgar
 */
public class ActiveState implements State {
    private final User user;

    public ActiveState(User user) {
        this.user = user;
    }

    @Override
    public void onActive() {
        System.out.println("Tarjeta activada. Puedes comprar.");
    }

    @Override
    public void onDisable() {
        user.changeState(new DisableState(user));
        System.out.println("Tarjeta desactivada.");
    }

    @Override
    public void onLock() {
        user.changeState(new LockState(user));
        System.out.println("Tarjeta bloqueada.");
    }

    @Override
    public void onBuy() {
        System.out.println("Realizando compra...");
    }
}
