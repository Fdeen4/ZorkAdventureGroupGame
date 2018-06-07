package com.company;

public class Foyer extends ZorkAdventureGroupGame {

    public String description() {
        return "You are standing in the foyer of an old house.\n"
                + "You see a dead scorpion.\n" +
                "{You can exit to the \"north2\" or press Q to quit}";
    }

    public String getFrontRoom() {
        return "You are standing in the front room of an old house.\n"
                + "You see a piano.\n" +
                "{You can exit to the \"south1\", \"west3\", \"east4\", or press Q to quit}";
    }
}
