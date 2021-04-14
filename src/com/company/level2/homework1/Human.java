package com.company.level2.homework1;

public class Human extends Person implements Athlete {

    public Human(String name, int maxLength, int maxHeight) {
        super(name,maxLength, maxHeight);
    }

    @Override
    public void jump(int height) {
        if(height > getMaxHeight()){
            System.out.println("Спортсмен "+getName()+" не осилил стену.");
            setInactive();
        }

        else {
            System.out.println("Спортсмен " +getName()+ " перепрыгнул стену.");
        }

    }

    @Override
    public void run(int length) {
        if(length > getMaxLength()){
            System.out.println("Спортсмен "+getName()+" не смог пробежать дорожку.");
            setInactive();
        }
        else {
            System.out.println("Спортсмен "+getName()+" пробежал дорожку.");
        }

    }
}