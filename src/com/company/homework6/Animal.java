package com.company.homework6;

public abstract class Animal {
   protected final String name;
     protected final int swim;
     protected final int run;

    public Animal(String name, int swim, int run){
          this.name = name;
          this.swim = swim;
          this.run = run;
      }

    public abstract void runPossibleLength();

    public abstract void swimPossibleLength();

    public String getName() {
        return name;
    }

    public int getSwim() {
        return swim;
    }

    public int getRun() {
        return run;
    }
}
