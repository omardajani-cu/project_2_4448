package com.project2;

import java.util.ArrayList;
import java.util.Random;

public class Creatures {
    protected ArrayList<Creatures> activeCreatures = new ArrayList<Creatures>();

    String name = "Creature";
    Random rand = new Random();
    Room currentRoom = new Room("2-1-1",false, 2);
    public int lives = 1;

    void SetRoom(Room room){
        this.currentRoom.roomName = room.roomName;
        this.currentRoom.isCenterRoom = room.isCenterRoom;
        this.currentRoom.level = room.level;
    }

    void GetRoom(){
        System.out.println("The current room is: " + currentRoom.roomName);
    }

    public String GetName(){
        System.out.println("Name: " + name);
        return this.name;
    }

    public int Fight(){
        int diceRoll = rand.nextInt(7);
        System.out.println("Dice Roll Number: ");
        return diceRoll;
    }

    void updateLives(){
        this.lives = lives-1;
    }

    public int GetLives(){
        System.out.println("Current lives: " + lives);
        return lives;
    }
}
