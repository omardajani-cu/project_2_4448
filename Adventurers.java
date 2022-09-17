package myprojects;

import java.util.ArrayList;
import java.util.Random;

public class Adventurers {

    ArrayList<Adventurers> activeAdventurers = new ArrayList<Adventurers>();

    String name = "Adventurer";
    Random rand = new Random();
    Room currentRoom = new Room("0-0-1", true, 0, false);
    public int points =0;
    public int lives = 3;
    public int hasTreasure = 0;


    //sets the player's current room stats
    void SetRoom(Room room){
        this.currentRoom.roomName = room.roomName;
        this.currentRoom.isCenterRoom = room.isCenterRoom;
        this.currentRoom.level = room.level;
        this.currentRoom.isTreasure = room.isTreasure;
    }

    //print out the player's room
    void GetRoom(){
        System.out.println("The current room is: " + currentRoom.roomName);
    }

    public String GetName(){
        System.out.println("Name: " + name);
        return this.name;
    }

        //simulates a dice roll
    public int Fight(){
        int diceRoll = rand.nextInt(7);
        System.out.println("Dice Roll Number: ");
        return diceRoll;
    }

    public boolean Treasure(){
        int treasureChance = rand.nextInt(3);
        if(treasureChance == 1){
            System.out.println("Found treasure!");
            return true;
        }
        System.out.println("No treasure found.");
        return false;
    }

    //takes in a boolean param, sets isTreasure to whatever is passed
    void SetTreasure(boolean treasure){
        if(treasure){
            hasTreasure += 1;
        }
    }

    public int GetTreasure(){
        System.out.println("How many treasures does Brawler have: " + hasTreasure);
        return hasTreasure;
    }

    void updatePoints(int p){
        this.points += p;
    }

    public int GetPoints(){
        System.out.println("Current Points: " + points);
        return points;
    }

    void updateLives(){
        this.lives = lives-1;
    }

    public int GetLives(){
        System.out.println("Current lives: " + lives);
        return lives;
    }


}

