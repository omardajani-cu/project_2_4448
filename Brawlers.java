package com.project2;

public class Brawlers extends Adventurers {
    String name = "Brawler";

    @Override
    public String GetName(){
        System.out.println("Name: " + name);
        return this.name;
    }

    @Override
    public int Fight(){
        int diceRoll = rand.nextInt(7) + 2;
        return diceRoll;
    }
}
