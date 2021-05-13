package ru.savinov;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/***
 * assertArrayEquals для сравнения массивов. проверяет что компоненты массива А находятся на тех же местах
 * что и для массива В
 */
public class BubbleSortTest {

    @Test
    public void testBubbleSortArr() {
        int [] actual = {2,-17,3,7,10};
        int [] expected = {-17, 2, 3, 7, 10};
        assertArrayEquals(expected, BubbleSort.bubbleSortArr(actual));
    }

    /**
     * Метод ожидает ошибку при прохождении теста
     */
    @Test(expected = NullPointerException.class)
    public void testBubbleSortArr_OkTestWithExeption() {
        int [] actual = null; // {2,-17,3,7,10};
        int [] expected = {-17, 2, 3, 7, 10};
        assertArrayEquals(expected, BubbleSort.bubbleSortArr(actual));
    }
}
