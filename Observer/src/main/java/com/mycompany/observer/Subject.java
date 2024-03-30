/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observer;

/**
 *
 * @author edgar
 */
import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String message;

    public void attach(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void detach(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void setMessage(String message) {
        this.message = message;
        notifySubscribers();
    }

    private void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }
}
