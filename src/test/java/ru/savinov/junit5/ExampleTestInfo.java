package ru.savinov.junit5;

import org.junit.jupiter.api.*;

public class ExampleTestInfo {

    @BeforeAll
   static void methodBeforeAll(TestInfo testInfo) {
        System.out.println("" + testInfo.getDisplayName());
    }

    @BeforeEach
    void init(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName() + "");
    }

    @Test
    void methodTest(TestInfo testInfo) {
        System.out.println("" + testInfo.getDisplayName());
    }

    @AfterEach
    void destroy(TestInfo testInfo) {
        System.out.println("" + testInfo.getDisplayName());
    }
}
