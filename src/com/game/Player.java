package com.game;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Player {

    private String name;
    private Card scoreCard;

    public Player(String name) {
        this.name = name;
    }

    public Integer randomRoll(){
        Integer randomNum = ThreadLocalRandom.current().nextInt(1, 7);
        return randomNum;
    }

    /** https://xkcd.com/221/ */
    /**
    int getRandomNumber(){
        return 4;   // chosen by fair dice roll.
                    // guaranteed to be random.
    }
     */

    //TODO
    public int rollDie(int die){
        return  die = randomRoll();
    }

    public HashMap<Die, Integer> rollDice(HashMap<Die, Integer> dice){
        for (Map.Entry<Die, Integer> entry : dice.entrySet()) {
            entry.setValue(randomRoll());
        }
        return dice;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card getScoreCard() {
        return scoreCard;
    }

    public void setScoreCard(Card scoreCard) {
        this.scoreCard = scoreCard;
    }
}
