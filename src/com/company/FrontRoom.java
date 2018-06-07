package com.company;

public class FrontRoom {

    public String getLibrary() {
        return "You are standing in the library of an old house.\n"
                + "You see spiders. \n" +
                "{You can exit to the north (5), east (2), or press Q to quit}";
    }

    public String getKitchen() {
        return "You are standing in the kitchen of an old house.\n"
                + "You see bats. \n" +
                "{You can exit to the west (2), north (7), or press Q to quit}";
    }
}
