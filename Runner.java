package com.project2;
public class Runner extends Adventurer {

    public Runner(){
        super();
    }

    public Runner(String name){
        this.name = name;
    }

    @Override
    public void move(){
        int move1 = rand.nextInt(4);
        switch(move1){
            case 1:
                System.out.println("Runner's first move is to move to a different room: ");
                //move to next room
                break;
            case 2:
                System.out.println("Runner's first move is to fight the creature: ");
                fight();
                break;
            case 3:
                System.out.println("Runner's first move is to find treasure: ");
                break;
        }

        int move2 = rand.nextInt(4);
        switch(move1){
            case 1:
                System.out.println("Runner's second move is to move to a different room: ");
                //move to next room
                break;
            case 2:
                System.out.println("Runner's second move is to fight the creature: ");
                fight();
                break;
            case 3:
                System.out.println("Runner's second move is to find treasure: ");
                break;
        }
    }
}
