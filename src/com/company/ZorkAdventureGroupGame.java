package com.company;

import java.util.Scanner;

public class ZorkAdventureGroupGame {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String answer = "", formattedPersonalAmount = "";;
        double personalTotal = 0;
        CastleRooms castleRooms = new CastleRooms();

        System.out.println("Initial amount is $" + personalTotal);
        System.out.println(castleRooms.getFoyer());
        answer = keyboard.nextLine();

        while (!answer.equalsIgnoreCase("2")) {
            System.out.println("North (2) or exit. Try again:");
            answer = keyboard.nextLine();
        }

        int numOfRoomsVisited = 1;
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
                                System.out.println("Number of rooms visited: " + numOfRoomsVisited);
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
                            break;

                case "5": personalTotal += (0.01 + Math.random() * 1000.0);
                    System.out.println("\n" + getPersonalTotal(personalTotal));
                        System.out.println(castleRooms.getDiningRoom() );
                            answer = keyboard.nextLine();

                        while (!answer.equalsIgnoreCase("3") ) {
                            System.out.println("South (3). Try again:");
                            answer = keyboard.nextLine();
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
                            break;

                case "8": personalTotal += (0.01 + Math.random() * 1000.0);
                    System.out.println("\n" + getPersonalTotal(personalTotal));

                    System.out.println(castleRooms.getSecretRoom());
                    answer = keyboard.nextLine();

                    while (!answer.equalsIgnoreCase("6")) {
                        System.out.println("West (6). Try again:");
                        answer = keyboard.nextLine();
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