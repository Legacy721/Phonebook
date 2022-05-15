package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class StoreContact {
    private static String name;
    private static String phoneNumber;

    public static void storeContact(HashMap<String, String> contactList){
        System.out.println("Enter name: ");
        Scanner addName = new Scanner(System.in);
        name = (addName.nextLine());
        System.out.println("===============================");

        System.out.println("Enter Phone Number: ");
        Scanner addNumber = new Scanner(System.in);
        phoneNumber = (addNumber.nextLine());
        System.out.println("===============================");

        contactList.put(name,phoneNumber);

    }


}
