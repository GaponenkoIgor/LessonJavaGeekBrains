package com.company.levle1.homework5;

public class Main {

    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Гапоненко И.А.", "Инженер-конструктор", "gaponenko@mail.com", "+79092206025", 55000, 25);
        persArray[1] = new Employee("Смирнов А.В.", "Руководитель проекта", "smirnov@mail.com", "+79031203013", 80000, 45);
        persArray[2] = new Employee("Галушко К.А.", "Начальник группы ", "galushko@mail.com", "+79021201013", 90000, 55);
        persArray[3] = new Employee("Кент М.Н.", "Техник", "kent@mail.com", "+79992205024", 75000, 32);
        persArray[4] = new Employee("Бурый А.А.", "Ведущий инженер-конструктор", "buriy@mail.com", "+79002201064", 70000, 30);
        for (int i = 0; i < 5; i++) {

            if(persArray[i].getAge() > 40) {

                persArray[i].infoEmployee();
            }
        }
    }
}