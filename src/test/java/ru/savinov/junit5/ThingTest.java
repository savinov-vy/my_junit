package ru.savinov.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import ru.savinov.junit5.test_helper.ThingParameterResolver;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ThingParameterResolver.class)
public class ThingTest {

    @Test
    void testAnswer(Thing thing) {
        assertEquals(42, thing.answer());
    }
}
