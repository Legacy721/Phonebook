package org.example;

import java.util.HashMap;
import java.util.Scanner;

import static org.example.RetrieveContact.retrieveContact;
import static org.example.StoreContact.storeContact;

public class ShowMenu {

    public static void showMenu(){
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> contactList = new HashMap<>();

        System.out.println("Welcome to Legacy's phonebook services....");
        System.out.println("Choose an option below to get started");
        System.out.println(" ");
        System.out.println("A. Store contact");
        System.out.println("B. Retrieve contact");
        System.out.println("C. Exit");
        System.out.println(" ");

        do {
            System.out.println("===============================");
            System.out.println("Choose an option");
            System.out.println("===============================");
            option =  scanner.next().charAt(0);
            System.out.println("===============================");
            System.out.println("\n");

            if (option == 'A') {
                storeContact(contactList);
                System.out.println("You have successfully saved your contact.");
            } else if (option == 'B') {
                retrieveContact(contactList);
            } else if (option == 'C') {
                System.out.println("Thank you for using our service...");

            } else {
                System.out.println("You have entered a wrong option. Please Enter a valid option.");
            }
        } while (option != 'C');
    }
}
