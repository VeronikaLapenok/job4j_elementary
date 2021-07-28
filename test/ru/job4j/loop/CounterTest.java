package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void whenSumFromOneToTenThenFiftyFive() {
        int start = 1;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 55;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumFromFiveToTenThenFortyFive() {
        int start = 5;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 45;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromOneToFiveThenSix() {
        int start = 1;
        int finish = 5;
        int result = Counter.sumByEven(start, finish);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }
}