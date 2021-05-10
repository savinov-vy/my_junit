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
}