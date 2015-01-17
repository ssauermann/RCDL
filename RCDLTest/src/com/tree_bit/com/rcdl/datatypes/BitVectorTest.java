package com.tree_bit.com.rcdl.datatypes;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BitVectorTest</code> contains tests for the class <code>{@link BitVector}</code>.
 *
 * @generatedBy CodePro at 17.01.15 20:14
 * @author Sascha
 * @version $Revision: 1.0 $
 */
public class BitVectorTest {
	/**
	 * Run the BitVector(EKind,boolean[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 20:14
	 */
	@Test
	public void testBitVector_1()
		throws Exception {
		Datatype.EKind kind = Datatype.EKind.IN;
		boolean[] values = new boolean[] {};
		boolean reversed = false;

		BitVector result = new BitVector(kind, values, reversed);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the BitVector(EKind,boolean[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 20:14
	 */
	@Test
	public void testBitVector_2()
		throws Exception {
		Datatype.EKind kind = Datatype.EKind.IN;
		boolean[] values = new boolean[] {true};
		boolean reversed = true;

		BitVector result = new BitVector(kind, values, reversed);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the BitVector(EKind,boolean[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 20:14
	 */
	@Test
	public void testBitVector_3()
		throws Exception {
		Datatype.EKind kind = Datatype.EKind.IN;
		boolean[] values = new boolean[] {};
		boolean reversed = true;

		BitVector result = new BitVector(kind, values, reversed);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean[] getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 20:14
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		BitVector fixture = BitVectorFactory.createBitVector();

		boolean[] result = fixture.getValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals(false, result[0]);
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
		new org.junit.runner.JUnitCore().run(BitVectorTest.class);
	}
}