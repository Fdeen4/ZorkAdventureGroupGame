package com.company;

import java.util.Scanner;

public class ZorkAdventureGroupGame {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String answer = "";
        Foyer foyer = new Foyer();
        FrontRoom frontRoom = new FrontRoom();
        Library library = new Library();

        System.out.println(foyer.description());
        answer = keyboard.nextLine();

        while (!answer.equalsIgnoreCase("Q")) {
            if (answer.equalsIgnoreCase("north2")) {
                System.out.println("\n" + foyer.getFrontRoom());
                answer = keyboard.nextLine();

                if (answer.equalsIgnoreCase("south1")) {
                    System.out.println("\n" + foyer.description());
                    answer = keyboard.nextLine();
                } else if (answer.equalsIgnoreCase("west3")) {
                    System.out.println("\n" + frontRoom.getLibrary());
                    answer = keyboard.nextLine();

                    if (answer.equalsIgnoreCase("east2")) {
                        answer = "north2";
                    } else if (answer.equalsIgnoreCase("north5")) {
                        System.out.println("\n" + library.getDiningRoom());
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("south3")) {
                            System.out.println("\n" + frontRoom.getLibrary());
                            answer = keyboard.nextLine();
                        }
                    }
                }
            }
        }
    }
}