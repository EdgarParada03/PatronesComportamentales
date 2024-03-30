/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.state;

/**
 *
 * @author edgar
 */
public class User {
    private State currentState;

    public User() {
        // Establecer un estado inicial (por ejemplo, ActiveState)
        this.currentState = new ActiveState(this);
    }

    public void changeState(State newState) {
        this.currentState = newState;
    }

    public void onActive() {
        currentState.onActive();
    }

    public void onDisable() {
        currentState.onDisable();
    }

    public void onLock() {
        currentState.onLock();
    }

    public void onBuy() {
        currentState.onBuy();
    }
}
