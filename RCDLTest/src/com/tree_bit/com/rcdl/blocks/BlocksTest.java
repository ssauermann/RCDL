package com.tree_bit.com.rcdl.blocks;

import org.junit.*;

import com.tree_bit.com.rcdl.blocks.Blocks;

import static org.junit.Assert.*;

/**
 * The class <code>BlocksTest</code> contains tests for the class <code>{@link Blocks}</code>.
 *
 * @generatedBy CodePro at 17.01.15 17:29
 * @author Alexander
 * @version $Revision: 1.0 $
 */
public class BlocksTest {
	/**
	 * Run the int getDatavalue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 17:29
	 */
	@Test
	public void testGetDatavalue_1()
		throws Exception {
		Blocks fixture = BlocksFactory.createcreateRedStoneTorch2();

		int result = fixture.getDatavalue();

		// add additional test code here
		assertEquals(4, result);
	}

	/**
	 * Run the int getMinecraftID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 17:29
	 */
	@Test
	public void testGetMinecraftID_1()
		throws Exception {
		Blocks fixture = BlocksFactory.createcreateRedStoneTorch();

		int result = fixture.getMinecraftID();

		// add additional test code here
		assertEquals(75, result);
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
		new org.junit.runner.JUnitCore().run(BlocksTest.class);
	}
}