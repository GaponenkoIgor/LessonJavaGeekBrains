package com.company.level2.homework1;


public class RunTrack implements Equipment  {

    int length;
    RunTrack(int length){
        this.length = length;
    }

    @Override
    public void interact(Athlete athlete) {
        athlete.run(this.length);

    }
}
