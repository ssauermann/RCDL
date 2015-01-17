package com.tree_bit.com.rcdl.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>RedStoneTorchTest</code> contains tests for the class
 * <code>{@link RedStoneTorch}</code>.
 *
 * @generatedBy CodePro at 17.01.15 15:41
 * @author Alexander
 * @version $Revision: 1.0 $
 */
public class RedStoneTorchTest {
	/**
	 * Run the RedStoneTorch(TorchDataValues,TorchType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 15:41
	 */
	@Test
	public void testRedStoneTorch_1() throws Exception {
		RedStoneTorch.TorchDataValues torchdatavalues = RedStoneTorch.TorchDataValues.FacingEast;
		RedStoneTorch.TorchType torchtype = RedStoneTorch.TorchType.RedstoneTorchOff;

		RedStoneTorch result = new RedStoneTorch(torchdatavalues, torchtype);

		// add additional test code here
		assertNotNull(result);
		assertEquals(75, result.getTorchtype());
		assertEquals(1, result.getTorchdatavalues());
	}

	/**
	 * Run the int getTorchdatavalues() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 15:41
	 */
	@Test
	public void testGetTorchdatavalues_1() throws Exception {
		RedStoneTorch fixture = RedStoneTorchFactory.createRedStoneTorch();

		int result = fixture.getTorchdatavalues();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getTorchtype() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 15:41
	 */
	@Test
	public void testGetTorchtype_1() throws Exception {
		RedStoneTorch fixture = RedStoneTorchFactory.createRedStoneTorch2();

		int result = fixture.getTorchtype();

		// add additional test code here
		assertEquals(76, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 17.01.15 15:41
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
	 * @generatedBy CodePro at 17.01.15 15:41
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
	 * @generatedBy CodePro at 17.01.15 15:41
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RedStoneTorchTest.class);
	}
}