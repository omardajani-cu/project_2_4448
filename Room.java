import java.util.ArrayList;
public class Room {
    public String roomName;
    private int level;
    private boolean isCenterRoom;
    private ArrayList<Creature> creaturesInRoom = new ArrayList<Creature>();
    private ArrayList<Adventurer> adventurersInRoom = new ArrayList<Adventurer>();
    private ArrayList<Room> connectedRooms = new ArrayList<Room>();

    public Room(String roomName, boolean isCenterRoom, int level) {
        this.roomName = roomName;
        this.isCenterRoom = isCenterRoom;
        this.level = level;
    }

    public void AddCreature(Creature newCreature) {
        creaturesInRoom.add(newCreature);
    }

    public void RemoveCreature(Creature newCreature) {

    }

    public ArrayList<Creature> GetCreaturesInRoom() {
        return creaturesInRoom;
    }

    public void AddAdventurer(Adventurer newAdventurer) {
        adventurersInRoom.add(newAdventurer);
    }

    public void RemoveAdventurer(Adventurer newAdventurer) {

    }

    public ArrayList<Adventurer> GetAdventurersInRoom() {
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
