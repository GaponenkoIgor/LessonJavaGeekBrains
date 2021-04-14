package com.company.levle1.homework5.homework6;

public class Cat extends Animal {

    public Cat(String name,int swim, int run) {
        super(name,swim,run);
    }
   @Override
        public void runPossibleLength() {
            if (run <= 200) {
                System.out.println("Кот " + name + " пробежал " + run + "м.");
            } else {
                System.out.println(name + "не сможет пробежать!");
            }
        }
    @Override
    public void swimPossibleLength(){
        System.out.println(name + " не умеет плавать!");
    }
}
