package com.company.level2.homework3;

import java.util.Set;

public interface Contacts {

    void add(String name, String phoneNumber);
    Set<String> get(String name);
}
