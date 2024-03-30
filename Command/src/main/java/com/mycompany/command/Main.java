/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.command;

/**
 *
 * @author edgar
 */
public class Main {
    //Client
    public static void main(String[] args) {
        Light light = new Light();
        Command flipUpCommand = new FlipUpCommand(light);
        Command flipDownCommand = new FlipDownCommand(light);

        Switch lightSwitch = new Switch(flipUpCommand, flipDownCommand);
        lightSwitch.flipUp();
        lightSwitch.flipDown();
    }
}
