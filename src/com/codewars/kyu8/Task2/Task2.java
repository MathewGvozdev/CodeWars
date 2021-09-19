package com.codewars.kyu8.Task2;

/**
 * Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer
 * greater than 0.
 * <p>
 * For example:
 * <p>
 * summation(2) -> 3
 * 1 + 2
 * <p>
 * summation(8) -> 36
 * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8
 **/

public class Task2 {

    public static void main(String[] args) {
        System.out.println(GrassHopper.summation(2));
        System.out.println(GrassHopper.summation(8));
        System.out.println(GrassHopper.summation(20));
        System.out.println(GrassHopper.summation(-5));
    }

    public class GrassHopper {

        public static int summation(int n) {
            int sum = 0;
            if (n < 0) {
                throw new IllegalArgumentException("Неверный аргумент, введите положительное число");
            }
            for (int i = 0; i <= n; i++) {
                sum += i;
            }
            return sum;
        }
    }
}
