package com.codewars.kyu8.Kata3;

/**
 * Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the
 * number of sheep present in the array (true means present).
 * For example,
 * [true,  true,  true,  false,
 * true,  true,  true,  true ,
 * true,  false, true,  false,
 * true,  false, false, true ,
 * true,  true,  true,  true ,
 * false, false, true,  true]
 * The correct answer would be 17.
 **/

public class Kata3 {

    public static void main(String[] args) {
        Boolean[] boolArray =
                {true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};
        System.out.println(Kata3.Counter.countSheeps(boolArray));

    }

    public class Counter {
        public static int countSheeps(Boolean[] arrayOfSheeps) {
            // TODO May the force be with you
            int counter = 0;
            for (int i = 0; i < arrayOfSheeps.length; i++) {
                if (arrayOfSheeps[i] == Boolean.TRUE) {
                    counter++;
                }
            }
            return counter;
        }
    }
}
