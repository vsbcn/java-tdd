package com.ironhack.tdd.keywords;

import java.util.ArrayList;
import java.util.Arrays;

public class KeyWords {
//Java has certain words that are considered “Java Keywords”. Keywords are reserved and cannot be used as variable names.
//Employing TDD, create a method that takes in a String and returns true if the String contains any Java Keywords.
//For example, break is a Java keyword. The String "Don't break my heart" should return true.
//The String "I love to breakdance" should return false. You will need to use Google to find a list of all Java Keywords.

    public static boolean javaKeyword(String keyWord) {
        String keywords[] = { "abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "extends", "false",
                "final", "finally", "float", "for", "goto", "if", "implements",
                "import", "instanceof", "int", "interface", "long", "native",
                "new", "null", "package", "private", "protected", "public",
                "return", "short", "static", "strictfp", "super", "switch",
                "synchronized", "this", "throw", "throws", "transient", "true",
                "try", "void", "volatile", "while" };

        for (String substring : keywords){
            if (keyWord.contains(substring)) {
                return true;
            }
        }
        return false;
    }
}
