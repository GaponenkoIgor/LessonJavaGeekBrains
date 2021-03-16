package com.company.homework6;

public class Dog extends Animal {
    public Dog(String name,int swim, int run) {
        super(name,swim,run);
    }

    @Override
    public void runPossibleLength() {
        if (run <= 500) {
            System.out.println("Пёс " + name + " пробежал " + run + "м.");
        } else {
            System.out.println(name + " не сможет пробежать!");
        }
    }

    @Override
    public void swimPossibleLength() {
        if (swim <= 10) {
            System.out.println("Пёс " + name + " проплыл " + swim + "м.");
        } else {
            System.out.println(name + " не сможет проплыть!");
        }
    }
}
