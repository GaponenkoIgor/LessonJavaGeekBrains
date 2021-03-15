package com.company.homework6;

public class Cat extends Animal {

    public Cat(String name) {
        this.name = name;

    }

    public void catInfo() {
        System.out.println("Кот имя: " + name);
    }
    @Override
        public void run() {
            System.out.println(name + " пробежал 200 м.");
        }
    @Override
    public void swim(){
        System.out.println(name + " не умеет плавать!");
    }


}
