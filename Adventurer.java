package com.project2;


import java.util.ArrayList;
import java.util.Random;

public class Adventurer {


    protected String name;

    protected Room location;
    protected Random rand = new Random();

    protected int points =0;
    protected int lives = 3;

    protected int numTreasure = 0;


    public Adventurer(){

    }

    public Adventurer(String name){
        this.name = name;
    }

    public void move(){
        //TODO
    }

    public int fight(){
        int diceRoll = rand.nextInt(7);
        System.out.println("Dice Roll Score: ");
        return diceRoll;
    }

    public boolean getTreasure(){
        int treasureChance = rand.nextInt(3);
        if(treasureChance == 1){
            System.out.println("Found treasure!");
            return true;
        }
        System.out.println("No treasure found.");
        return false;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getLives(){
        return lives;
    }

    public void setLives(int lives){
        this.lives = lives;
    }

    void updateLives(){
        this.lives = lives-1;
    }

    public int getNumTreasure(){
        return numTreasure;
    }

    void updatePoints(int p){
        this.points += p;
    }

    public int GetPoints(){
        System.out.println("Current Points: ");
        return points;
    }

    public Room getLocation(){
        return location;
    }

    public void setLocation(Room location){
        this.location = location;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Adventurer: [")
                .append("name=").append(name).append(", ")
                .append("roomName=").append(location.getName())
                .append("]");
        return sb.toString();
    }

}

