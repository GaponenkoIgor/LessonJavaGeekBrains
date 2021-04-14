package com.company.level2.homework1;

public class Robot  extends Person implements Athlete {

    public Robot(String name, int maxLength, int maxHeight) {
        super(name, maxLength, maxHeight);
    }

    @Override
    public void jump(int height) {

        if(height > getMaxHeight()){
            System.out.println("Робот "+getName()+" не осилил стену.");
            super.setInactive();
        }
        else {
            System.out.println("Робот " +getName()+ " перепрыгнул стену.");
        }

    }

    @Override
    public void run(int length) {
        if(length > getMaxLength()){
            System.out.println("Робот "+getName()+" не смог пробежать дорожку..");
            setInactive();
        }
        else {
            System.out.println("Робот "+getName()+" пробежал дорожку.");
        }

    }
}