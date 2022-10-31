package com.ironhack.tdd.keywords;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class KeyWordsTest {
    KeyWords keyWords;

    @BeforeEach
    void setUp() {
        keyWords = new KeyWords();
    }

    @Test
    public void javaKeyword_FindingKeyWord_TrueOrFalse() {
        boolean result = KeyWords.javaKeyword("Vamos al ");
        Assertions.assertEquals(false,result);
    }
}