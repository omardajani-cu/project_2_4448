package com.project2;

public class Sneakers extends Adventurers {
    String name = "Sneaker";

    @Override
    public String GetName(){
        System.out.println("Name: " + name);
        return this.name;
    }

    @Override
    public int Fight(){
        int fightChance = rand.nextInt(3);
        if (fightChance == 1){
            int diceRoll = rand.nextInt(7);
            return diceRoll;
        }
        System.out.print("Sneaker does not fight.");
        return 0;
    }
}
