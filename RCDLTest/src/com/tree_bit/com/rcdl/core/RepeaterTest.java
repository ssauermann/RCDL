package com.tree_bit.com.rcdl.core;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RepeaterTest</code> contains tests for the class <code>{@link Repeater}</code>.
 *
 * @generatedBy CodePro at 17.01.15 17:30
 * @author Alexander
 * @version $Revision: 1.0 $
 */
public class RepeaterTest {
	/**
	 * Run the Repeater(RepeaterType,RepeaterOrientation,RepeaterDelay) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 17:30
	 */
	@Test
	public void testRepeater_1()
		throws Exception {
		Repeater.RepeaterType repeatertype = Repeater.RepeaterType.RepeaterBlockOFF;
		Repeater.RepeaterOrientation orientation = Repeater.RepeaterOrientation.FacingEast;
		Repeater.RepeaterDelay delay = Repeater.RepeaterDelay.Delay1;

		Repeater result = new Repeater(repeatertype, orientation, delay);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getDatavalue());
		assertEquals(93, result.getMinecraftID());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 17.01.15 17:30
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
	 * @generatedBy CodePro at 17.01.15 17:30
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
	 * @generatedBy CodePro at 17.01.15 17:30
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RepeaterTest.class);
	}
}