package com.project2;

public class Orbiters extends Creatures{
    String name = "Orbiter";

    @Override
    public String GetName(){
        System.out.println("Name: " + name);
        return this.name;
    }


}
