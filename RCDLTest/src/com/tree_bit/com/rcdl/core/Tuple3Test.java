package com.tree_bit.com.rcdl.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>Tuple3Test</code> contains tests for the class <code>{@link Tuple3}</code>.
 *
 * @generatedBy CodePro at 17.01.15 19:41
 * @author Sascha
 * @version $Revision: 1.0 $
 */
public class Tuple3Test {
	/**
	 * Run the Tuple3(Tuple3) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 19:41
	 */
	@Test
	public void testTuple3_1() throws Exception {
		Tuple3 tuple = Tuple3Factory.createTuple3();

		Tuple3 result = new Tuple3(tuple);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getX());
		assertEquals(0, result.getY());
		assertEquals(0, result.getZ());
	}

	/**
	 * Run the Tuple3(Tuple3) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 19:41
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testTuple3_2() throws Exception {
		Tuple3 tuple = null;

		Tuple3 result = new Tuple3(tuple);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Tuple3(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 19:41
	 */
	@Test
	public void testTuple3_3() throws Exception {
		int x = 1;
		int y = 1;
		int z = 1;

		Tuple3 result = new Tuple3(x, y, z);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getX());
		assertEquals(1, result.getY());
		assertEquals(1, result.getZ());
	}

	/**
	 * Run the Tuple3 add(Tuple3) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 19:41
	 */
	@Test
	public void testAdd_1() throws Exception {
		Tuple3 fixture = Tuple3Factory.createTuple32();
		Tuple3 t = Tuple3Factory.createTuple33();

		Tuple3 result = fixture.add(t);

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.getX());
		assertEquals(10, result.getY());
		assertEquals(5, result.getZ());
	}

	/**
	 * Run the int compareTo(Tuple3) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 19:41
	 */
	@Test
	public void testCompareTo_1() throws Exception {
		Tuple3 fixture = Tuple3Factory.createTuple33();
		Tuple3 o = Tuple3Factory.createTuple3();

		int result = fixture.compareTo(o);

		// add additional test code here
		assertEquals(106, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 19:41
	 */
	@Test
	public void testEquals_1() throws Exception {
		Tuple3 fixture = Tuple3Factory.createTuple33();
		Object obj = Tuple3Factory.createTuple3();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 19:41
	 */
	@Test
	public void testEquals_2() throws Exception {
		Tuple3 fixture = Tuple3Factory.createTuple32();
		Object obj = null;

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 19:41
	 */
	@Test
	public void testEquals_3() throws Exception {
		Tuple3 fixture = Tuple3Factory.createTuple33();
		Object obj = new Object();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 19:41
	 */
	@Test
	public void testEquals_4() throws Exception {
		Tuple3 fixture = Tuple3Factory.createTuple3();
		Object obj = Tuple3Factory.createTuple32();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 19:41
	 */
	@Test
	public void testEquals_5() throws Exception {
		Tuple3 fixture = Tuple3Factory.createTuple33();
		Object obj = Tuple3Factory.createTuple3();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 19:41
	 */
	@Test
	public void testEquals_6() throws Exception {
		Tuple3 fixture = Tuple3Factory.createTuple32();
		Object obj = Tuple3Factory.createTuple33();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 19:41
	 */
	@Test
	public void testEquals_7() throws Exception {
		Tuple3 fixture = Tuple3Factory.createTuple3();
		Object obj = Tuple3Factory.createTuple32();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int getX() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 19:41
	 */
	@Test
	public void testGetX_1() throws Exception {
		Tuple3 fixture = Tuple3Factory.createTuple32();

		int result = fixture.getX();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getY() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 19:41
	 */
	@Test
	public void testGetY_1() throws Exception {
		Tuple3 fixture = Tuple3Factory.createTuple3();

		int result = fixture.getY();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getZ() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 19:41
	 */
	@Test
	public void testGetZ_1() throws Exception {
		Tuple3 fixture = Tuple3Factory.createTuple33();

		int result = fixture.getZ();

		// add additional test code here
		assertEquals(4, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 19:41
	 */
	@Test
	public void testHashCode_1() throws Exception {
		Tuple3 fixture = Tuple3Factory.createTuple32();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(30784, result);
	}

	/**
	 * Run the Tuple3 negate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 19:41
	 */
	@Test
	public void testNegate_1() throws Exception {
		Tuple3 fixture = Tuple3Factory.createTuple32();

		Tuple3 result = fixture.negate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1, result.getX());
		assertEquals(-1, result.getY());
		assertEquals(-1, result.getZ());
	}

	/**
	 * Run the void setX(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 19:41
	 */
	@Test
	public void testSetX_1() throws Exception {
		Tuple3 fixture = Tuple3Factory.createTuple33();
		int x = 1;

		fixture.setX(x);

		// add additional test code here
	}

	/**
	 * Run the void setY(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 19:41
	 */
	@Test
	public void testSetY_1() throws Exception {
		Tuple3 fixture = Tuple3Factory.createTuple32();
		int y = 1;

		fixture.setY(y);

		// add additional test code here
	}

	/**
	 * Run the void setZ(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 19:41
	 */
	@Test
	public void testSetZ_1() throws Exception {
		Tuple3 fixture = Tuple3Factory.createTuple3();
		int z = 1;

		fixture.setZ(z);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 17.01.15 19:41
	 */
	@Before
	public void setUp() throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *             if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 17.01.15 19:41
	 */
	@After
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args
	 *            the command line arguments
	 *
	 * @generatedBy CodePro at 17.01.15 19:41
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(Tuple3Test.class);
	}
}