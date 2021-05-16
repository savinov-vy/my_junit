package ru.savinov.junit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Таким образом можно собирать отдельные тесты в группы, сейчас запустятся все тесты в 3х классах
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({BubbleSortTest.class, NewInstanceForEachTest.class, WorkBeforeAndAfterAnnotations.class})
public class SuiteTests {

}
