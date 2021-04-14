package com.company.level2.homework1;

public class Course {
    Equipment[] equipments;

    Course(Equipment[] equipments){
        this.equipments = equipments;
    }

    void doIt(Team team){
        for (Athlete athlete: team.athletes) {
            System.out.println("\n"+athlete.toString() + " -  СТАРТ!");
            for (Equipment equipment: equipments) {
                if(!athlete.isActive())
                    break;
                equipment.interact(athlete);
            }
            if(athlete.isActive())
                System.out.println(athlete.toString()+" - прошел дистанцию!");
            else
                System.out.println(athlete.toString()+" - сошел с дистанции.");
        }

    }

}