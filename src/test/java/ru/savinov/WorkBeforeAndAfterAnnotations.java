package ru.savinov;

import org.junit.*;

/***
 * @Before, @After - методы выполняющиеся каждый раз перед методом @Test и после него соответственно
 * @BeforeClass, @AfterClass - статические методы выполняются один раз при загрузке и выгрузке класса
 */

public class WorkBeforeAndAfterAnnotations {

    User kolya = new User("Kolya", 24);

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("invoke from setUpBeforeClass");
    }

    @Before
    public void setUp() {
        kolya.setAge(30);
        System.out.println("invoke from setUp method");
    }

    @Test
    public void testOne() {
        System.out.println("invoke from testOne: " + kolya.getAge());
    }

    @Test
    public void testTwo() {
        System.out.println("invoke from testTwo: " + kolya.getAge());
    }

    @After
    public void tearDown() {
        kolya.setAge(20);
        System.out.println("invoke from tearDown method");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("invoke from tearDownAfterClass");
    }


}
