package com.ironhack.tdd.videogame.player;

import com.ironhack.tdd.videogame.warrior.Warrior;
import com.ironhack.tdd.videogame.wizard.Wizard;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


public class PlayerTest {


    Warrior testWarrior = new Warrior(30,2,10,10);
    Wizard testWizard = new Wizard(30,2,10,4);

    @BeforeEach
    public void setUp() {
        testWarrior.setHp(0);
    }

    @Test
    public void liveDecrement_ReduceLiveCounter_IncrementHpToOriginal(){
        int result = testWarrior.liveDecrement();
        Assert.assertEquals(10, result);
    }

    @Test
    public void magicAttack_ReduceEnemyHp_CheckEnemyFinalHpAfterAttack(){
       testWizard.magicAttack(testWarrior);
       int enemyHp = testWarrior.getHp();
       Assert.assertEquals(20, enemyHp);
    }

    @Test
    public void staffHit_ReduceEnemyHp_CheckEnemyFinalHpAfterstaffAttack(){
        testWizard.staffHit(testWarrior);
        int enemyHp = testWarrior.getHp();
        Assert.assertEquals(28, enemyHp);
    }

}