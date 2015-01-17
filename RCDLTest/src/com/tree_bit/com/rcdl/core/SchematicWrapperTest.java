package com.tree_bit.com.rcdl.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.jnbt.ShortTag;
import org.jnbt.Tag;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>SchematicWrapperTest</code> contains tests for the class
 * <code>{@link SchematicWrapper}</code>.
 *
 * @generatedBy CodePro at 17.01.15 15:29
 * @author Sascha
 * @version $Revision: 1.0 $
 */
public class SchematicWrapperTest {
	/**
	 * Run the SchematicWrapper(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 15:29
	 */
	@Test
	public void testSchematicWrapper_1() throws Exception {
		String path = "../RCDL/testfiles/big.nbt";

		SchematicWrapper result = new SchematicWrapper(path);
		assertNotNull(result);
	}

	/**
	 * Run the SchematicWrapper(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 15:29
	 */
	@Test
	public void testSchematicWrapper_2() throws Exception {
		String path = "../RCDL/testfiles/treeone.schematic";

		SchematicWrapper result = new SchematicWrapper(path);
		assertNotNull(result);
	}

	/**
	 * Run the SchematicWrapper(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 15:29
	 *
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testSchematicWrapper_3() throws Exception {
		String path = null;

		new SchematicWrapper(path);
	}

	/**
	 * Run the SchematicWrapper(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 15:29
	 */
	@Test(expected = IOException.class)
	public void testSchematicWrapper_4() throws Exception {
		String path = "";

		new SchematicWrapper(path);
	}

	/**
	 * Run the Tag read(ESchematicFields) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 15:29
	 */
	@Test
	public void testRead_1() throws Exception {
		SchematicWrapper fixture = SchematicWrapperFactory.createSchematicWrapper();
		ESchematicFields field = ESchematicFields.HEIGHT;

		Tag result = fixture.read(field);

		short val = ((ShortTag) result).getValue();

		assertEquals((short) 14, val);
		assertNotNull(result);
	}

	/**
	 * Run the byte[] readBlocks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 15:29
	 */
	@Test
	public void testReadBlocks_1() throws Exception {
		SchematicWrapper fixture = SchematicWrapperFactory.createSchematicWrapper();

		byte[] result = fixture.readBlocks();

		assertTrue(result[0] == 35);
		assertNotNull(result);
	}

	/**
	 * Run the byte[] readData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 15:29
	 */
	@Test
	public void testReadData_1() throws Exception {
		SchematicWrapper fixture = SchematicWrapperFactory.createSchematicWrapper();

		byte[] result = fixture.readData();

		assertTrue(result[0] == 14);
		assertNotNull(result);
	}

	/**
	 * Run the short readHeight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 15:29
	 */
	@Test
	public void testReadHeight_1() throws Exception {
		SchematicWrapper fixture = SchematicWrapperFactory.createSchematicWrapper();

		short result = fixture.readHeight();

		assertEquals((short) 14, result);
	}

	/**
	 * Run the short readLength() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 15:29
	 */
	@Test
	public void testReadLength_1() throws Exception {
		SchematicWrapper fixture = SchematicWrapperFactory.createSchematicWrapper();

		short result = fixture.readLength();

		assertEquals((short) 8, result);
	}

	/**
	 * Run the short readWidth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 17.01.15 15:29
	 */
	@Test
	public void testReadWidth_1() throws Exception {
		SchematicWrapper fixture = SchematicWrapperFactory.createSchematicWrapper();

		short result = fixture.readWidth();

		assertEquals((short) 8, result);
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
		new org.junit.runner.JUnitCore().run(SchematicWrapperTest.class);
	}
}