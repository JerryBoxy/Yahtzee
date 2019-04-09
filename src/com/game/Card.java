package com.game;

import java.util.HashMap;

public class Card {

    HashMap<Category, Integer> categories;

    public Card() {

        this.categories = new HashMap<Category, Integer>();
        categories.put(initAces(), 0);
        categories.put(initTwos(), 0);
        categories.put(initThrees(), 0);
        categories.put(initFours(), 0);
        categories.put(initFives(), 0);
        categories.put(initSixes(), 0);
        categories.put(initThreeOfAKind(), 0);
        categories.put(initFourOfAKind(), 0);
        categories.put(initFullHouse(), 0);
        categories.put(initSmallStraight(), 0);
        categories.put(initLargeStraight(), 0);
        categories.put(initYahtzee(), 0);
        categories.put(initChance(), 0);
    }

    private Category initAces (){
        String name = "Aces";
        String desc = "The sum of dice with the number 1";
        return new Category(name, desc);
    }

    private Category initTwos (){
        String name = "Twos";
        String desc = "The sum of dice with the number 2";
        return new Category(name, desc);
    }

    private Category initThrees (){
        String name = "Threes";
        String desc = "The sum of dice with the number 3";
        return new Category(name, desc);
    }

    private Category initFours (){
        String name = "Fours";
        String desc = "The sum of dice with the number 4";
        return new Category(name, desc);
    }

    private Category initFives (){
        String name = "Fives";
        String desc = "The sum of dice with the number 5";
        return new Category(name, desc);
    }

    private Category initSixes (){
        String name = "Sixes";
        String desc = "The sum of dice with the number 6";
        return new Category(name, desc);
    }

    private Category initThreeOfAKind (){
        String name = "Three Of A Kind";
        String desc = "At least three dice the same";
        return new Category(name, desc);
    }

    private Category initFourOfAKind (){
        String name = "Four Of A Kind";
        String desc = "At least four dice the same";
        return new Category(name, desc);
    }

    private Category initFullHouse (){
        String name = "Full House";
        String desc = "Three of one number and two of another";
        return new Category(name, desc);
    }

    private Category initSmallStraight (){
        String name = "Small Straight";
        String desc = "Four sequential dice(1-2-3-4, 2-3-4-5, or 3-4-5-6)";
        return new Category(name, desc);
    }

    private Category initLargeStraight (){
        String name = "Large Straight";
        String desc = "Five sequential dice(1-2-3-4-5 or 2-3-4-5-6)";
        return new Category(name, desc);
    }

    private Category initYahtzee (){
        String name = "Yahtzee";
        String desc = "All five dice the same";
        return new Category(name, desc);
    }

    private Category initChance (){
        String name = "Chance";
        String desc = "Any combination";
        return new Category(name, desc);
    }


}
