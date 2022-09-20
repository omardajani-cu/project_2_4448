package com.project2;
import java.util.ArrayList;
import java.util.List;


public class Room {

    private String name;
    private int level;
    private boolean isCenterRoom;

    private List<Creature> creaturesInRoom = new ArrayList<>();
    private List<Adventurer> adventurersInRoom = new ArrayList<>();
    private ArrayList<Room> connectedRooms = new ArrayList<>();

    public Room(String name, boolean isCenterRoom, int level) {
        this.name = name;
        this.isCenterRoom = isCenterRoom;
        this.level = level;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public boolean isCenterRoom(){
        return isCenterRoom;
    }

    public void setCenterRoom(boolean centerRoom){
        isCenterRoom = centerRoom;
    }

    public List<Creature> getCreaturesInRoom(){
        return creaturesInRoom;
    }

    public void setCreaturesInRoom(List<Creature> creaturesInRoom){
        this.creaturesInRoom = creaturesInRoom;
    }

    public List<Adventurer> getAdventurersInRoom(){
        return adventurersInRoom;
    }

    public void setAdventurersInRoom(List<Adventurer> adventurersInRoom){
        this.adventurersInRoom = adventurersInRoom;
    }

    public void addCreature(Creature newCreature) {
        creaturesInRoom.add(newCreature);
    }

    public void RemoveCreature(Creature newCreature) {
        creaturesInRoom.remove(newCreature);
    }


    public void addAdventurer(Adventurer newAdventurer) {
        adventurersInRoom.add(newAdventurer);
    }

    public void RemoveAdventurer(Adventurer newAdventurer) {
        adventurersInRoom.remove(newAdventurer);
    }

    public void AddConnectedRoom(Room room) {
        connectedRooms.add(room);
    }

    public ArrayList<Room> GetConnectedRooms() {
        return connectedRooms;
    }

    public void PrintNeighboringRooms() {
        System.out.println("Neighbors for " + name + ": ");
        for (int i = 0; i < connectedRooms.size(); i++) {
            System.out.print(connectedRooms.get(i).name + " ");
        }
        System.out.println("\n");
    }
}
