package ru.job4j;

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index < rst.length; index++) {
            rst[index] = (int) Math.pow(index, 2);
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(5);
        for (int number: array) {
            System.out.println(number);
        }
    }
}
