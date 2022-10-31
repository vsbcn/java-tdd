package com.ironhack.tdd.videogame.player;

public abstract class Player {

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getLives() {
        return lives;
    }
    public void setLives(int lives) {
        this.lives = lives;
    }
    private int hp;
    private int lives;
    private int hpDefault;
    public Player(int hp, int lives) {
        setHp(hp);
        setLives(lives);
        hpDefault = hp;
    }

    public int liveDecrement(){
        if (getHp() <= 0){
            setLives(getLives()-1);
            setHp(hpDefault);
        }
        return getHp();
    }
}