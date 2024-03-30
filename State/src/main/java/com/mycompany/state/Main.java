/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.state;

/**
 *
 * @author edgar
 */
public class Main {

    public static void main(String[] args) {
        User user = new User();

        user.onActive();
        user.onBuy();
        user.onDisable();
        user.onLock();
        user.onBuy();
    }
}
