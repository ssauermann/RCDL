package com.tree_bit.com.rcdl.blocks;

import org.junit.*;

import com.tree_bit.com.rcdl.blocks.HalfSlabs;

import static org.junit.Assert.*;

/**
 * The class <code>HalfSlabsTest</code> contains tests for the class <code>{@link HalfSlabs}</code>.
 *
 * @generatedBy CodePro at 17.01.15 18:04
 * @author Alexander
 * @version $Revision: 1.0 $
 */
public class HalfSlabsTest {
	/**
	 * Run the HalfSlabs(Type,Postion) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 18:04
	 */
	@Test
	public void testHalfSlabs_1()
		throws Exception {
		HalfSlabs.Type type = HalfSlabs.Type.Bricks;
		HalfSlabs.Postion position = HalfSlabs.Postion.Down;

		HalfSlabs result = new HalfSlabs(type, position);

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.getDatavalue());
		assertEquals(44, result.getMinecraftID());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 17.01.15 18:04
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
	 * @generatedBy CodePro at 17.01.15 18:04
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
	 * @generatedBy CodePro at 17.01.15 18:04
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(HalfSlabsTest.class);
	}
}