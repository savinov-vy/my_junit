package ru.savinov.junit4;

import org.junit.Test;

/**
 * Класс доказывающий что для каждого теста создается новый инстанс класса NewInstanceForEachTest
 * не смотря на изменненный возраст в первом тесте во втором тесте возвраст вернулся в исходное состояние
 * Если сделать переменную static то новый инстанс объекта NewInstanceForEachTest на неё не повлияет (static не при-
 * надлежит объекту)
 */
public class NewInstanceForEachTest {

   /* static*/ User kolya = new User("Kolya", 24);

    @Test
    public void testOne() {
        System.out.println("testOne: " + kolya.getAge());
        kolya.setAge(30);
        System.out.println("testOne: " + kolya.getAge());
    }

    @Test
    public void testTwo() {
        System.out.println("testTwo: " + kolya.getAge());
    }
}
