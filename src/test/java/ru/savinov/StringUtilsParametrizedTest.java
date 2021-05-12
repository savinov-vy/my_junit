package ru.savinov;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.*;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/***
 * Параметроризованный тест служит для тестирования одним тестом многие параметры
 * чтобы не создавать для каждого параметра отдельный тест
 */

@RunWith(value = Parameterized.class)
public class StringUtilsParametrizedTest {
    private Boolean boo;
    private String arg;

    public StringUtilsParametrizedTest(Boolean boo, String arg) {
        this.boo = boo;
        this.arg = arg;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getTestParameters() {
        return Arrays.asList(new Object[][] {
                {Boolean.FALSE, "1234"},
                {Boolean.TRUE, "1212"},
                {Boolean.FALSE, "1"},
                {Boolean.TRUE, "12"},
        });
    }

        @Test
        public void testAre2CharsAtHeadAndTailEqual(){
            StringUtils stringUtils = new StringUtils();
            assertEquals(boo, stringUtils.are2CharsAtHeadAndTailEqual(arg));
        };
}
