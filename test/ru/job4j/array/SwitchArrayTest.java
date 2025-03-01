package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap4to7() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int source = 4;
        int dest = 7;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4, 8, 6, 7, 5, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to6() {
        int[] input = {13, 11, 9, 7, 5, 3, 1};
        int source = 1;
        int dest = 6;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {13, 1, 9, 7, 5, 3, 11};
        Assert.assertArrayEquals(expected, result);
    }
}