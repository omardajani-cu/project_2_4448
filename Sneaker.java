package com.project2;

public class Sneaker extends Adventurer {

    public Sneaker(){
        super();
    }

    public Sneaker(String name){
        this.name = name;
    }

    @Override
    public int fight(){
        int fightChance = rand.nextInt(3);
        if (fightChance == 1){
            int diceRoll = rand.nextInt(7);
            return diceRoll;
        }
        System.out.print("Sneaker does not fight.");
        return 0;
    }

    @Override
    public void move(){

    }
}
