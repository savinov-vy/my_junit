package ru.savinov.junit5;

import org.junit.jupiter.api.*;

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
    @DisplayName("add fruit to basket")
    void testAdd() {
        fruitsBasket.add(banana);
        assertEquals(3, fruitsBasket.getSize());
    }

    @Test
    @DisplayName("getSize basket")
    void testSize() {
        assertEquals(2, fruitsBasket.getSize(), "Checking basket's size");
    }

    @Test
    @DisplayName("remove from basket if fruit present")
    void testRemove() {
        fruitsBasket.remove(orange);
        assertEquals(1, fruitsBasket.getSize(), "Removing a fruit from the basket");
    }

    @Test
    @DisplayName("remove from basket if fruit empty")
    void testRemove_Exeption() {
        assertThrows(NoSuchElementException.class,
                () -> fruitsBasket.remove(banana), "Removing a fruit from the basket");
    }

    @Test
    @DisplayName("remove from basket if fruit empty")
    void testForTimeout() {
        assertTimeout(Duration.ofMillis(1L), () -> fruitsBasket.remove(apple), "Testing for productivity");
    }

    @Test
    @DisplayName("add a lot")
    void testAddALot() {
        List<Fruit> lot = Arrays.asList(
                new Fruit("Peach", 100),
                new Fruit("Tangerine", 50),
                new Fruit("Mango", 150)
        );
        assertTrue(fruitsBasket.addALot(lot), "Adding a lot of fruits");
    }

    @RepeatedTest(5)
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
