package com.project2;

public class Seekers extends Creatures{
    String name = "Seeker";
    Room currentRoom = new Room("4-1-1", false, 4);

    @Override
    public String GetName(){
        System.out.println("Name: " + name);
        return this.name;
    }


}
