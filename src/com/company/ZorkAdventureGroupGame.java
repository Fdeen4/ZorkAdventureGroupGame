package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class ZorkAdventureGroupGame {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        CastleRooms castleRooms = new CastleRooms();
        String answer ="1", formattedPersonalAmount;
        HashMap<Integer, String> roomMap = new HashMap<>();

        boolean startOfGame = true, visitedSecretRoom = false;
        double personalTotal = 0;

        while (!answer.equalsIgnoreCase("Q")) {
            switch (answer) {
                case "1":
                    if (startOfGame) {
                        personalTotal = 0;
                        startOfGame = false;
                    } else {
                        personalTotal += (0.01 + Math.random() * 1000.0);
                    }
                    System.out.println("\n" + getPersonalTotal(personalTotal));
                    System.out.println(castleRooms.getFoyer());
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
                            System.out.println("\n" + castleRooms.exit());
                            System.out.println("\nNumber of rooms visited: " + roomMap.size());
                            System.out.println("\nItems seen: \n" + roomMap.values());
                            formattedPersonalAmount = String.format("%.02f", personalTotal);
                            System.out.println("Total amount is $" + formattedPersonalAmount);

                            System.exit(0);
                        } else {
                            answer = "Q";
                        }
                    }

                    roomMap.putIfAbsent(1, "dead scorpion");
                    break;

                case "2": personalTotal += (0.01 + Math.random() * 1000.0);
                    System.out.println("\n" + getPersonalTotal(personalTotal));
                    System.out.println(castleRooms.getFrontRoom());
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

                case "3": personalTotal += (0.01 + Math.random() * 1000.0);
                    System.out.println("\n" + getPersonalTotal(personalTotal));
                    System.out.println(castleRooms.getLibrary() );
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

                case "4": personalTotal += (0.01 + Math.random() * 1000.0);
                    System.out.println("\n" + getPersonalTotal(personalTotal));
                    System.out.println(castleRooms.getKitchen());
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

                case "5": personalTotal += (0.01 + Math.random() * 1000.0);
                    System.out.println("\n" + getPersonalTotal(personalTotal));
                    System.out.println(castleRooms.getDiningRoom() );
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

                case "6": personalTotal += (0.01 + Math.random() * 1000.0);
                    System.out.println("\n" + getPersonalTotal(personalTotal));
                    System.out.println(castleRooms.getVault() );
                    answer = keyboard.nextLine();

                    if (answer.equalsIgnoreCase("east"))
                        answer = "7";

                    while (!answer.equalsIgnoreCase("7")) {
                        if (answer.equalsIgnoreCase("Q")) {
                            break;
                        }
                        System.out.println("East. Try again:");
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("east"))
                            answer = "7";
                    }

                    roomMap.putIfAbsent(6, "three walking skeletons");

                    double random = Math.random();
                    answer = (random < 0.25) ? ("8") : ("7");
                    break;

                case "7": personalTotal += (0.01 + Math.random() * 1000.0);
                    System.out.println("\n" + getPersonalTotal(personalTotal));

                    System.out.println(castleRooms.getParlor());
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

                case "8": personalTotal += (0.01 + Math.random() * 1000.0);
                    System.out.println("\n" + getPersonalTotal(personalTotal));

                    System.out.println(castleRooms.getSecretRoom());
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
        System.out.println("\n" + castleRooms.exit());
        System.out.println("\nNumber of rooms visited: " + roomMap.size());
        System.out.println("\nItems seen: \n" + roomMap.values());
        formattedPersonalAmount = String.format("%.02f", personalTotal);
        System.out.println("Total amount is $" + formattedPersonalAmount);
    }

    private static String getPersonalTotal(double personalTotal) {
        String formattedPersonalAmount;
        formattedPersonalAmount = String.format("%.02f",personalTotal);
        return "Your current amount is $" + formattedPersonalAmount;
    }
}