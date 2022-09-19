package com.project2;
import java.util.ArrayList;


public class Room {
    public String roomName;
    public int level;
    public boolean isCenterRoom;
    private ArrayList<Creatures> creaturesInRoom = new ArrayList<Creatures>();
    private ArrayList<Adventurers> adventurersInRoom = new ArrayList<Adventurers>();
    private ArrayList<Room> connectedRooms = new ArrayList<Room>();

    public Room(String roomName, boolean isCenterRoom, int level) {
        this.roomName = roomName;
        this.isCenterRoom = isCenterRoom;
        this.level = level;
    }

    public void AddCreature(Creatures newCreature) {
        creaturesInRoom.add(newCreature);
    }

    public void RemoveCreature(Creatures newCreature) {

    }

    public ArrayList<Creatures> GetCreaturesInRoom() {
        return creaturesInRoom;
    }

    public void AddAdventurer(Adventurers newAdventurer) {
        adventurersInRoom.add(newAdventurer);
    }

    public void RemoveAdventurer(Adventurers newAdventurer) {

    }

    public ArrayList<Adventurers> GetAdventurersInRoom() {
        return adventurersInRoom;
    }

    public void AddConnectedRoom(Room room) {
        connectedRooms.add(room);
    }

    public ArrayList<Room> GetConnectedRooms() {
        return connectedRooms;
    }

    public void PrintNeighboringRooms() {
        System.out.println("Neighbors for " + roomName + ": ");
        for (int i = 0; i < connectedRooms.size(); i++) {
            System.out.print(connectedRooms.get(i).roomName + " ");
        }
        System.out.println("\n");
    }
}
