package com.tree_bit.com.rcdl.datatypes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>HexTest</code> contains tests for the class <code>{@link Hex}</code>.
 *
 * @generatedBy CodePro at 17.01.15 20:14
 * @author Sascha
 * @version $Revision: 1.0 $
 */
public class HexTest {
	/**
	 * Run the Hex(EKind,char) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 20:14
	 */
	@Test
	public void testHex_1() throws Exception {
		Datatype.EKind kind = Datatype.EKind.IN;
		char value = 'A';

		Hex result = new Hex(kind, "ABC", value);

		assertNotNull(result);
		assertEquals(new Short((short) 10), result.getValue());
	}

	/**
	 * Run the Hex(EKind,short) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 20:14
	 */
	@Test
	public void testHex_2() throws Exception {
		Datatype.EKind kind = Datatype.EKind.IN;
		short value = (short) 1;

		Hex result = new Hex(kind, "ABC", value);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Short((short) 1), result.getValue());
	}

	/**
	 * Run the Hex(EKind,short) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 20:14
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHex_3() throws Exception {
		Datatype.EKind kind = Datatype.EKind.IN;
		short value = (short) -1;

		Hex result = new Hex(kind, "ABC", value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Hex(EKind,short) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 20:14
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHex_4() throws Exception {
		Datatype.EKind kind = Datatype.EKind.IN;
		short value = (short) 16;

		Hex result = new Hex(kind, "ABC", value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Short getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 20:14
	 */
	@Test
	public void testGetValue_1() throws Exception {
		Hex fixture = HexFactory.createHex();

		Short result = fixture.getValue();
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 17.01.15 20:14
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
	 * @generatedBy CodePro at 17.01.15 20:14
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
	 * @generatedBy CodePro at 17.01.15 20:14
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(HexTest.class);
	}
}