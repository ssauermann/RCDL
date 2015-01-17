package com.tree_bit.com.rcdl.blocks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tree_bit.com.rcdl.blocks.RedStoneTorch;

/**
 * The class <code>RedStoneTorchTest</code> contains tests for the class
 * <code>{@link RedStoneTorch}</code>.
 *
 * @generatedBy CodePro at 17.01.15 16:15
 * @author Alexander
 * @version $Revision: 1.0 $
 */
public class RedStoneTorchTest {
	/**
	 * Run the RedStoneTorch(TorchType,TorchDataValues) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 16:15
	 */
	@Test
	public void testRedStoneTorch_1() throws Exception {
		RedStoneTorch.TorchType torchtype = RedStoneTorch.TorchType.RedstoneTorchOff;
		RedStoneTorch.TorchDataValues torchdatavalues = RedStoneTorch.TorchDataValues.FacingEast;

		RedStoneTorch result = new RedStoneTorch(torchtype, torchdatavalues);

		// add additional test code here
		assertNotNull(result);
		assertEquals(75, result.getMinecraftID());
		assertEquals(1, result.getDatavalue());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 17.01.15 16:15
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
	 * @generatedBy CodePro at 17.01.15 16:15
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
	 * @generatedBy CodePro at 17.01.15 16:15
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RedStoneTorchTest.class);
	}
}