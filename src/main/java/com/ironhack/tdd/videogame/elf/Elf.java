package com.ironhack.tdd.videogame.elf;

import com.ironhack.tdd.videogame.player.Player;

public class Elf extends Player {
    public int getAccuracy() {
        return accuracy;
    }
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    private int strength;
    private int accuracy;
    public Elf(int hp, int lives, int strength, int accuracy) {
        super(hp, lives);
        setStrength(strength);
        setAccuracy(accuracy);
    }
    public void accurateAttack(Player enemy){ //aqui otro character, ya que extiende de Player
        if (getAccuracy() >= 5){
            System.out.println("meeleAttack");
            Integer damage = getStrength();
            Integer newAccuracy = getAccuracy() - 3;
            setAccuracy(newAccuracy);
            enemy.setHp(enemy.getHp() - damage);
            System.out.println("Meele Attack made: " + damage + " damage.");
        }else {
            int damage = punchAttack(enemy);
            System.out.println("Punch Attack made: " + damage + "damage.");
        }

    }
    public int punchAttack(Player enemy) {
        System.out.println("Not enough stamina to proceed with Accurate Attack");
        System.out.println("Punch attack instead...");
        Integer damage = getStrength() / 2;
        Integer newStamina = getAccuracy() + 1;
        setAccuracy(newStamina);
        enemy.setHp(enemy.getHp() - damage);
        return damage;
    }

}
