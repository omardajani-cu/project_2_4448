package com.project2;

public class Brawler extends Adventurer {

    public Brawler(){
        super();
    }

    public Brawler(String name){
        this.name = name;
    }

    public void move(){
        //stuff
    }

    @Override
    public int fight(){
        int diceRoll = rand.nextInt(7) + 2;
        return diceRoll;
    }
}
