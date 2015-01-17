package com.tree_bit.com.rcdl.datatypes;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BitTest</code> contains tests for the class <code>{@link Bit}</code>.
 *
 * @generatedBy CodePro at 17.01.15 20:14
 * @author Sascha
 * @version $Revision: 1.0 $
 */
public class BitTest {
	/**
	 * Run the Bit(EKind,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 20:14
	 */
	@Test
	public void testBit_1()
		throws Exception {
		Datatype.EKind kind = Datatype.EKind.IN;
		boolean value = true;

		Bit result = new Bit(kind, value);

		// add additional test code here
		assertNotNull(result);
		assertEquals(Boolean.TRUE, result.getValue());
	}

	/**
	 * Run the Boolean getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 20:14
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		Bit fixture = BitFactory.createBit();

		Boolean result = fixture.getValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals("false", result.toString());
		assertEquals(false, result.booleanValue());
	}

	/**
	 * Run the Boolean getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 20:14
	 */
	@Test
	public void testGetValue_2()
		throws Exception {
		Bit fixture = BitFactory.createBit2();

		Boolean result = fixture.getValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 17.01.15 20:14
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 17.01.15 20:14
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 17.01.15 20:14
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BitTest.class);
	}
}