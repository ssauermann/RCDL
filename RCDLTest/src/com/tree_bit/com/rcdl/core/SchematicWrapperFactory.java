package com.tree_bit.com.rcdl.core;

/**
 * The class <code>SchematicWrapperFactory</code> implements static methods that return instances of
 * the class <code>{@link SchematicWrapper}</code>.
 *
 * @generatedBy CodePro at 17.01.15 15:26
 * @author Sascha
 * @version $Revision: 1.0 $
 */
public class SchematicWrapperFactory {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 17.01.15 15:26
	 */
	private SchematicWrapperFactory() {
	}

	/**
	 * Create an instance of the class <code>{@link SchematicWrapper}</code>.
	 *
	 * @generatedBy CodePro at 17.01.15 15:26
	 */
	public static SchematicWrapper createSchematicWrapper() throws java.io.FileNotFoundException,
	java.io.IOException {
		return new SchematicWrapper("../RCDL/testfiles/treeone.schematic");
	}

	/**
	 * Create an instance of the class <code>{@link SchematicWrapper}</code>.
	 *
	 * @generatedBy CodePro at 17.01.15 15:26
	 */
	public static SchematicWrapper createSchematicWrapper2() throws java.io.FileNotFoundException,
	java.io.IOException {
		return new SchematicWrapper("../RCDL/testfiles/big.nbt");
	}
}