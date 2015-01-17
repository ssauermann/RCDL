package com.tree_bit.com.rcdl.blocks;

import org.junit.*;

import com.tree_bit.com.rcdl.blocks.Redstone;

import static org.junit.Assert.*;

/**
 * The class <code>RedstoneTest</code> contains tests for the class <code>{@link Redstone}</code>.
 *
 * @generatedBy CodePro at 17.01.15 17:29
 * @author Alexander
 * @version $Revision: 1.0 $
 */
public class RedstoneTest {
	/**
	 * Run the Redstone() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 17:29
	 */
	@Test
	public void testRedstone_1()
		throws Exception {

		Redstone result = new Redstone();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getDatavalue());
		assertEquals(55, result.getMinecraftID());
	}

	/**
	 * Run the Redstone(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 17:29
	 */
	@Test
	public void testRedstone_2()
		throws Exception {
		int power = 1;

		Redstone result = new Redstone(power);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getDatavalue());
		assertEquals(55, result.getMinecraftID());
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
		new org.junit.runner.JUnitCore().run(RedstoneTest.class);
	}
}