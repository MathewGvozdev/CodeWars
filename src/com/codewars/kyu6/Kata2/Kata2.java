package com.codewars.kyu6.Kata2;

import java.util.ArrayList;

/**
 *                              Highest Scoring Word
 * Given a string of words, you need to find the highest scoring word.
 * Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
 * You need to return the highest scoring word as a string.
 * If two words score the same, return the word that appears earliest in the original string.
 * All letters will be lowercase and all inputs will be valid.
 **/

public class Kata2 {

    public static void main(String[] args) {
        System.out.println(Kata.high("some words are written here")); //52 79 24 109 36
        System.out.println(Kata.high("abcd aaa dcba"));
    }

    public class Kata {
        public static ArrayList<String> initLetters() {
            ArrayList<String> symbolCost = new ArrayList<>();
            symbolCost.add("a");    //1
            symbolCost.add("b");    //2
            symbolCost.add("c");    //3
            symbolCost.add("d");    //4
            symbolCost.add("e");    //5
            symbolCost.add("f");    //6
            symbolCost.add("g");    //7
            symbolCost.add("h");    //8
            symbolCost.add("i");    //9
            symbolCost.add("j");    //10
            symbolCost.add("k");    //11
            symbolCost.add("l");    //12
            symbolCost.add("m");    //13
            symbolCost.add("n");    //14
            symbolCost.add("o");    //15
            symbolCost.add("p");    //16
            symbolCost.add("q");    //17
            symbolCost.add("r");    //18
            symbolCost.add("s");    //19
            symbolCost.add("t");    //20
            symbolCost.add("u");    //21
            symbolCost.add("v");    //22
            symbolCost.add("w");    //23
            symbolCost.add("x");    //24
            symbolCost.add("y");    //25
            symbolCost.add("z");    //26
            return symbolCost;
        }

        private static ArrayList<String> splitString(String str) {
            ArrayList<String> list = new ArrayList<>();
            String[] words = str.split(" ");
            for (String word : words) {
                list.add(word);
            }
            return list;
        }

        private static String[] splitWord(String word) {
            String[] symbols = new String[word.length()];
            for (int i = 0; i < word.length(); i++) {
                symbols[i] = word.substring(i, i + 1);
            }
            return symbols;
        }

        private static int countWordCost(String[] symbols) {
            ArrayList<String> basic = Kata.initLetters();
            int wordCost = 0;
            for (String symbol : symbols) {
                if (basic.contains(symbol)) {
                    int symIndex = basic.indexOf(symbol);
                    wordCost = wordCost + (symIndex + 1);
                }
            }
            return wordCost;
        }

        private static int findMaxIndex (ArrayList<String> words) {
            ArrayList<Integer> costList = new ArrayList<>();
            int maxCost = 0;
            int maxIndex = 0;
            for (String word : words) {
                costList.add(Kata.countWordCost(splitWord(word)));
            }
            for (int i = 0; i < costList.size(); i++) {
                if (maxCost <= costList.get(i)) {
                    maxCost = costList.get(i);
                    maxIndex = costList.indexOf(maxCost);
                }
            }
            return maxIndex;
        }

        public static String high(String s) {
            ArrayList<String> words = Kata.splitString(s);
            int index = findMaxIndex(words);
            return words.get(index);
        }
    }
}
