package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class ZorkAdventureGroupGame {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        CastleRooms castleRooms = new CastleRooms();
        String answer ="1", formattedPersonalAmount;
        HashMap<Integer, String> roomMap = new HashMap<>();
        HashMap<Integer, Double> personalTotalMap = new HashMap<>();

        boolean startOfGame = true, visitedSecretRoom = false;
        double personalTotal = 0;

        while (!answer.equalsIgnoreCase("Q")) {
            switch (answer) {
                case "1":
                    if (startOfGame) {
                        personalTotal = 0;
                        startOfGame = false;
                    }

                    System.out.println("\nYour current amount is $" + getPersonalTotal(personalTotal));
                    personalTotalMap.putIfAbsent(1, 0.01 + Math.random() * 1000.0);
                    System.out.println(castleRooms.getFoyerDescription());
                    if (personalTotalMap.get(1) != 0.0) {
                    System.out.println("You found $" + getPersonalTotal(personalTotalMap.get(1))
                            + ".\nWould you like to take it (\"y\" or \"n\")?");
                    answer = keyboard.nextLine();
                    }

                    if (answer.equalsIgnoreCase("y")) {
                        personalTotal += (personalTotalMap.get(1));
                        personalTotalMap.replace(1, 0.0);
                    }
                    System.out.println(castleRooms.getFoyerDirection());
                    answer = keyboard.nextLine();

                    if (answer.equalsIgnoreCase("north"))
                        answer = "2";

                    while (!answer.equalsIgnoreCase("2")) {
                        if (answer.equalsIgnoreCase("exit")
                                || answer.equalsIgnoreCase("Q")) {
                            break;
                        }
                        System.out.println("North or exit. Try again:");
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("north"))
                            answer = "2";
                    }

                    if (answer.equalsIgnoreCase("exit")) {
                        if (visitedSecretRoom) {
                            System.out.println("\n\n\n" + castleRooms.exit());
                            System.out.println("\nNumber of rooms visited: " + roomMap.size());
                            System.out.println("\nItems seen:");
                            for(String item : roomMap.values()) {
                                System.out.println("* " + item);
                            }
                            System.out.println("\nTotal amount is $" + String.format("%.02f", personalTotal));

                            System.exit(0);
                        } else {
                            answer = "Q";
                        }
                    }

                    roomMap.putIfAbsent(1, "dead scorpion");
                    break;

                case "2":
                    System.out.println("\nYour current amount is $" + getPersonalTotal(personalTotal));
                    personalTotalMap.putIfAbsent(2, 0.01 + Math.random() * 1000.0);
                    System.out.println(castleRooms.getFrontRoomDescription());
                    if (personalTotalMap.get(2) != 0.0) {
                        System.out.println("You found $" + getPersonalTotal(personalTotalMap.get(2))
                                + ".\nWould you like to take it (\"y\" or \"n\")?");
                        answer = keyboard.nextLine();
                    }
                    if (answer.equalsIgnoreCase("y")) {
                        personalTotal += (personalTotalMap.get(2));
                        personalTotalMap.replace(2, 0.0);
                    }

                    System.out.println(castleRooms.getFrontRoomDirection());
                    answer = keyboard.nextLine();

                    if (answer.equalsIgnoreCase("south"))
                    answer = "1";
                    else if (answer.equalsIgnoreCase("west"))
                        answer = "3";
                    else if (answer.equalsIgnoreCase("east"))
                        answer = "4";

                    while (!answer.equalsIgnoreCase("1") ) {
                        if (answer.equalsIgnoreCase("3")
                                || answer.equalsIgnoreCase("4")
                                || answer.equalsIgnoreCase("Q")) {
                            break;
                        }
                        System.out.println("West, East or South. Try again:");
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("south"))
                            answer = "1";
                        else if (answer.equalsIgnoreCase("west"))
                            answer = "3";
                        else if (answer.equalsIgnoreCase("east"))
                            answer = "4";

                    }

                    roomMap.putIfAbsent(2, "piano");
                    break;

                case "3":
                    System.out.println("\nYour current amount is $" + getPersonalTotal(personalTotal));
                    personalTotalMap.putIfAbsent(3, 0.01 + Math.random() * 1000.0);
                    System.out.println(castleRooms.getLibraryDescription());
                    if (personalTotalMap.get(3) != 0.0) {
                        System.out.println("You found $" + getPersonalTotal(personalTotalMap.get(3))
                                + ".\nWould you like to take it (\"y\" or \"n\")?");
                        answer = keyboard.nextLine();
                    }
                    if (answer.equalsIgnoreCase("y")) {
                        personalTotal += (personalTotalMap.get(3));
                        personalTotalMap.replace(3, 0.0);
                    }
                    System.out.println(castleRooms.getLibraryDirection());
                    answer = keyboard.nextLine();

                    if (answer.equalsIgnoreCase("north"))
                        answer = "5";
                    else if (answer.equalsIgnoreCase("east"))
                        answer = "2";

                    while (!answer.equalsIgnoreCase("2") ) {
                        if (answer.equalsIgnoreCase("5")
                                || answer.equalsIgnoreCase("Q")) {
                            break;
                        }
                        System.out.println("North or East. Try again:");
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("north"))
                            answer = "5";
                        else if (answer.equalsIgnoreCase("east"))
                            answer = "2";
                    }

                    roomMap.putIfAbsent(3, "spiders");
                    break;

                case "4":
                    System.out.println("\nYour current amount is $" + getPersonalTotal(personalTotal));
                    personalTotalMap.putIfAbsent(4, 0.01 + Math.random() * 1000.0);
                    System.out.println(castleRooms.getKitchenDescription());
                    if (personalTotalMap.get(4) != 0.0) {
                        System.out.println("You found $" + getPersonalTotal(personalTotalMap.get(4))
                                + ".\nWould you like to take it (\"y\" or \"n\")?");
                        answer = keyboard.nextLine();
                    }
                    if (answer.equalsIgnoreCase("y")) {
                        personalTotal += (personalTotalMap.get(4));
                        personalTotalMap.replace(4, 0.0);
                    }
                    System.out.println(castleRooms.getKitchenDirection());
                    answer = keyboard.nextLine();

                    if (answer.equalsIgnoreCase("north"))
                        answer = "7";
                    else if (answer.equalsIgnoreCase("west"))
                        answer = "2";

                    while (!answer.equalsIgnoreCase("2")) {
                        if (answer.equalsIgnoreCase("7")
                                || answer.equalsIgnoreCase("Q")) {
                            break;
                        }
                        System.out.println("North or West. Try again:");
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("north"))
                            answer = "7";
                        else if (answer.equalsIgnoreCase("west"))
                            answer = "2";
                    }

                    roomMap.putIfAbsent(4, "bats");
                    break;

                case "5":
                    System.out.println("\nYour current amount is $" + getPersonalTotal(personalTotal));
                    personalTotalMap.putIfAbsent(5, 0.01 + Math.random() * 1000.0);
                    System.out.println(castleRooms.getDiningRoomDescription());
                    if (personalTotalMap.get(5) != 0.0) {
                        System.out.println("You found $" + getPersonalTotal(personalTotalMap.get(5))
                                + ".\nWould you like to take it (\"y\" or \"n\")?");
                        answer = keyboard.nextLine();
                    }
                    if (answer.equalsIgnoreCase("y")) {
                        personalTotal += (personalTotalMap.get(5));
                        personalTotalMap.replace(5, 0.0);
                    }
                    System.out.println(castleRooms.getDiningRoomDirection());
                    answer = keyboard.nextLine();

                    if (answer.equalsIgnoreCase("south"))
                        answer = "3";

                    while (!answer.equalsIgnoreCase("3") ) {
                        if (answer.equalsIgnoreCase("Q")) {
                            break;
                        }
                        System.out.println("South. Try again:");
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("south"))
                            answer = "3";
                    }

                    roomMap.putIfAbsent(5, "dust and empty box");
                    break;

                case "6":
                    System.out.println("\nYour current amount is $" + getPersonalTotal(personalTotal));
                    personalTotalMap.putIfAbsent(6, 0.01 + Math.random() * 1000.0);
                    System.out.println(castleRooms.getVaultDescription());
                    if (personalTotalMap.get(6) != 0.0) {
                        System.out.println("You found $" + getPersonalTotal(personalTotalMap.get(6))
                                + ".\nWould you like to take it (\"y\" or \"n\")?");
                        answer = keyboard.nextLine();
                    }
                    if (answer.equalsIgnoreCase("y")) {
                        personalTotal += (personalTotalMap.get(6));
                        personalTotalMap.replace(6, 0.0);
                    }
                    System.out.println(castleRooms.getVaultDirection());
                    answer = keyboard.nextLine();

                    if (answer.equalsIgnoreCase("east")) {
                        double random = Math.random();
                        answer = (random < 0.25) ? ("8") : ("7");
                    }

                    while (!answer.equalsIgnoreCase("7")) {
                        if (answer.equalsIgnoreCase("Q") ||
                                answer.equalsIgnoreCase("8")) {
                            break;
                        }
                        System.out.println("East. Try again:");
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("east"))
                            answer = "7";
                    }

                    roomMap.putIfAbsent(6, "three walking skeletons");

                    break;

                case "7":
                    System.out.println("\nYour current amount is $" + getPersonalTotal(personalTotal));
                    personalTotalMap.putIfAbsent(7, 0.01 + Math.random() * 1000.0);
                    System.out.println(castleRooms.getParlorDescription());
                    if (personalTotalMap.get(7) != 0.0) {
                        System.out.println("You found $" + getPersonalTotal(personalTotalMap.get(7))
                                + ".\nWould you like to take it (\"y\" or \"n\")?");
                        answer = keyboard.nextLine();
                    }
                    if (answer.equalsIgnoreCase("y")) {
                        personalTotal += (personalTotalMap.get(7));
                        personalTotalMap.replace(7, 0.0);
                    }
                    System.out.println(castleRooms.getParlorDirection());
                    answer = keyboard.nextLine();

                    if (answer.equalsIgnoreCase("west"))
                        answer = "6";
                    else if (answer.equalsIgnoreCase("south"))
                        answer = "4";

                    while (!answer.equalsIgnoreCase("4")) {
                        if (answer.equalsIgnoreCase("6")
                                || answer.equalsIgnoreCase("Q")) {
                            break;
                        }
                        System.out.println("West or South. Try again:");
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("west"))
                            answer = "6";
                        else if (answer.equalsIgnoreCase("south"))
                            answer = "4";
                    }

                    roomMap.putIfAbsent(7, "treasure chest");
                    break;

                case "8":
                    System.out.println("\nYour current amount is $" + getPersonalTotal(personalTotal));
                    personalTotalMap.putIfAbsent(8, 0.01 + Math.random() * 1000.0);
                    System.out.println(castleRooms.getSecretRoomDescription());
                    if (personalTotalMap.get(8) != 0.0) {
                        System.out.println("You found $" + getPersonalTotal(personalTotalMap.get(8))
                                + ".\nWould you like to take it (\"y\" or \"n\")?");
                        answer = keyboard.nextLine();
                    }
                    if (answer.equalsIgnoreCase("y")) {
                        personalTotal += (personalTotalMap.get(8));
                        personalTotalMap.replace(8, 0.0);
                    }
                    System.out.println(castleRooms.getSecretRoomDirection());
                    answer = keyboard.nextLine();

                    if (answer.equalsIgnoreCase("west"))
                        answer = "6";

                    while (!answer.equalsIgnoreCase("6")) {
                        if (answer.equalsIgnoreCase("Q")) {
                            break;
                        }
                        System.out.println("West. Try again:");
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("west"))
                            answer = "6";
                    }

                    roomMap.putIfAbsent(8, "piles of gold");
                    visitedSecretRoom = true;
                    break;
            }
        }
        System.out.println("\n\n\n" + castleRooms.exit());
        System.out.println("\nNumber of rooms visited: " + roomMap.size());
        System.out.println("\nItems seen:");
        for(String item : roomMap.values()) {
            System.out.println("* " + item);
        }
        System.out.println("\nTotal amount is $" + String.format("%.02f", personalTotal));
    }

    private static String getPersonalTotal(double personalTotal) {
        String formattedPersonalAmount  = String.format("%.02f",personalTotal);
        return formattedPersonalAmount;
    }
}