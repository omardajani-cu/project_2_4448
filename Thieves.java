package myprojects;

public class Thieves extends Adventurers{
    String name = "Thief";

    @Override
    public String GetName(){
        System.out.println("Name: " + name);
        return this.name;
    }
}
