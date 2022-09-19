package com.project2;
public class Main {

    public static void main(String[] args) {
        // write your code here

        //Testing out Adventurers:

        //Test out Brawler
        Brawlers brawler = new Brawlers();
        brawler.GetName();
        brawler.GetRoom();
        brawler.Fight();
        boolean hasTreasure = brawler.Treasure();
        brawler.SetTreasure(hasTreasure);
        brawler.GetTreasure();

        brawler.GetPoints();
        brawler.updatePoints(10);
        brawler.GetPoints();

        brawler.GetLives();
        brawler.updateLives();
        brawler.GetLives();

        //Test out Sneaker

        //Test out Runner

        //Test out Thieves
    }
}
