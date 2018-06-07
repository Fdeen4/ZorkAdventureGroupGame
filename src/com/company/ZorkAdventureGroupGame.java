package com.company;

import java.util.Scanner;

public class ZorkAdventureGroupGame {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String answer = "";
        CastleRooms castleRooms = new CastleRooms();

        System.out.println(castleRooms.getFoyer());
        answer = keyboard.nextLine();

        while (!answer.equalsIgnoreCase("Q")) {
            switch (answer) {
                case "1": System.out.println("\n" + castleRooms.getFoyer());
                            answer = keyboard.nextLine();

                            if (answer.equalsIgnoreCase("exit")) {
                                System.out.println("\n" + castleRooms.exit());
                                System.exit(0);
                            }
                            break;
                case "2": System.out.println("\n" + castleRooms.getFrontRoom());
                            answer = keyboard.nextLine();
                            break;
                case "3": System.out.println("\n" + castleRooms.getLibrary());
                        answer = keyboard.nextLine();
                            break;
                case "4": System.out.println("\n" + castleRooms.getKitchen());
                            answer = keyboard.nextLine();
                            break;
                case "5": System.out.println("\n" + castleRooms.getDiningRoom());
                            answer = keyboard.nextLine();
                            break;
                case "6": System.out.println("\n" + castleRooms.getVault());
                            answer = keyboard.nextLine();
                            break;
                case "7": System.out.println("\n" + castleRooms.getParlor());
                            answer = keyboard.nextLine();
                            break;
            }
        }
    }
}