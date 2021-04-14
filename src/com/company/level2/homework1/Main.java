package com.company.level2.homework1;


    public class Main {

        public static void main(String[] args) {
            Athlete[] athletes = {new Human("Василий", 100, 2),
                    new Human("Анатолий", 20,1),
                    new Cat("Матроскин", 50, 3),
                    new Cat("Люцифер", 450, 6),
                    new Robot("Бит", 500,5)
            };

            Equipment[] equipments = {new RunTrack(1),
                    new Wall(2),
                    new RunTrack(5),
                    new Wall(5),
                    new RunTrack(50),
                    new Wall(5),
                    new RunTrack(400)
            };

            Team dreamTeam = new Team("Мстители", athletes);
            Course hardCourse = new Course(equipments);

            hardCourse.doIt(dreamTeam);

            System.out.println("\nРЕЗУЛЬТАТЫ:");
            dreamTeam.showResults();
        }
    }