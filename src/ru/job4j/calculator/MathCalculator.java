package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double substractAndDiv(double first, double second) {
        return subtract(first, second) + div(first, second);
    }

    public static double sumOfAllMethods(double first, double second, double third, double fourth) {
        return sum(first, second) + multiply(first, second) + subtract(first, second) + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат сложения суммы и разности: " + sumAndMultiply(10, 20));
        System.out.println("Результат сложения разности и деления: " + substractAndDiv(10, 20));
        System.out.println("Результат сложения всех операций: " + sumOfAllMethods(10, 20, 30, 40));
    }
}
