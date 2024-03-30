/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.memento;

/**
 *
 * @author edgar
 */
public class Memento {
    private final String savedContent;

    public Memento(String contentToSave) {
        this.savedContent = contentToSave;
    }

    public String getSavedContent() {
        return savedContent;
    }
}
