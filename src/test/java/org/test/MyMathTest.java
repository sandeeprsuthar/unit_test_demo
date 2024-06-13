package org.test;

import static org.junit.jupiter.api.Assertions.*;

import org.example.MyMath;
import org.junit.jupiter.api.Test;

class MyMathTest {

	MyMath myMath = new MyMath();
	
	@Test
	void test1() {
		assertEquals(60, myMath.calculateSum(new int[] {10,20,30}));

	}
	
	@Test
	void test2() {
		assertEquals(0, myMath.calculateSum(new int[] {}));

	}

}
