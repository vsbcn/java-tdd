package com.ironhack.tdd.intarray;

import java.util.ArrayList;

public class IntArray {

//Employing TDD, create a method that takes in an integer n and returns an array of all odd integers from 1 to n.
//Write your tests first!

    public static ArrayList<Integer> oddArray(int num) throws RuntimeException {
        if (num < 0){
            throw new RuntimeException("The number should be positive to create odd array");        }
        ArrayList<Integer> oddArray = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            if (i % 2 != 0) {
                oddArray.add(i);
            }
        }
        return oddArray;
    }
}
