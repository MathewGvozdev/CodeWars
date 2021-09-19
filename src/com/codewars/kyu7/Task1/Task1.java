package com.codewars.kyu7.Task1;

/**
 * Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument
 * (also a string).
 *
 * Examples:
 *
 * solution('abc', 'bc') // returns true
 * solution('abc', 'd') // returns false
 **/

public class Task1 {

    public static void main(String[] args) {
        System.out.println(Kata.solution("abc", "bc"));
        System.out.println(Kata.solution("abc", "c"));
        System.out.println(Kata.solution("abc", "d"));
        System.out.println(Kata.solution("abc", "cd"));
    }

    public class Kata {
        public static boolean solution(String str, String ending) {
            return str.endsWith(ending);
        }
    }

}
