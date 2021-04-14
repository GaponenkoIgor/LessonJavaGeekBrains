package com.company.levle1.homework5.homework6;

public class Main {

    public static void main(String[]args) {
        Cat cat = new Cat("Люцифер", 10, 200);
        Dog dog = new Dog("Друппи", 10, 500);

        dog.swimPossibleLength();
        cat.swimPossibleLength();
        dog.runPossibleLength();
        cat.runPossibleLength();

        }

}
