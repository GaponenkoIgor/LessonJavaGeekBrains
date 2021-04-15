package com.company.level2.homework3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] words = {"Андрей", "Гоша", "Петр", "Миша", "Андрей", "Петр", "Петр", "Миша", "Олег", "Гоша", "Степан", "Мария", "Катя", "Кристина", "Петр"};

        HashMap<String, Integer> dictionary = new HashMap<>();
        for (String word : words) {
            if (!dictionary.containsKey(word))
                dictionary.put(word, 1);
            else
                dictionary.put(word, dictionary.get(word) + 1);
        }
        System.out.println(dictionary);


        Contacts phoneBook = new PhoneBook();
        phoneBook.add("Васильев","+7-999-100-11-22");
        phoneBook.add("Васильев","+7-999-100-11-23");
        phoneBook.add("Васильев","+7-999-100-11-24");

        phoneBook.add("Путин","+7-999-001-01-01");
        phoneBook.add("Служба спасения","112");

        showPhones(phoneBook, "Васильев");
        showPhones(phoneBook, "Служба спасения");
        showPhones(phoneBook, "Путин");

    }

    public static void showPhones(Contacts phoneBook,String name){
        System.out.println("\n"+name+":");
        List<String> phonesList = new ArrayList<String>(phoneBook.get(name));
        Collections.sort(phonesList);
        for (String str: phonesList) {
            System.out.println(str);
        }
    }
}