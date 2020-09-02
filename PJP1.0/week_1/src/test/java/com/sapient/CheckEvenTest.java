package com.sapient;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckEvenTest {
	private CheckEven app;
	@Before
	public void setup(){
		app = new CheckEven();
	}

	@Test
	public void testEven(){
		int n=4;
		assertTrue(app.check(n));
	}

	@Test
	public void testOdd(){
		int n=3;
		assertFalse(app.check(n));
	}

	@Test
	public void testNegativeEven(){
		int n=-300;
		assertTrue(app.check(n));
	}

	@Test
	public void testZero(){
		int n=0;
		assertTrue(app.check(n));
	}
}