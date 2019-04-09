package com.game;

import java.util.*;

public class Game {

    public static void main(String[] args) {
        System.out.println("----- YAHTZEE ----- \n");
        play();
    }

    public static void play() {
        ArrayList<Player> players;
        HashMap<Die, Integer> dice;
        Scanner scan = new Scanner(System.in);
        Card previewCard = new Card();
        Boolean correct = true;
        Integer turn = 0;

        dice = initDice();
        players = addPlayers(scan);

        while(turn < 1){ // Number of turn should be 13 has the number of categories in the game
            for (Player p : players) {
                System.out.println("It's " + p.getName() + "'s turn !");
                dice = firstRoll(p, dice);
                displayChoice();
                while(correct) {
                    int res = scan.nextInt();
                    switch (res) {
                        case 1:
                            p.getScoreCard().toString(); //TODO
                            correct = false;
                            break;
                        case 2:
                            scorePreview(previewCard, dice); //TODO
                            correct = false;
                            break;
                        case 3:
                            dice = secondRoll(p, dice); //TODO
                            correct = false;
                            break;
                        case 4:
                            // TODO
                            break;
                        default:
                            System.out.println("! Enter a correct number !");
                            correct = true;
                            break;
                    }
                }
                displayFinalChoice();
                while(correct) {
                    int res = scan.nextInt();
                    switch (res) {
                        case 1:
                            p.getScoreCard().toString(); //TODO
                            correct = false;
                            break;
                        case 2:
                            scorePreview(previewCard, dice); //TODO
                            correct = false;
                            break;
                        case 3:
                            // TODO
                            correct = false;
                            break;
                        default:
                            System.out.println("! Enter a correct number !");
                            correct = true;
                            break;
                    }
                }
            }
            turn++;
        }
        scan.close();
    }

    private static HashMap<Die, Integer> initDice() {
        HashMap<Die, Integer> dice = new HashMap<Die, Integer>();
        for (int i = 1; i <= 6; i++) {
            dice.put(initDie(i),0);
        }
        return dice;
    }

    private static Die initDie (int i){
        Integer number = i;
        Integer value = 1;
        return new Die(number, value);
    }

    public static ArrayList<Player> addPlayers(Scanner scan){
        ArrayList<Player> players = new ArrayList<Player>();

        System.out.println("How many players will join the game ?");
        Integer nbPlayers = scan.nextInt();
        scan.nextLine();
        for (int i = 1; i <= nbPlayers; i++) {
            System.out.println("Enter the name of the player number " + i + " : ");
            String name = scan.nextLine();
            players.add(new Player(name));
        }
        return players;
     }

    public static HashMap<Die, Integer> firstRoll(Player p, HashMap<Die, Integer> dice) {
        dice = p.rollDice(dice);
        System.out.println("DICE ROLL");
        displayDice(dice);
        return dice;
    }

    public static HashMap<Die, Integer> secondRoll(Player p, HashMap<Die, Integer> dice) {
        //TODO
        return dice;
    }

    public static void displayDice(HashMap<Die, Integer> dice) {
        StringBuilder display = new StringBuilder();
        System.out.println("Result :");
        display.append(" -- ");
        for (Map.Entry<Die, Integer> entry : dice.entrySet()) {
            display.append(entry.getValue());
            display.append(" -- ");
        }
        System.out.println(display);
    }

    public static void scorePreview(Card c, HashMap<Die, Integer> dice){
        // TODO
    }

    public static void displayChoice() {
        System.out.println();
        System.out.println("-- CHOICE --");
        System.out.println("1 - Display my scorecard");
        System.out.println("2 - Display the score preview");
        System.out.println("3 - Re-roll one or more dice");
        System.out.println("4 - Chose a category");
        System.out.println("What is your choice ? (1/2/3/4)");
    }

    public static void displayFinalChoice() {
        System.out.println();
        System.out.println("-- FINAL CHOICE --");
        System.out.println("1 - Display my scorecard");
        System.out.println("2 - Display the score preview");
        System.out.println("3 - Chose a category");
        System.out.println("What is your choice ? (1/2/3)");
    }
}
