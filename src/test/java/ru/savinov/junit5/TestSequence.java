package ru.savinov.junit5;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.FixMethodOrder;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
//import org.junit.runners.MethodSorters;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestSequence {

//	@BeforeAll
//	static void initAll(TestInfo info) {
//		System.out.println("in " + info.getDisplayName());
////		System.out.println("before all tests");
//	}
//	@AfterAll
//	static void destroyAll(TestInfo info) {
//		System.out.println("in " + info.getDisplayName());
////		System.out.println("after all tests");
//	}
	
//	@Test
//	void test1(TestInfo info) {
//		System.out.println("in " + info.getDisplayName());
//	}
//	@Test
//	void hello(TestInfo info) {
//		System.out.println("in " + info.getDisplayName());
//	}
//	@Test
//	void hithere(TestInfo info) {
//		System.out.println("in " + info.getDisplayName());
//	}
//
//	@Test
//	@DisplayName("When string is null, throw an NPE")
//	void testException() {
//		String str = null;
//		assertThrows(
//				NullPointerException.class,
//				()->str.length());
//	}
	
//	@Test
	@RepeatedTest(name = "Repeated test", value = 5)
	void testRepeated() {
		System.out.println("in testRepeated()");
	}
	
	
	
	
}
