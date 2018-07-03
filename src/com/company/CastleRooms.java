package com.company;

public class CastleRooms {

    public String getFoyerDescription() {
        return "You are standing in the foyer of an old house.\n"
                + "You see a dead scorpion.";
    }

    public String getLampFoyerDescription() {
        return "You also see a spider web made from pure silk\n"
                + "containing gold coins." +
                "\nWould you like to take the gold coins (\"y\" or \"n\")?";
    }

    public String getFoyerDirection() {
        return "{You can go to the north or press Q to quit}";
    }

    public String getFrontRoomDescription() {
        return "You are standing in the front room of an old house.\n"
                + "You see a piano.";
    }

    public String getLampFrontRoomDescription() {
        return "The piano has the sheet music for Beethoven's Ode to Joy." +
                "\nWould you like to play the music (\"y\" or \"n\")?";
    }

    public String playSong() {
        return "\n\uD83C\uDFB9 ODE TO JOY \uD83C\uDFB9" +
                "\n\nJoy, beautiful spark of the gods,\n" +
                "Daughter from Elysium,\n" +
                "We enter, drunk with fire,\n" +
                "Heavenly One, thy sanctuary!\n" +
                "Your magic binds again\n" +
                "What convention strictly divides;*\n" +
                "All people become brothers,*\n" +
                "Where your gentle wing abides.\n" +
                "\n" +
                "Who has succeeded in the great attempt,\n" +
                "To be a friend's friend,\n" +
                "Whoever has won a lovely woman,\n" +
                "Add his to the jubilation!\n" +
                "Indeed, who calls even one soul\n" +
                "Theirs upon this world!\n" +
                "And whoever never managed, shall steal himself\n" +
                "Weeping away from this union!\n" +
                "\n" +
                "All creatures drink of joy\n" +
                "At nature's breast.\n" +
                "Just and unjust\n" +
                "Alike taste of her gift;\n" +
                "She gave us kisses and the fruit of the vine,\n" +
                "A tried friend to the end.\n" +
                "[Even] the worm has been granted sensuality,\n" +
                "And the cherub stands before God!\n" +
                "\n" +
                "Gladly, as His heavenly bodies fly\n" +
                "On their courses through the heavens,\n" +
                "Thus, brothers, you should run your race,\n" +
                "Joyful, like a hero going to conquest.\n" +
                "\n" +
                "You millions, be embraced.\n" +
                "This kiss is for all the world!\n" +
                "Brothers, above the starry canopy\n" +
                "There must dwell a loving Father.\n" +
                "Do you fall in worship, you millions?\n" +
                "World, do you know your creator?\n" +
                "Seek him in the heavens\n" +
                "Above the stars must He dwell.\n";
    }

    public String getFrontRoomDirection() {
        return "{You can go to the south, west, east, or press Q to quit}";
    }

    public String getLibraryDescription() {
        return "You are standing in the library of an old house.\n"
                + "You see spiders.";
    }

    public String getLampLibraryDescription() {
        return "You also see a scroll on the wall" +
                "\nWould you like to inspect the scroll " +
                "(\"Inspect Scroll\" or \"n\")?";
    }

    public String getLampLibrarySecretPassage() {
        return "After inspecting the scroll, you notice there is a message." +
                "\nIt says \"EGASSAPLAITNEDIFNOC\". Probably the message is important.\n" +
                "Would you like to type the message to discover what happens" +
                "(\"type message\" or \"n\")?";
    }

    public String getLampLibraryToSecretRoom() {
        return "Awesome! You have been taken to the secret room" +
                "\nand a bonus of $1000.00 was deposited to your personal amount";
    }

    public String getLampLibraryToNextRoom() {
        return "Well, let's continue then...";
    }

    public String getLibraryDirection() {
        return "{You can go to the north, east, or press Q to quit}";
    }

    public String getDiningRoomDescription() {
        return "You are standing in the dinning room of an old house.\n"
                + "You see dust and an empty box.";
    }

    public String getLampDiningRoomDescription() {
        return "Actually, the box is not empty." +
                "\nIt contains an Amazon gift card." +
                "\nWould you like to get the gift card " +
                "(\"Get Gift Card\" or \"n\")?";
    }

    public String getDiningRoomDirection() {
        return "{You can go to the south or press Q to quit}";
    }

    public String getKitchenDescription() {
        return "You are standing in the kitchen of an old house.\n"
                + "You see bats.";
    }
    public String getLampKitchenDescription() {
        return "You also see a refrigerator full of cake." +
                "\nWould you like to eat some cake " +
                "(\"Eat Cake\" or \"n\")?";
    }

    public String getKitchenDirection() {
        return "{You can go to the west, north, or press Q to quit}";
    }

    public String getParlorDescription() {

        return "You are standing in the parlor of an old house.\n"
                + "You see a treasure chest.";
    }

    public String getLampParlorDescription() {
        return "You also see a portrait of Tom Holland" +
                "\nand tickets to Spider-Man: Homecoming" +
                "\nWould you like to take these items " +
                "(\"y\" or \"n\")?";
    }

    public String getParlorDirection() {

        return "{You can go to the west, south, or press Q to quit}";
    }

    public String getSecretRoomDescription() {
        return "You are standing in the secret room of an old house.";
    }

    public String askToTakePilesOfGold() {
        return "You see piles of gold. " +
                "\nWould you like to take the piles of gold (\"y\" or \"n\")?";
    }


    public String getLampSecretRoomDescription() {
        return "You also see a map of the house" +
                "\nWould you like to take the map " +
                "(\"y\" or \"n\")?";
    }

    public String getSecretRoomDirection() {
        return "{You can go to the west or press Q to quit}";
    }

    public String getVaultDescription() {
        return "You are standing in the vault of an old house.\n"
                + "You see three walking skeletons.";
    }

    public String getVaultDirection() {
        return "{You can go to the east or press Q to quit}";
    }

    public String askToTakeMoney(String amountOfMoney) {
        return "You found $" + amountOfMoney
                + ".\nWould you like to take it (\"y\" or \"n\")?";
    }

    public String moneyStolen() {
        return "The evil character stole all your money. Sorry...";
    }

    public String moneyNotStolen() {
        return "You dodged the evil character and your money was not stolen. Great job!";
    }

    public String askToTakeLamp() {
        return "There is a lamp available. Would you like to take it (\"y\" or \"n\")";
    }

    public String exit() {

        double random = Math.random();

        if (random < 0.25)
            return "You're outside the castle.\n"
                    + "Be careful, you're being followed by ghosts. Run as fast as you can!";
        else
            return "You're outside the castle. Thank you for playing!";

    }
}
