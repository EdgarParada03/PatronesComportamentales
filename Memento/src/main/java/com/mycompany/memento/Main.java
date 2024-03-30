/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.memento;

/**
 *
 * @author edgar
 */
public class Main {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor("Hello, World!");

        // Save initial state
        TextEditorHistory history = new TextEditorHistory();
        history.addMemento(textEditor.save());

        // Make changes
        textEditor.write(" How are you?");
        System.out.println("Current content: " + textEditor.getContent());

        // Restore to initial state
        textEditor.restore(history.getMemento(0));
        System.out.println("Restored content: " + textEditor.getContent());
    }
}
