package com.ironhack.tdd.intarray;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class IntArrayTest {

    @BeforeEach
    void setUp(){
        IntArray IntArray = new IntArray();
    }

    @Test
    public void oddArray_OddNumbersInArrayTillNumber_ReturnArrayWithOddNumbers() {
      ArrayList<Integer> oddArray = IntArray.oddArray(7);
      ArrayList<Integer> oddArray2 = new ArrayList<>();
      oddArray2.add(1);
      oddArray2.add(3);
      oddArray2.add(5);
       Assert.assertArrayEquals(oddArray2.toArray(), oddArray.toArray());
    }

    @Test
    public void oddArray_NegativeNumber_ThrowsNegativeNumberException() {
        Assert.assertThrows(RuntimeException.class, () -> {IntArray.oddArray(-1);});
    }







}




