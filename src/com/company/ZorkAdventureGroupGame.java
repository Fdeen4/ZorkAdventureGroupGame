package com.company;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class ZorkAdventureGroupGame {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        CastleRooms castleRooms = new CastleRooms();
        Random random = new Random();
        String answer ="1", evilCharacterPresence, lamp;
        HashMap<Integer, String> roomItemsMap = new HashMap<>();
        HashMap<Integer, String> roomLampItemsMap = new HashMap<>();
        HashMap<Integer, Double> personalTotalMap = new HashMap<>();

        boolean startOfGame = true, isSecretRevealed=false;
        double personalTotal = 0;

        while (!answer.equalsIgnoreCase("Q")) {
            switch (answer) {
                case "1":
                    if (startOfGame) {
                        personalTotal = 0;
                        startOfGame = false;
                    } else {
                        evilCharacterPresence = Integer.toString(1 + random.nextInt(8));
                        if (evilCharacterPresence.equalsIgnoreCase("1")) {
                            if (random.nextBoolean()) {
                                output(castleRooms.moneyStolen());
                                personalTotal = 0;
                            } else {
                                output(castleRooms.moneyNotStolen());
                            }
                        }
                    }

                    lamp = Integer.toString(1 + random.nextInt(8));

                    output("\nYour current amount is $" + convertToTwoDecimalPlaces(personalTotal));
                    personalTotalMap.putIfAbsent(1, 0.01 + Math.random() * 1000.0);
                    output(castleRooms.getFoyerDescription());
                    if (personalTotalMap.get(1) != 0.0) {
                        output(castleRooms.askToTakeMoney(
                                convertToTwoDecimalPlaces(personalTotalMap.get(1))));
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("y")) {
                            personalTotal += (personalTotalMap.get(1));
                            personalTotalMap.replace(1, 0.0);
                        }
                    }

                    if (lamp.equalsIgnoreCase("1")) {
                        if (!roomLampItemsMap.containsValue("lamp")) {
                            output(castleRooms.askToTakeLamp());
                            answer = keyboard.nextLine();
                            if (answer.equalsIgnoreCase("y")) {
                                roomLampItemsMap.put(1, "lamp");
                            }
                        }
                    }

                    if (roomLampItemsMap.containsValue("lamp")) {
                        if (!roomLampItemsMap.containsKey(2)) {
                            output(castleRooms.getLampFoyerDescription());
                            answer = keyboard.nextLine();

                            if (answer.equalsIgnoreCase("y")) {
                                output("Nice!");
                                roomLampItemsMap.put(2, "gold coins");
                            } else {
                                output("Okay, let's continue.");
                            }
                        }
                    }

                    output(castleRooms.getFoyerDirection());
                    answer = keyboard.nextLine();

                    if (answer.equalsIgnoreCase("north"))
                        answer = "2";

                    while (!answer.equalsIgnoreCase("2")) {
                        if (answer.equalsIgnoreCase("Q")) {
                            break;
                        }
                        output("North. Try again:");
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("north"))
                            answer = "2";
                    }

                    roomItemsMap.putIfAbsent(1, "dead scorpion");
                    break;

                case "2":

                    evilCharacterPresence = Integer.toString(1 + random.nextInt(8));
                    if (evilCharacterPresence.equalsIgnoreCase("2")) {
                        if (random.nextBoolean()) {
                            output(castleRooms.moneyStolen());
                            personalTotal = 0;
                        } else {
                            output(castleRooms.moneyNotStolen());
                        }
                    }

                    lamp = Integer.toString(1 + random.nextInt(8));

                    output("\nYour current amount is $" + convertToTwoDecimalPlaces(personalTotal));
                    personalTotalMap.putIfAbsent(2, 0.01 + Math.random() * 1000.0);
                    output(castleRooms.getFrontRoomDescription());
                    if (personalTotalMap.get(2) != 0.0) {
                        output(castleRooms.askToTakeMoney(
                                convertToTwoDecimalPlaces(personalTotalMap.get(2))));
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("y")) {
                            personalTotal += (personalTotalMap.get(2));
                            personalTotalMap.replace(2, 0.0);
                        }
                    }

                    if (lamp.equalsIgnoreCase("2")) {
                        if (!roomLampItemsMap.containsValue("lamp")) {
                            output(castleRooms.askToTakeLamp());
                            answer = keyboard.nextLine();
                            if (answer.equalsIgnoreCase("y")) {
                                roomLampItemsMap.put(1, "lamp");
                            }
                        }
                    }

                    if (roomLampItemsMap.containsValue("lamp")) {
                        output(castleRooms.getLampFrontRoomDescription());
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("y")) {
                            output(castleRooms.playSong());
                        } else {
                            output("Come on! Fine, let's not play the music.");
                        }
                    }

                    output(castleRooms.getFrontRoomDirection());
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
                        output("West, East or South. Try again:");
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("south"))
                            answer = "1";
                        else if (answer.equalsIgnoreCase("west"))
                            answer = "3";
                        else if (answer.equalsIgnoreCase("east"))
                            answer = "4";

                    }

                    roomItemsMap.putIfAbsent(2, "piano");
                    break;

                case "3":

                    evilCharacterPresence = Integer.toString(1 + random.nextInt(8));
                    if (evilCharacterPresence.equalsIgnoreCase("3")) {
                        if (random.nextBoolean()) {
                            output(castleRooms.moneyStolen());
                            personalTotal = 0;
                        } else {
                            output(castleRooms.moneyNotStolen());
                        }
                    }

                    lamp = Integer.toString(1 + random.nextInt(8));

                    output("\nYour current amount is $" + convertToTwoDecimalPlaces(personalTotal));
                    personalTotalMap.putIfAbsent(3, 0.01 + Math.random() * 1000.0);
                    output(castleRooms.getLibraryDescription());
                    if (personalTotalMap.get(3) != 0.0) {
                        output(castleRooms.askToTakeMoney(
                                convertToTwoDecimalPlaces(personalTotalMap.get(3))));
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("y")) {
                            personalTotal += (personalTotalMap.get(3));
                            personalTotalMap.replace(3, 0.0);
                        }
                    }

                    if (lamp.equalsIgnoreCase("3")) {
                        if (!roomLampItemsMap.containsValue("lamp")) {
                            output(castleRooms.askToTakeLamp());
                            answer = keyboard.nextLine();
                            if (answer.equalsIgnoreCase("y")) {
                                roomLampItemsMap.put(1, "lamp");
                            }
                        }
                    }

                    if (roomLampItemsMap.containsValue("lamp")) {
                        output(castleRooms.getLampLibraryDescription());
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("Inspect Scroll")) {
                            output(castleRooms.getLampLibrarySecretPassage());
                            answer = keyboard.nextLine();

                            if (answer.equalsIgnoreCase("EGASSAPLAITNEDIFNOC")) {
                                output(castleRooms.getLampLibraryToSecretRoom());
                                personalTotal += 1000;
                                isSecretRevealed = true;
                            } else {
                                output(castleRooms.getLampLibraryToNextRoom());
                            }
                        } else {
                            output("You won't find out what the scroll was about");
                            isSecretRevealed = false;
                        }
                    }

                    if (isSecretRevealed) {
                        answer = "8";
                    } else {
                        output(castleRooms.getLibraryDirection());
                        answer = keyboard.nextLine();
                    }

                    if (answer.equalsIgnoreCase("north"))
                        answer = "5";
                    else if (answer.equalsIgnoreCase("east"))
                        answer = "2";

                    while (!answer.equalsIgnoreCase("2") ) {
                        if (answer.equalsIgnoreCase("5")
                                || answer.equalsIgnoreCase("Q")
                                || answer.equalsIgnoreCase("8")) {
                            break;
                        }
                        output("North or East. Try again:");
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("north"))
                            answer = "5";
                        else if (answer.equalsIgnoreCase("east"))
                            answer = "2";
                    }

                    roomItemsMap.putIfAbsent(3, "spiders");
                    break;

                case "4":

                    evilCharacterPresence = Integer.toString(1 + random.nextInt(8));
                    if (evilCharacterPresence.equalsIgnoreCase("4")) {
                        if (random.nextBoolean()) {
                            output(castleRooms.moneyStolen());
                            personalTotal = 0;
                        } else {
                            output(castleRooms.moneyNotStolen());
                        }
                    }

                    lamp = Integer.toString(1 + random.nextInt(8));

                    output("\nYour current amount is $" +
                            convertToTwoDecimalPlaces(personalTotal));
                    personalTotalMap.putIfAbsent(4, 0.01 + Math.random() * 1000.0);
                    output(castleRooms.getKitchenDescription());
                    if (personalTotalMap.get(4) != 0.0) {
                        output(castleRooms.askToTakeMoney(
                                convertToTwoDecimalPlaces(personalTotalMap.get(4))));
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("y")) {
                            personalTotal += (personalTotalMap.get(4));
                            personalTotalMap.replace(4, 0.0);
                        }
                    }

                    if (lamp.equalsIgnoreCase("4")) {
                        if (!roomLampItemsMap.containsValue("lamp")) {
                            output(castleRooms.askToTakeLamp());
                            answer = keyboard.nextLine();
                            if (answer.equalsIgnoreCase("y")) {
                                roomLampItemsMap.put(1, "lamp");
                            }
                        }
                    }

                    if (roomLampItemsMap.containsValue("lamp")) {
                        output(castleRooms.getLampKitchenDescription());
                        answer = keyboard.nextLine();

                        output(answer.equalsIgnoreCase("Eat Cake")
                                ? "Enjoy!" : "Well, maybe next time...");
                    }

                    output(castleRooms.getKitchenDirection());
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
                        output("North or West. Try again:");
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("north"))
                            answer = "7";
                        else if (answer.equalsIgnoreCase("west"))
                            answer = "2";
                    }

                    roomItemsMap.putIfAbsent(4, "bats");
                    break;

                case "5":

                    evilCharacterPresence = Integer.toString(1 + random.nextInt(8));
                    if (evilCharacterPresence.equalsIgnoreCase("5")) {
                        if (random.nextBoolean()) {
                            output(castleRooms.moneyStolen());
                            personalTotal = 0;
                        } else {
                            output(castleRooms.moneyNotStolen());
                        }
                    }

                    lamp = Integer.toString(1 + random.nextInt(8));

                    output("\nYour current amount is $" +
                            convertToTwoDecimalPlaces(personalTotal));
                    personalTotalMap.putIfAbsent(5, 0.01 + Math.random() * 1000.0);
                    output(castleRooms.getDiningRoomDescription());
                    if (personalTotalMap.get(5) != 0.0) {
                        output(castleRooms.askToTakeMoney(
                                convertToTwoDecimalPlaces(personalTotalMap.get(5))));
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("y")) {
                            personalTotal += (personalTotalMap.get(5));
                            personalTotalMap.replace(5, 0.0);
                        }
                    }

                    if (lamp.equalsIgnoreCase("5")) {
                        if (!roomLampItemsMap.containsValue("lamp")) {
                            output(castleRooms.askToTakeLamp());
                            answer = keyboard.nextLine();
                            if (answer.equalsIgnoreCase("y")) {
                                roomLampItemsMap.put(1, "lamp");
                            }
                        }
                    }

                    if (roomLampItemsMap.containsValue("lamp")) {
                        if(!roomLampItemsMap.containsKey(3)) {
                            output(castleRooms.getLampDiningRoomDescription());
                            answer = keyboard.nextLine();

                            if (answer.equalsIgnoreCase("Get Gift Card")) {
                                output("Enjoy the card!");
                                roomLampItemsMap.put(3, "Amazon gift card");
                            } else {
                                output("Alright then.");
                            }
                        }
                    }

                    output(castleRooms.getDiningRoomDirection());
                    answer = keyboard.nextLine();

                    if (answer.equalsIgnoreCase("south"))
                        answer = "3";

                    while (!answer.equalsIgnoreCase("3") ) {
                        if (answer.equalsIgnoreCase("Q")) {
                            break;
                        }
                        output("South. Try again:");
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("south"))
                            answer = "3";
                    }

                    roomItemsMap.putIfAbsent(5, "dust and empty box");
                    break;

                case "6":

                    evilCharacterPresence = Integer.toString(1 + random.nextInt(8));
                    if (evilCharacterPresence.equalsIgnoreCase("6")) {
                        if (random.nextBoolean()) {
                            output(castleRooms.moneyStolen());
                            personalTotal = 0;
                        } else {
                            output(castleRooms.moneyNotStolen());
                        }
                    }

                    output("\nYour current amount is $" +
                            convertToTwoDecimalPlaces(personalTotal));
                    personalTotalMap.putIfAbsent(6, 0.01 + Math.random() * 1000.0);
                    output(castleRooms.getVaultDescription());
                    if (personalTotalMap.get(6) != 0.0) {
                        output(castleRooms.askToTakeMoney(
                                convertToTwoDecimalPlaces(personalTotalMap.get(6))));
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("y")) {
                            personalTotal += (personalTotalMap.get(6));
                            personalTotalMap.replace(6, 0.0);
                        }
                    }

                    output(castleRooms.getVaultDirection());
                    answer = keyboard.nextLine();

                    if (answer.equalsIgnoreCase("east")) {
                        double randomRoom = Math.random();
                        answer = (randomRoom < 0.25) ? ("8") : ("7");
                    }

                    while (!answer.equalsIgnoreCase("7")) {
                        if (answer.equalsIgnoreCase("Q") ||
                                answer.equalsIgnoreCase("8")) {
                            break;
                        }
                        output("East. Try again:");
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("east"))
                            answer = "7";
                    }

                    roomItemsMap.putIfAbsent(6, "three walking skeletons");

                    break;

                case "7":

                    evilCharacterPresence = Integer.toString(1 + random.nextInt(8));
                    if (evilCharacterPresence.equalsIgnoreCase("7")) {
                        if (random.nextBoolean()) {
                            output(castleRooms.moneyStolen());
                            personalTotal = 0;
                        } else {
                            output(castleRooms.moneyNotStolen());
                        }
                    }

                    lamp = Integer.toString(1 + random.nextInt(8));

                    output("\nYour current amount is $" +
                            convertToTwoDecimalPlaces(personalTotal));
                    personalTotalMap.putIfAbsent(7, 0.01 + Math.random() * 1000.0);
                    output(castleRooms.getParlorDescription());
                    if (personalTotalMap.get(7) != 0.0) {
                        output(castleRooms.askToTakeMoney(
                                convertToTwoDecimalPlaces(personalTotalMap.get(7))));
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("y")) {
                            personalTotal += (personalTotalMap.get(7));
                            personalTotalMap.replace(7, 0.0);
                        }
                    }

                    if (lamp.equalsIgnoreCase("7")) {
                        if (!roomLampItemsMap.containsValue("lamp")) {
                            output(castleRooms.askToTakeLamp());
                            answer = keyboard.nextLine();
                            if (answer.equalsIgnoreCase("y")) {
                                roomLampItemsMap.put(1, "lamp");
                            }
                        }
                    }

                    if (roomLampItemsMap.containsValue("lamp")) {
                        if (!roomLampItemsMap.containsKey(4)) {
                            output(castleRooms.getLampParlorDescription());
                            answer = keyboard.nextLine();

                            if (answer.equalsIgnoreCase("y")) {
                                output("Enjoy the movie!");
                                roomLampItemsMap.put(4,
                                        "portrait of Tom Holland " +
                                                "and tickets to Spider-Man: Homecoming");
                            } else {
                                output("Ok, let's move on");
                            }
                        }
                    }

                    output(castleRooms.getParlorDirection());
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
                        output("West or South. Try again:");
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("west"))
                            answer = "6";
                        else if (answer.equalsIgnoreCase("south"))
                            answer = "4";
                    }

                    roomItemsMap.putIfAbsent(7, "treasure chest");
                    break;

                case "8":

                    evilCharacterPresence = Integer.toString(1 + random.nextInt(8));
                    if (evilCharacterPresence.equalsIgnoreCase("8")) {
                        if (random.nextBoolean()) {
                            output(castleRooms.moneyStolen());
                            personalTotal = 0;
                        } else {
                            output(castleRooms.moneyNotStolen());
                        }
                    }

                    lamp = Integer.toString(1 + random.nextInt(8));

                    output("\nYour current amount is $" + convertToTwoDecimalPlaces(personalTotal));
                    personalTotalMap.putIfAbsent(8, 0.01 + Math.random() * 1000.0);
                    output(castleRooms.getSecretRoomDescription());
                    if (!roomLampItemsMap.containsKey(5)) {
                        output(castleRooms.askToTakePilesOfGold());
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("y")) {
                            output("Excellent!");
                            roomLampItemsMap.put(5, "piles of gold");
                        } else {
                            output("Okay, that's fine");
                        }
                    }

                    if (personalTotalMap.get(8) != 0.0) {
                        output(castleRooms.askToTakeMoney(
                                convertToTwoDecimalPlaces(personalTotalMap.get(8))));
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("y")) {
                            personalTotal += (personalTotalMap.get(8));
                            personalTotalMap.replace(8, 0.0);
                        }
                    }

                    if (lamp.equalsIgnoreCase("8")) {
                        if (!roomLampItemsMap.containsValue("lamp")) {
                            output(castleRooms.askToTakeLamp());
                            answer = keyboard.nextLine();
                            if (answer.equalsIgnoreCase("y")) {
                                roomLampItemsMap.put(1, "lamp");
                            }
                        }
                    }

                    if (roomLampItemsMap.containsValue("lamp")) {
                        
                        if (!roomLampItemsMap.containsKey(6)) {
                            output(castleRooms.getLampSecretRoomDescription());
                            answer = keyboard.nextLine();

                            if (answer.equalsIgnoreCase("y")) {
                                output("You picked an useful item");
                                roomLampItemsMap.put(6, "map of the house");
                            } else {
                                output("Let's continue.");
                            }
                        }
                    }

                    output(castleRooms.getSecretRoomDirection());
                    answer = keyboard.nextLine();

                    if (answer.equalsIgnoreCase("west"))
                        answer = "6";

                    while (!answer.equalsIgnoreCase("6")) {
                        if (answer.equalsIgnoreCase("Q")) {
                            break;
                        }
                        output("West. Try again:");
                        answer = keyboard.nextLine();

                        if (answer.equalsIgnoreCase("west"))
                            answer = "6";
                    }

                    roomItemsMap.putIfAbsent(8, "piles of gold");
                    break;
            }
        }
        output("\n\n\n" + castleRooms.exit());
        output("\nNumber of rooms visited: " + roomItemsMap.size());
        output("\nItems seen:");
        for(String item : roomItemsMap.values()) {
            output("* " + item);
        }
        output("\nAdditional items in stash:");
        for(String item : roomLampItemsMap.values()) {
            output("* " + item);
        }
        output("\nTotal amount is $" + convertToTwoDecimalPlaces(personalTotal));
    }

    private static String convertToTwoDecimalPlaces(double personalTotal) {
        return String.format("%.02f",personalTotal);
    }

    private static void output(String message) {
        System.out.println(message);
    }
}