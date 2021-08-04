package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas8Then9() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8};
        int el = 8;
        int result = FindLoop.indexOf(data, el);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNotElement() {
        int[] data = {1, 2, 3, 4, 5};
        int el = 9;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}
