package com.tenzin.junit.app.util;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.tenzin.junit.app.test.Account;
import com.tenzin.junit.app.test.Billing;

public class MathUtilTest {
	
	private MathUtil util = new MathUtil();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setup");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("teardown");
	}

	@Test
	@Category({Account.class, Billing.class})
	public void testAdd() {
		//fail("Not yet implemented");
		//System.out.println("testAdd() called");
		int result = util.add(20, 10);
		assertEquals(30, result);
		result = util.add(-10, 20);
		assertEquals(10, result);
		result = util.add(10, -20);
		assertEquals(-10, result);
		result = util.add(-10, -20);
		assertEquals(-30, result);
	}

	@Test
	@Category({Account.class})
	public void testSub() {
		//fail("Not yet implemented");
		//System.out.println("testSub() called");
		int result = util.sub(20, 10);
		assertEquals(10, result);
	}
	
	@Test
	@Category({Account.class})
	public void testDiv() {
		//fail("Not yet implemented");
		int result = util.div(50, 10);
		assertEquals(5, result);
	}

	@Test
	@Category({Billing.class})
	public void testMul() {
		//fail("Not yet implemented");
		int result = util.mul(10, 20);
		assertEquals(200, result);
	}
	
	@Test(expected = ArithmeticException.class)
	@Category({Billing.class})
	public void testDivByZero() {
		//fail("Not yet implemented");
		util.div(50, 0);
		//assertEquals(50, result);
	}
	
	@Test(timeout = 500)
	@Category({Billing.class})
	public void testTimeout() throws InterruptedException {
		//fail("Not yet implemented");
		Thread.sleep(400);
		int result = util.mul(50, 10);
		assertEquals(500, result);
	}

}
