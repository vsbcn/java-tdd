package com.ironhack.tdd.videogame.wizard;

import com.ironhack.tdd.videogame.player.Player;

public class Wizard extends Player {

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    private int intelligence;
    private int mana;

    public Wizard(int hp, int lives, int intelligence, int mana) {
        super(hp, lives);
        setIntelligence(intelligence);
        setMana(mana);
    }

    public void magicAttack(Player enemy) {
        if (getMana() >= 5) {
            System.out.println("Fireball");
            Integer damage = getIntelligence();
            Integer newMana = getMana() - 5;
            setMana(newMana);
            enemy.setHp(enemy.getHp() - damage);
            System.out.println("damage: " + damage);

        } else {
            int damage = staffHit(enemy);
            System.out.println("damage: " + damage);
        }
    }

    public int staffHit(Player enemy) {
        System.out.println("Not enough mana for Magic Attack...");
        System.out.println("Staff hit insetad.");
        Integer damage = 2;
        Integer newMana = getMana() + 1;
        setMana(newMana);
        enemy.setHp(enemy.getHp() - damage);
        return damage;
    }

}
