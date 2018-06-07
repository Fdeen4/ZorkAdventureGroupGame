package com.company;

public class Foyer extends ZorkAdventureGroupGame {

    public String startingPoint() {
        return "You are standing in the foyer of an old house.\n"
                + "You see a dead scorpion.\n" +
                "{You can exit to the north (2) or press Q to quit}";
    }

    public String getFrontRoom() {
        return "You are standing in the front room of an old house.\n"
                + "You see a piano.\n" +
                "{You can exit to the south (1), west (3), east (4), or press Q to quit}";
    }
}
