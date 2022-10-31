package com.ironhack.tdd;

import com.ironhack.tdd.intarray.IntArray;
import com.ironhack.tdd.keywords.KeyWords;
import com.ironhack.tdd.videogame.elf.Elf;
import com.ironhack.tdd.videogame.warrior.Warrior;
import com.ironhack.tdd.videogame.wizard.Wizard;

public class Main {
    public static void main(String[] args) {

//Employing TDD, create a method that takes in an integer n and returns an array of all odd integers from 1 to n.
//Write your tests first!

        IntArray.oddArray(7);
        //IntArray.oddArray(-7);

//Java has certain words that are considered “Java Keywords”. Keywords are reserved and cannot be used as variable names.
//Employing TDD, create a method that takes in a String and returns true if the String contains any Java Keywords.
//For example, break is a Java keyword. The String "Don't break my heart" should return true.
//The String "I love to breakdance" should return false. You will need to use Google to find a list of all Java Keywords.

        boolean result = KeyWords.javaKeyword("Don't lose the static");
        System.out.println(result);

//Create a Player class for a video game. Track the player’s stats (health, strength, lives, etc).
//Create 3 subclasses Warrior, Elf, Wizard. Provide at least one specialized behavior for each.

        Wizard Kratos = new Wizard(10, 10, 2, 10);
        Warrior Lex = new Warrior(50, 10, 2, 10);
        Elf SilverArrow = new Elf(40, 10, 2,10);

//Employing TDD, create a method that decrements the lives of a player.
//The method should reduce the number of lives by one and restore the player’s health to its original state.

        Kratos.liveDecrement();
        System.out.println(Kratos.getLives());

//Employing TDD, create a method that allows one player to attack another.
//When a player attacks another, the attacked player’s health should decrease by the attacking player’s strength.
//For example, if a playerA has strength = 5 and a playerB has health = 20, then when the playerA attacks the playerB,
//the playerB's new health will be 15. Hint: the attack method will take a Player object as an argument.

        Lex.meeleAttack(Kratos);
        System.out.println("Enemy's player health " + Kratos.getHp());
        Lex.meeleAttack(Kratos);
        System.out.println("Enemy's player health " + Kratos.getHp());
        Kratos.liveDecrement();
        System.out.println(Kratos.getLives());
        System.out.println(Kratos.getHp());

    }
}
