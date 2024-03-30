/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.observer;

/**
 *
 * @author edgar
 */
public class Main {

    public static void main(String[] args) {
        Subject newsPublisher = new Subject();

        // Create subscribers
        Subscriber emailSubscriber1 = new EmailSubscriber("subscriber1@example.com");
        Subscriber emailSubscriber2 = new EmailSubscriber("subscriber2@example.com");

        // Attach subscribers
        newsPublisher.attach(emailSubscriber1);
        newsPublisher.attach(emailSubscriber2);

        // Set a message (news update)
        newsPublisher.setMessage("Breaking news: Java is awesome!");

        // Detach a subscriber
        newsPublisher.detach(emailSubscriber1);

        // Set another message
        newsPublisher.setMessage("Important announcement: Coffee is essential!");

    }
}
