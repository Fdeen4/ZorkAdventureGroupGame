package com.company;

public class CastleRooms extends ZorkAdventureGroupGame {

    public String getFoyer() {
        return "You are standing in the foyer of an old house.\n"
                + "You see a dead scorpion.\n" +
                "{You can exit to the north (2) or press Q to quit}";
    }

    public String getFrontRoom() {
        return "You are standing in the front room of an old house.\n"
                + "You see a piano.\n" +
                "{You can exit to the south (1), west (3), east (4), or press Q to quit}";
    }

    public String getLibrary() {
        return "You are standing in the library of an old house.\n"
                + "You see spiders. \n" +
                "{You can exit to the north (5), east (2), or press Q to quit}";
    }

    public String getDiningRoom() {
        return "You are standing in the dinning room of an old house.\n"
                + "You see dust and an empty box. \n" +
                "{You can exit to the south (3) or press Q to quit}";
    }

    public String getKitchen() {
        return "You are standing in the kitchen of an old house.\n"
                + "You see bats. \n" +
                "{You can exit to the west (2), north (7), or press Q to quit}";
    }

    public String getParlor() {

        return "You are standing in the parlor of an old house.\n"
                    + "You see a treasure chest.\n" +
                    "{You can exit to the west (6), south (4), or press Q to quit}";

    }

    public String getSecretRoom() {
        return "You are standing in the secret room of an old house.\n"
                + "You see piles of gold.\n" +
                "{You can exit to the west (6) or press Q to quit}";
    }

    public String getVault() {
        return "You are standing in the vault of an old house.\n"
                + "You see three walking skeletons.\n" +
                "{You can exit to the east (7), or press Q to quit}";
    }

    public String exit() {

        double random = Math.random();

        if (random < 0.25)
            return "You're outside the castle.\n"
                    + "Be careful, you're being followed by ghosts. Run as fast as you can!";
        else
            return "You're outside the castle. Thank you for playing!";

    }
}
