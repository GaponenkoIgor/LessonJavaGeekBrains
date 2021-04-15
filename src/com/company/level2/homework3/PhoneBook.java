package com.company.level2.homework3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;



public class PhoneBook implements Contacts {
    private HashMap<String,Set<String>> phoneBook = new HashMap<String, Set<String>>();


    @Override
    public void add(String name, String phoneNumber) {
        Set<String> tmp;
        if(phoneBook.containsKey(name)){
            tmp = phoneBook.get(name);
        } else {
            tmp = new HashSet<String>();
        }

        tmp.add(phoneNumber);
        phoneBook.put(name,tmp);
    }

    @Override
    public Set<String> get(String name) {
        return phoneBook.get(name);
    }

}