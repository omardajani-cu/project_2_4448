package com.project2;

import java.util.ArrayList;
import java.util.Random;

public class Creature {

    protected String name;

    protected Room location;
    protected Random rand = new Random();

    public Creature() {
    }

    public Creature(String name) {
        this.name = name;
    }

    public void move() {
        // TODO: implement basic Creature move method
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    public Room getLocation() {
        return location;
    }

    public void setLocation(Room location) {
        this.location = location;
    }

    public int fight(){
        int diceRoll = rand.nextInt(7);
        System.out.println("Dice Roll Score: ");
        return diceRoll;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Creature: [")
                .append("name=").append(name).append(", ")
                .append("roomName=").append(location.getName())
                .append("]");
        return sb.toString();
    }
}
