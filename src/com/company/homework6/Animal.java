package com.company.homework6;

public class Animal {
String name;

public Animal() {
}

public Animal(String name){
this.name = name;
}
    public void animalInfo() {
        System.out.println("Животное: " + name);

//public String toString() {
//    return ""
}
public void run() {
System.out.println("Животное бегает ");
    }

    public void swim() {
System.out.println("Животное плавает");
    }

}
