package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[-1];
        for (int index = 1; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5};
        findMin(array);
    }
}
