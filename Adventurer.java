import java.util.ArrayList;
public class Adventurer {
    protected ArrayList<Adventurer> activeAdventurers = new ArrayList<Adventurer>();

    public String name = "Adventurer";
    public int treasures_found = 0;
    public int lives = 3;

    //generate a random number between 1-6
    public int DiceRoll(){
        Random rand = new Random();
        int dice_num = rand.nextInt(6);
        return dice_num;
    }

    //roll 2 dice and add the results
    public int Fight(){
        int roll1 = DiceRoll();
        int roll2 = DiceRoll();
        return roll1 + roll2;
    }

    //if treasure is found, increase points
    public int Treasure(){
        points++;
        return points;
    }
    
}
