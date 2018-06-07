package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ZorkAdventureGroupGame {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        CastleRooms castleRooms = new CastleRooms();
        String answer = "", formattedPersonalAmount = "";
        StringBuilder listOfItemsSeen = new StringBuilder();

        int numOfRoomsVisited = 1;
        double personalTotal = 0;
        boolean visitRoom2 = true, visitRoom3 = true, visitRoom4 = true, visitRoom5 = true,
                visitRoom6 = true, visitRoom7 = true, visitRoom8 = true;


        System.out.println("Initial amount is $" + personalTotal);
        System.out.println(castleRooms.getFoyer());
        answer = keyboard.nextLine();

        while (!answer.equalsIgnoreCase("2")) {
            System.out.println("North (2) or exit. Try again:");
            answer = keyboard.nextLine();
        }

        if (numOfRoomsVisited == 1) {
            listOfItemsSeen.append("dead scorpion.\n");
        }
        while (!answer.equalsIgnoreCase("Q")) {
            switch (answer) {
                case "1": personalTotal += (0.01 + Math.random() * 1000.0);
                        System.out.println("\n" + getPersonalTotal(personalTotal));
                            System.out.println(castleRooms.getFoyer());
                            answer = keyboard.nextLine();

                            while (!answer.equalsIgnoreCase("2")) {
                                if (answer.equalsIgnoreCase("exit")) {
                                    break;
                                }
                                System.out.println("North (2) or exit. Try again:");
                                answer = keyboard.nextLine();
                            }

                            if (answer.equalsIgnoreCase("exit")) {
                                System.out.println("\n" + castleRooms.exit());
                                System.out.println("\nNumber of rooms visited: " + numOfRoomsVisited);
                                System.out.println("\nItems seen: \n" + listOfItemsSeen.toString());
                                formattedPersonalAmount = String.format("%.02f",personalTotal);
                                System.out.println("Total amount is $" + formattedPersonalAmount);

                                System.exit(0);
                            }

                            break;

                case "2": personalTotal += (0.01 + Math.random() * 1000.0);
                    System.out.println("\n" + getPersonalTotal(personalTotal));
                        System.out.println(castleRooms.getFrontRoom());
                            answer = keyboard.nextLine();

                        while (!answer.equalsIgnoreCase("1") ) {
                            if (answer.equalsIgnoreCase("3")
                                    || answer.equalsIgnoreCase("4")) {
                                break;
                            }
                            System.out.println("West (3), East (4) or South (1). Try again:");
                            answer = keyboard.nextLine();

                        }

                        if (visitRoom2) {
                            numOfRoomsVisited++;
                            listOfItemsSeen.append("piano.\n");
                            visitRoom2 = false;
                        }
                            break;

                case "3": personalTotal += (0.01 + Math.random() * 1000.0);
                    System.out.println("\n" + getPersonalTotal(personalTotal));
                        System.out.println(castleRooms.getLibrary() );
                            answer = keyboard.nextLine();

                        while (!answer.equalsIgnoreCase("2") ) {
                            if (answer.equalsIgnoreCase("5")) {
                                break;
                            }
                            System.out.println("North (5), East (2). Try again:");
                            answer = keyboard.nextLine();
                        }

                        if (visitRoom3) {
                            numOfRoomsVisited++;
                            listOfItemsSeen.append("spiders.\n");
                            visitRoom3 = false;
                        }
                            break;

                case "4": personalTotal += (0.01 + Math.random() * 1000.0);
                    System.out.println("\n" + getPersonalTotal(personalTotal));
                        System.out.println(castleRooms.getKitchen() );
                            answer = keyboard.nextLine();

                        while (!answer.equalsIgnoreCase("2")) {
                            if (answer.equalsIgnoreCase("7")) {
                                break;
                            }
                            System.out.println("North (7), West (2). Try again:");
                            answer = keyboard.nextLine();
                        }

                        if (visitRoom4) {
                            numOfRoomsVisited++;
                            listOfItemsSeen.append("bats.\n");
                            visitRoom4 = false;
                        }
                            break;

                case "5": personalTotal += (0.01 + Math.random() * 1000.0);
                    System.out.println("\n" + getPersonalTotal(personalTotal));
                        System.out.println(castleRooms.getDiningRoom() );
                            answer = keyboard.nextLine();

                        while (!answer.equalsIgnoreCase("3") ) {
                            System.out.println("South (3). Try again:");
                            answer = keyboard.nextLine();
                        }

                        if (visitRoom5) {
                            numOfRoomsVisited++;
                            listOfItemsSeen.append("dust and empty box.\n");
                            visitRoom5 = false;
                        }

                            break;

                case "6": personalTotal += (0.01 + Math.random() * 1000.0);
                    System.out.println("\n" + getPersonalTotal(personalTotal));
                        System.out.println(castleRooms.getVault() );
                        answer = keyboard.nextLine();

                    while (!answer.equalsIgnoreCase("7")) {
                        System.out.println("East (7). Try again:");
                        answer = keyboard.nextLine();
                    }

                    if (visitRoom6) {
                        numOfRoomsVisited++;
                        listOfItemsSeen.append("three walking skeletons.\n");
                        visitRoom6 = false;
                    }

                    double random = Math.random();
                    answer = (random < 0.25) ? ("8") : ("7");
                            break;

                case "7": personalTotal += (0.01 + Math.random() * 1000.0);
                    System.out.println("\n" + getPersonalTotal(personalTotal));

                    System.out.println(castleRooms.getParlor());
                    answer = keyboard.nextLine();

                    while (!answer.equalsIgnoreCase("4")) {
                        if (answer.equalsIgnoreCase("6")) {
                            break;
                        }
                        System.out.println("West (6) or South (4). Try again:");
                        answer = keyboard.nextLine();
                    }

                    if (visitRoom7) {
                        numOfRoomsVisited++;
                        listOfItemsSeen.append("treasure chest.\n");
                        visitRoom7 = false;
                    }
                            break;

                case "8": personalTotal += (0.01 + Math.random() * 1000.0);
                    System.out.println("\n" + getPersonalTotal(personalTotal));

                    System.out.println(castleRooms.getSecretRoom());
                    answer = keyboard.nextLine();

                    while (!answer.equalsIgnoreCase("6")) {
                        System.out.println("West (6). Try again:");
                        answer = keyboard.nextLine();
                    }

                    if (visitRoom8) {
                        numOfRoomsVisited++;
                        listOfItemsSeen.append("piles of gold.\n");
                        visitRoom8 = false;
                    }
                            break;
            }
        }
    }

    private static String getPersonalTotal(double personalTotal) {
        String formattedPersonalAmount;
        formattedPersonalAmount = String.format("%.02f",personalTotal);
        return "Your current amount is $" + formattedPersonalAmount;
    }
}