package com.company;

public class CastleRooms {

    public String getFoyer() {
        return "You are standing in the foyer of an old house.\n"
                + "You see a dead scorpion.\n" +
                "{You can go to the north, exit, or press Q to quit}";
    }

    public String getFrontRoom() {
        return "You are standing in the front room of an old house.\n"
                + "You see a piano.\n" +
                "{You can go to the south, west, east, or press Q to quit}";
    }

    public String getLibrary() {
        return "You are standing in the library of an old house.\n"
                + "You see spiders. \n" +
                "{You can go to the north, east, or press Q to quit}";
    }

    public String getDiningRoom() {
        return "You are standing in the dinning room of an old house.\n"
                + "You see dust and an empty box. \n" +
                "{You can go to the south or press Q to quit}";
    }

    public String getKitchen() {
        return "You are standing in the kitchen of an old house.\n"
                + "You see bats. \n" +
                "{You can go to the west, north, or press Q to quit}";
    }

    public String getParlor() {

        return "You are standing in the parlor of an old house.\n"
                + "You see a treasure chest.\n" +
                "{You can go to the west, south, or press Q to quit}";
    }

    public String getSecretRoom() {
        return "You are standing in the secret room of an old house.\n"
                + "You see piles of gold.\n" +
                "{You can go to the west or press Q to quit}";
    }

    public String getVault() {
        return "You are standing in the vault of an old house.\n"
                + "You see three walking skeletons.\n" +
                "{You can go to the east or press Q to quit}";
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
