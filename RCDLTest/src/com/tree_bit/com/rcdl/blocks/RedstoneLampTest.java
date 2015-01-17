package com.tree_bit.com.rcdl.blocks;

import org.junit.*;

import com.tree_bit.com.rcdl.blocks.RedstoneLamp;

import static org.junit.Assert.*;

/**
 * The class <code>RedstoneLampTest</code> contains tests for the class <code>{@link RedstoneLamp}</code>.
 *
 * @generatedBy CodePro at 17.01.15 17:29
 * @author Alexander
 * @version $Revision: 1.0 $
 */
public class RedstoneLampTest {
	/**
	 * Run the RedstoneLamp(RedStoneLampType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 17:29
	 */
	@Test
	public void testRedstoneLamp_1()
		throws Exception {
		RedstoneLamp.Type type = RedstoneLamp.Type.RedstoneLampOFF;

		RedstoneLamp result = new RedstoneLamp(type);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getDatavalue());
		assertEquals(123, result.getMinecraftID());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 17.01.15 17:29
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
	 * @generatedBy CodePro at 17.01.15 17:29
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
	 * @generatedBy CodePro at 17.01.15 17:29
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RedstoneLampTest.class);
	}
}