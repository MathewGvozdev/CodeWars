package com.codewars.kyu8.Task3;

/**
 * Your task is to create a function that does four basic mathematical operations.
 *
 * The function should take three arguments - operation(string/char), value1(number), value2(number).
 * The function should return result of numbers after applying the chosen operation.
 *
 * Examples
 * basicOp('+', 4, 7)         // Output: 11
 * basicOp('-', 15, 18)       // Output: -3
 * basicOp('*', 5, 5)         // Output: 25
 * basicOp('/', 49, 7)        // Output: 7
 * **/

public class Task3 {

    public static void main(String[] args) {
        System.out.println(BasicOperations.basicMath("+", 4, 7));
        System.out.println(BasicOperations.basicMath("-", 15, 18));
        System.out.println(BasicOperations.basicMath("*", 5, 5));
        System.out.println(BasicOperations.basicMath("/", 49, 7));
    }

    public class BasicOperations
    {
        public static Integer basicMath(String op, int v1, int v2)
        {
            return switch (op) {
                case "+" -> v1 + v2;
                case "-" -> v1 - v2;
                case "*" -> v1 * v2;
                case "/" -> v1 / v2;
                default -> 0;
            };
        }
    }
}
