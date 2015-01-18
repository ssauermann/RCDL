package com.tree_bit.com.rcdl.blocks;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>HangingSignTest</code> contains tests for the class <code>{@link HangingSign}</code>.
 *
 * @generatedBy CodePro at 18.01.15 17:25
 * @author Alexander
 * @version $Revision: 1.0 $
 */
public class HangingSignTest {
	/**
	 * Run the HangingSign(Orientation,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 18.01.15 17:25
	 */
	@Test
	public void testHangingSign_1()
		throws Exception {
		HangingSign.Orientation orientation = HangingSign.Orientation.East;
		String[] text = new String[] {};

		HangingSign result = new HangingSign(orientation, text);

		// add additional test code here
		assertNotNull(result);
		assertEquals(5, result.getDatavalue());
		assertEquals(68, result.getMinecraftID());
	}

	/**
	 * Run the HangingSign(Orientation,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 18.01.15 17:25
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHangingSign_2()
		throws Exception {
		HangingSign.Orientation orientation = HangingSign.Orientation.East;
		String[] text = new String[] {null, null, null, null, null};

		HangingSign result = new HangingSign(orientation, text);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 18.01.15 17:25
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
	 * @generatedBy CodePro at 18.01.15 17:25
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
	 * @generatedBy CodePro at 18.01.15 17:25
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(HangingSignTest.class);
	}
}