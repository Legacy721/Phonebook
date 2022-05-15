package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RetrieveContact {

    public static <K, V> K getKey(Map<K, V> map, V value) {
        for (K key: map.keySet())
        {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }



     public static void retrieveContact(HashMap<String, String> contactList) {

        System.out.println("Enter contact to search: ");
        Scanner searchName = new Scanner(System.in);
        String input = (searchName.nextLine());
        if (contactList.containsKey(input)) {
            String value = contactList.get(input);
            System.out.println("===============================");
            System.out.println(input);
            System.out.println(value);
            System.out.println("===============================");
            System.out.println("Your contact list is found!!");
        } else if (contactList.containsValue(input)) {
            String key = getKey(contactList, input);
            System.out.println("===============================");
            System.out.println(key);
            System.out.println(input);
            System.out.println("===============================");
            System.out.println("Your contact list is found!!");

        }
        else {
            System.out.println("Contact list not found.");
        }
    }
}
