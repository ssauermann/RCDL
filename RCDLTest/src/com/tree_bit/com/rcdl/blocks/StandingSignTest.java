package com.tree_bit.com.rcdl.blocks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>StandingSignTest</code> contains tests for the class
 * <code>{@link StandingSign}</code>.
 *
 * @generatedBy CodePro at 18.01.15 17:24
 * @author Alexander
 * @version $Revision: 1.0 $
 */
public class StandingSignTest {
	/**
	 * Run the StandingSign(Orientation,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 18.01.15 17:24
	 */
	@Test
	public void testStandingSign_1() throws Exception {
		Orientation16 orientation = Orientation16.East;
		String[] text = new String[] {};

		StandingSign result = new StandingSign(orientation, text);

		// add additional test code here
		assertNotNull(result);
		assertEquals(12, result.getDatavalue());
		assertEquals(63, result.getMinecraftID());
	}

	/**
	 * Run the StandingSign(Orientation,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 18.01.15 17:24
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testStandingSign_2() throws Exception {
		Orientation16 orientation = Orientation16.East;
		String[] text = new String[] { null, null, null, null, null };

		StandingSign result = new StandingSign(orientation, text);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 18.01.15 17:24
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
	 * @generatedBy CodePro at 18.01.15 17:24
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
	 * @generatedBy CodePro at 18.01.15 17:24
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(StandingSignTest.class);
	}
}