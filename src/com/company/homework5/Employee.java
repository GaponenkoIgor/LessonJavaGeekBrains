package com.company.homework5;

public class Employee {

    private String name;
    private String position;
    private String email;

    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void infoEmployee() {
        System.out.println("ФИО: " + name + "; Должность: " + position + "; Email " + email + "; Номер телефона: " + phoneNumber + "; Зарплата: " + salary + "; Возраст:  " + age );

    }

    public String getName () {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

        public String getPosition () {
            return position;
        }

        public void setPosition (String position){
            this.position = position;
        }

        public String getEmail () {
            return email;
        }

        public void setEmail (String email){
            this.email = email;
        }

        public String getPhoneNumber () {
            return phoneNumber;
        }

        public void setPhoneNumber ( String phoneNumber){
            this.phoneNumber = phoneNumber;
        }

        public int getSalary () {
            return salary;
        }

        public void setSalary ( int salary){
            this.salary = salary;
        }

        public int getAge () {
            return age;
        }

        public void setAge ( int age){

        }

    }

