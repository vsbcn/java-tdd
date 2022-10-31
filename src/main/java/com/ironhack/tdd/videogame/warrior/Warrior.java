package com.ironhack.tdd.videogame.warrior;
import com.ironhack.tdd.videogame.player.Player;

public class Warrior extends Player {

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    private int stamina;

    private int strength;

    public Warrior(int hp, int lives, int stamina,int strength ) {
        super(hp, lives);
        setStamina(stamina);
        setStrength(strength);
    }
    public void meeleAttack(Player enemy){ //aqui otro character, ya que extiende de Player
        if (getStamina() >= 5){
            System.out.println("meeleAttack");
            Integer damage = getStrength();
            Integer newStamina = getStamina() - 3;
            setStamina(newStamina);
            enemy.setHp(enemy.getHp() - damage);
            System.out.println("Meele Attack made: " + damage + " damage.");
        }else {
            int damage = punchAttack(enemy);
            System.out.println("Punch Attack made: " + damage + " damage.");
        }

        }
        public int punchAttack(Player enemy) {
            System.out.println("Not enough stamina to proceed with Meele Attack");
            System.out.println("Punch attack instead...");
            Integer damage = getStrength() / 2;
            Integer newStamina = getStamina() + 1;
            setStamina(newStamina);
            enemy.setHp(enemy.getHp() - damage);
            return damage;
        }
    }