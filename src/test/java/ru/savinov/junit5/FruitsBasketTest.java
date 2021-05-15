package ru.savinov.junit5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.NoSuchElementException;


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
        Assertions.assertEquals(3, fruitsBasket.getSize());
    }

    @Test
    void testSize() {
        Assertions.assertEquals(2, fruitsBasket.getSize(), "Checking basket's size");
    }

    @Test
    void testRemove() {
        fruitsBasket.remove(orange);
        Assertions.assertEquals(1, fruitsBasket.getSize(), "Removing a fruit from the basket");
    }

    @Test
    void testRemove_Exeption() {
        Assertions.assertThrows(NoSuchElementException.class,
                () -> fruitsBasket.remove(banana), "Removing a fruit from the basket");
    }

    @Test
    void testForTimeout() {
        Assertions.assertTimeout(Duration.ofMillis(1L),() -> fruitsBasket.remove(apple) , "Testing for productivity");
    }

    @AfterEach
    void destroy() {
        fruitsBasket.removeAll();
    }
}
