/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.memento;

/**
 *
 * @author edgar
 */
public class TextEditor {
    private String content;

    public TextEditor(String initialContent) {
        this.content = initialContent;
    }

    public void write(String newText) {
        this.content += newText;
    }

    public String getContent() {
        return content;
    }

    public Memento save() {
        return new Memento(content);
    }

    public void restore(Memento memento) {
        this.content = memento.getSavedContent();
    }
}
