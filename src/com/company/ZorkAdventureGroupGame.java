package com.company;

import java.util.Scanner;

public class ZorkAdventureGroupGame {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String answer = "";
        Foyer foyer = new Foyer();
        FrontRoom frontRoom = new FrontRoom();
        Library library = new Library();
        Kitchen kitchen = new Kitchen();
        Parlor parlor = new Parlor();

        System.out.println(foyer.startingPoint());
        answer = keyboard.nextLine();

        while (!answer.equalsIgnoreCase("Q")) {
            switch (answer) {
                case "1": System.out.println("\n" + foyer.startingPoint());
                            answer = keyboard.nextLine();
                            break;
                case "2": System.out.println("\n" + foyer.getFrontRoom());
                            answer = keyboard.nextLine();
                            break;
                case "3": System.out.println("\n" + frontRoom.getLibrary());
                        answer = keyboard.nextLine();
                            break;
                case "4": System.out.println("\n" + frontRoom.getKitchen());
                            answer = keyboard.nextLine();
                            break;
                case "5": System.out.println("\n" + library.getDiningRoom());
                            answer = keyboard.nextLine();
                            break;
                case "6": System.out.println("\n" + parlor.getVault());
                            answer = keyboard.nextLine();
                            break;
                case "7": System.out.println("\n" + kitchen.getParlor());
                            answer = keyboard.nextLine();
                            break;
            }
        }
    }
}