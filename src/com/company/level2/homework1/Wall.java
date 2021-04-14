package com.company.level2.homework1;

public class Wall implements Equipment {
    private int height;

    Wall(int height){
        this.height = height;
    }

    @Override
    public void interact(Athlete athlete) {
        athlete.jump(this.height);
    }

}