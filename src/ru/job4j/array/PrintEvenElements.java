package ru.job4j.array;

public class PrintEvenElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < numbers.length; i++) {
            int index = numbers.length - 1 - i;
            if (index % 2 == 0) {
                System.out.println("Текущий элемент массива с чётным индексом начиная с последнего: "
                        + numbers[index]);
            }
        }
    }
}
