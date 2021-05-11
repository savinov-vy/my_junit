package ru.savinov;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BubbleSortTest {

    @Test
    public void testBubbleSortArr() {
        int [] actual = {2,-17,3,7,10};
        int [] expected = {-17, 2, 3, 7, 10};
        assertArrayEquals(expected, BubbleSort.bubbleSortArr(actual));
    }
}
