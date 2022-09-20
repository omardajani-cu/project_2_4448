package com.project2;

import java.util.ArrayList;
import java.util.List;

public class GameManager {

        public static List<Adventurer> adventurers = new ArrayList<>();
        public static List<Creature> creatures = new ArrayList<>();

        public static void createAdventurers() {
            Room room = new Room("0-1-1", true, 0);

                Brawler b = new Brawler("Brawler");
                b.setLocation(room);

                Runner r = new Runner("Runner");
                r.setLocation(room);

                Sneaker s = new Sneaker("Sneaker");
                s.setLocation(room);

                Thief t = new Thief("Thief");
                t.setLocation(room);

                adventurers.add(b);
                adventurers.add(r);
                adventurers.add(s);
                adventurers.add(t);

                room.addAdventurer(b);
                room.addAdventurer(r);
                room.addAdventurer(s);
                room.addAdventurer(t);

        }

        public static void printAdventurers() {
            for( Adventurer dude: adventurers) {
                System.out.println(dude.toString());
            }
        }

    public static void createCreatures() {
        Room room = new Room("2-1-1", false, 0);

        Blinker b = new Blinker("Blinker");
        b.setLocation(room);

        Seeker s = new Seeker("Seeker");
        s.setLocation(room);

        Orbiter o = new Orbiter("Orbiter");
        o.setLocation(room);

        creatures.add(b);
        creatures.add(s);
        creatures.add(o);

        room.addCreature(b);
        room.addCreature(s);
        room.addCreature(o);

    }

    public static void printCreatures() {
        for( Creature creep: creatures) {
            System.out.println(creep.toString());
        }
    }
        public static void main(String[] args) {
            createAdventurers();
            printAdventurers();
            createCreatures();
            printCreatures();


        int roomsPerLevel = 9;
        int levels = 4; // excluding first floor

        ArrayList<Room> rooms = new ArrayList<Room>();

        // create rooms on each level
        rooms.add(new Room("0-1-1", true, 0)); // creating ground level room

        int middleDigit = 0;
        int lastDigit = 0;
        for (int currentLevel = 1; currentLevel <= levels; currentLevel++) {
            middleDigit = 0;
            lastDigit = 0;
            for (int currentRoom = 0; currentRoom < roomsPerLevel; currentRoom++) {
                rooms.add(new Room((currentLevel + "-" + middleDigit + "-" + lastDigit), (currentRoom == 1), currentLevel));
                if (lastDigit >= 2) {
                    lastDigit = 0;
                    if (middleDigit > 2) middleDigit = 0; else middleDigit++;
                } else {
                    lastDigit++;
                }
            }
        }

        // setting up connect rooms
        int currentLevel = 1;
        int startingRoom = 1;

        while (currentLevel <= levels) {
            for (int workingRoom = startingRoom; workingRoom <= (startingRoom + 8); workingRoom++) {
                for (int roomToAdd = startingRoom; roomToAdd <= (startingRoom + 8); roomToAdd++) {
                    if (workingRoom != roomToAdd) {
                        rooms.get(workingRoom).AddConnectedRoom(rooms.get(roomToAdd));
                    }
                }
            }

            startingRoom = startingRoom + 9;
            currentLevel++;
        }

        for (int i = 0; i < rooms.size(); i++) {
            rooms.get(i).PrintNeighboringRooms();
        }





        Room currRoom; //current room
        Room nextRoom; //adjacent room
        Adventurer currAdventurer;
        Creature currCreature;
        int result1;
        int result2;
        for (int i = 0; i < rooms.size()-1; i++){ //go through every room and check for adventurers
            currRoom = rooms.get(i);
            nextRoom = rooms.get(i+1);
            for(int j = 0; j < currRoom.getAdventurersInRoom().size()-1; j++){ //for every adventurer in a room, make them move
                currAdventurer = currRoom.getAdventurersInRoom().get(j);
                currRoom.RemoveAdventurer(currAdventurer); //remove adventurer from current room
                nextRoom.addAdventurer(currAdventurer);// move adventurer to next room
                currAdventurer.location = nextRoom; //update adventurer location

                for(int m = 0; m < creatures.size()-1; m++){
                    currCreature = creatures.get(m);
                    if(creatures.get(m).location == nextRoom){ //if there's a creature with the same location as an adventurer
                        result1 = currAdventurer.fight(); //adventurer and creature roll dice
                        result2 = currCreature.fight();
                        if(result1 > result2){ //adventurer beat creature
                            nextRoom.RemoveCreature(currCreature); //creature dies, remove creature from room
                            creatures.remove(currCreature); //creature dies, removed from list
                            System.out.println("Creature died");
                        } else if (result1 == result2){
                            System.out.println("Tie");
                        } else {
                            currAdventurer.updateLives(); //adventurer loses a life
                        }
                    }
                }
            }
        }




    }




}
