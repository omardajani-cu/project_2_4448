import java.util.ArrayList;

public class GameManager {
    public static void main(String[] args) {
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
    }
}
