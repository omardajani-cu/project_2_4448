package myprojects;

public class Runners extends Adventurers{
    String name = "Runner";

    //function to move rooms

    @Override
    public String GetName(){
        System.out.println("Name: " + name);
        return this.name;
    }

    void move(){
        int move1 = rand.nextInt(4);
            switch(move1){
                case 1:
                    System.out.println("Runner's first move is to move to a different room: ");
                    //move to next room
                    break;
                case 2:
                    System.out.println("Runner's first move is to fight the creature: ");
                    Fight();
                    break;
                case 3:
                    System.out.println("Runner's first move is to find treasure: ");
                    boolean foundTreasure = Treasure();
                    SetTreasure(foundTreasure);
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
                    Fight();
                    break;
                case 3:
                    System.out.println("Runner's second move is to find treasure: ");
                    boolean foundTreasure = Treasure();
                    SetTreasure(foundTreasure);
                    break;
            }
    }
}
