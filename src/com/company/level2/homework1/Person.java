package com.company.level2.homework1;

public abstract class Person {
    private final int maxLength;
    private final int maxHeight;
    private final String name;
    private boolean active;

    public Person(String name, int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
        this.name = name;
        this.active = true;
    }

    protected int getMaxLength() {
        return maxLength;
    }

    protected int getMaxHeight() {
        return maxHeight;
    }

    public String getName(){
        return this.name;
    }

    protected void setInactive(){
        this.active = false;
    }

    public boolean isActive() {
        return this.active;
    }

    @Override
    public String toString() {
        return "Спортсмен " + name ;
    }
}