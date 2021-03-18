package com.company.homework7;

public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }


    boolean decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;
        System.out.println(" Добавте еды в миску");
        food -= n;
        return true;


    }

    void addFood(int food) {
        this.food += food;
    }

    void info() {
        System.out.println("Корма в миске: " + food);
    }
}