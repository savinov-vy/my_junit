package ru.savinov;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {
    StringUtils stringUtils;

    @Before
    public void init() {
        stringUtils = new StringUtils();
    }

    // "  **" ---> "**", " **" ---> "**", "****" ---> "****", "**  " ---> "**  "
    //  actual -> expected
    @Test
    public void testChopOff2SpacesAtHead_BothAtLeft() {
        assertEquals("**", stringUtils.chopOff2SpacesAtHead("  **"));
    }

    @Test
    public void testChopOff2SpacesAtHead_SingleAtLeft() {
        assertEquals("**", stringUtils.chopOff2SpacesAtHead(" **"));
    }

    @Test
    public void testChopOff2SpacesAtHead_None() {
        assertEquals("****", stringUtils.chopOff2SpacesAtHead("****"));
    }

    @Test
    public void testChopOff2SpacesAtHead_BothAtRight() {
        assertEquals("**  ", stringUtils.chopOff2SpacesAtHead("**  "));
    }
    // "1234" --> false, "1212" ---> true, "12" --> true, "1" --> false
    @Test
    public void testAre2CharsAtHeadAndTailEqual_notEqueal() {
        assertFalse(stringUtils.are2CharsAtHeadAndTailEqual("1234"));
    }

    @Test
    public void testAre2CharsAtHeadAndTailEqual_Equal() {
        assertTrue("work method equal", stringUtils.are2CharsAtHeadAndTailEqual("1212"));
    } // надписи использовались в случае если в одном тестовом методе несколько проверок, для уточнения

    @Test
    public void testAre2CharsAtHeadAndTailEqual_lowSymbols() {
        assertTrue(stringUtils.are2CharsAtHeadAndTailEqual("12"));
    }

    @Test
    public void testAre2CharsAtHeadAndTailEqual_OnlyOne() {
        assertFalse(stringUtils.are2CharsAtHeadAndTailEqual("1"));
    }
}