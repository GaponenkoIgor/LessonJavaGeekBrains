package com.company.level2.homework1;

public class Team {
    private String name;
    public Athlete[] athletes;

    Team(String name, Athlete[] athletes){
        this.name = name;
        this.athletes = athletes;
    }

    public void showAllTeam(){
        for (Athlete athlete: athletes) {
            System.out.println(athlete.toString());
        }

    }

    public void showResults(){
        for (Athlete athlete: athletes) {
            StringBuilder str = new StringBuilder();
            str.append(athlete.getName());

            if(athlete.isActive())
                str.append(" - прошел дистанцию.");
            else
                str.append(" - сошел с дистанции.");

            System.out.println(str.toString());

        }

    }

}