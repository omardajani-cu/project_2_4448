package com.project2;

public class Blinkers extends Creatures{
    String name = "Blinker";
    Room currentRoom = new Room("4-2-1", false, 4);

    @Override
    public String GetName(){
        System.out.println("Name: " + name);
        return this.name;
    }
}
