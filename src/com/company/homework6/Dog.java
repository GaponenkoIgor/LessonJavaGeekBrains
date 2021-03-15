package com.company.homework6;

public class Dog extends Animal {

    public Dog(String name) {
        this.name = name;

    }

    public void dogInfo() {
        System.out.println(" Собака имя: " + name);
    }
        @Override
       public void run() {
            System.out.println(name + " пробежал 500 м.");
        }
    @Override
    public void swim() {
        System.out.println(name + " проплыл 10 м.");
    }


}
