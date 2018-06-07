package com.company;

import java.util.Random;

public class Kitchen {

    public String getParlor() {

        Random random = new Random();

        if (random.nextInt(3) == 1)
            return "You are standing in the secret room of an old house.\n"
                    + "You see piles of gold.\n" +
                    "{You can exit to the west (6) or press Q to quit}";
        else
            return "You are standing in the parlor of an old house.\n"
                    + "You see a treasure chest.\n" +
                    "{You can exit to the west (6), south (4), or press Q to quit}";

    }
}
