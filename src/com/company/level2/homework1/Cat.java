package com.company.level2.homework1;

public class Cat extends Person implements Athlete {

    public Cat(String name, int maxLength, int maxHeight) {
        super(name, maxLength, maxHeight);
    }

    @Override
    public void jump(int height) {
        if(height > getMaxHeight()){
            System.out.println("Кот "+getName()+" не смог перепрыгнуть.");
            setInactive();
        }
        else {
            System.out.println("Кот " +getName()+ " перепрыгнул.");
        }


    }

    @Override
    public void run(int length) {
        if(length > super.getMaxLength()){
            System.out.println("Кот "+super.getName()+" не смог пробежать.");
            super.setInactive();
        }
        else {
            System.out.println("Кот "+super.getName()+" пробежал.");
        }

    }
}