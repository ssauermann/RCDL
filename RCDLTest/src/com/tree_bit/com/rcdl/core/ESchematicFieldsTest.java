package com.tree_bit.com.rcdl.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.jnbt.NBTConstants;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>ESchematicFieldsTest</code> contains tests for the class
 * <code>{@link ESchematicFields}</code>.
 *
 * @generatedBy CodePro at 17.01.15 15:29
 * @author Sascha
 * @version $Revision: 1.0 $
 */
public class ESchematicFieldsTest {
	/**
	 * Run the String getKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 15:29
	 */
	@Test
	public void testGetKey_1() throws Exception {
		ESchematicFields fixture = ESchematicFields.BLOCKS;

		String result = fixture.getKey();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 15:29
	 */
	@Test
	public void testGetType_1() throws Exception {
		ESchematicFields fixture = ESchematicFields.BLOCKS;

		int result = fixture.getType();

		assertEquals(NBTConstants.TYPE_BYTE_ARRAY, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 17.01.15 15:29
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
	 * @generatedBy CodePro at 17.01.15 15:29
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
	 * @generatedBy CodePro at 17.01.15 15:29
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ESchematicFieldsTest.class);
	}
}