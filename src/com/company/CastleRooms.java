package com.company;

public class CastleRooms {

    public String getFoyerDescription() {
        return "You are standing in the foyer of an old house.\n"
                + "You see a dead scorpion.";
    }

    public String getFoyerDirection() {
        return "{You can go to the north, exit, or press Q to quit}";
    }

    public String getFrontRoomDescription() {
        return "You are standing in the front room of an old house.\n"
                + "You see a piano.";
    }

    public String getFrontRoomDirection() {
        return "{You can go to the south, west, east, or press Q to quit}";
    }

    public String getLibraryDescription() {
        return "You are standing in the library of an old house.\n"
                + "You see spiders.";
    }

    public String getLibraryDirection() {
        return "{You can go to the north, east, or press Q to quit}";
    }

    public String getDiningRoomDescription() {
        return "You are standing in the dinning room of an old house.\n"
                + "You see dust and an empty box.";
    }

    public String getDiningRoomDirection() {
        return "{You can go to the south or press Q to quit}";
    }

    public String getKitchenDescription() {
        return "You are standing in the kitchen of an old house.\n"
                + "You see bats.";
    }

    public String getKitchenDirection() {
        return "{You can go to the west, north, or press Q to quit}";
    }

    public String getParlorDescription() {

        return "You are standing in the parlor of an old house.\n"
                + "You see a treasure chest.";
    }

    public String getParlorDirection() {

        return "{You can go to the west, south, or press Q to quit}";
    }

    public String getSecretRoomDescription() {
        return "You are standing in the secret room of an old house.\n"
                + "You see piles of gold.";
    }

    public String getSecretRoomDirection() {
        return "{You can go to the west or press Q to quit}";
    }

    public String getVaultDescription() {
        return "You are standing in the vault of an old house.\n"
                + "You see three walking skeletons.";
    }

    public String getVaultDirection() {
        return "{You can go to the east or press Q to quit}";
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
