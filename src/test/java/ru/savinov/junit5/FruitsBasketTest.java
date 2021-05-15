package ru.savinov.junit5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class FruitsBasketTest {
    FruitsBasket fruitsBasket = new FruitsBasket();
    Fruit apple = new Fruit("apple", 200);
    Fruit orange = new Fruit("orange", 150);
    Fruit banana = new Fruit("banana", 250);

    @BeforeEach
    void init() {
        fruitsBasket.add(apple);
        fruitsBasket.add(orange);
    }

    @Test
    void testAdd() {
        fruitsBasket.add(banana);
        assertEquals(3, fruitsBasket.getSize());
    }

    @Test
    void testSize() {
        assertEquals(2, fruitsBasket.getSize(), "Checking basket's size");
    }

    @Test
    void testRemove() {
        fruitsBasket.remove(orange);
        assertEquals(1, fruitsBasket.getSize(), "Removing a fruit from the basket");
    }

    @Test
    void testRemove_Exeption() {
        assertThrows(NoSuchElementException.class,
                () -> fruitsBasket.remove(banana), "Removing a fruit from the basket");
    }

    @Test
    void testForTimeout() {
        assertTimeout(Duration.ofMillis(1L), () -> fruitsBasket.remove(apple), "Testing for productivity");
    }

    @Test
    void testAddALot() {
        List<Fruit> lot = Arrays.asList(
                new Fruit("Peach", 100),
                new Fruit("Tangerine", 50),
                new Fruit("Mango", 150)
        );
        assertTrue(fruitsBasket.addALot(lot), "Adding a lot of fruits");
    }

    @Test
    void testArrays() {
        String wish = "Желаю счастья в личной жизни, Пух!";
        String[] expected = {"Желаю", "счастья", "в", "личной", "жизни,", "Пух"};
        String[] actual = fruitsBasket.greet(wish);
        assertArrayEquals(expected, actual);
    }


    @AfterEach
    void destroy() {
        fruitsBasket.removeAll();
    }
}
