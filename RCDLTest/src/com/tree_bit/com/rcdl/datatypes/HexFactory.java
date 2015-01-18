package com.tree_bit.com.rcdl.datatypes;

/**
 * The class <code>HexFactory</code> implements static methods that return instances of the class
 * <code>{@link Hex}</code>.
 *
 * @generatedBy CodePro at 17.01.15 20:13
 * @author Sascha
 * @version $Revision: 1.0 $
 */
public class HexFactory {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 17.01.15 20:13
	 */
	private HexFactory() {
	}

	/**
	 * Create an instance of the class <code>{@link Hex}</code>.
	 *
	 * @generatedBy CodePro at 17.01.15 20:13
	 */
	public static Hex createHex() {
		return new Hex(Datatype.EKind.IN, "ABC", '7');
	}

	/**
	 * Create an instance of the class <code>{@link Hex}</code>.
	 *
	 * @generatedBy CodePro at 17.01.15 20:13
	 */
	public static Hex createHex2() {
		return new Hex(Datatype.EKind.IN, "ABC", (short) 6);
	}

	/**
	 * Create an instance of the class <code>{@link Hex}</code>.
	 *
	 * @generatedBy CodePro at 17.01.15 20:13
	 */
	public static Hex createHex3() {
		return new Hex(Datatype.EKind.OUT, "ABC", 'e');
	}

	/**
	 * Create an instance of the class <code>{@link Hex}</code>.
	 *
	 * @generatedBy CodePro at 17.01.15 20:13
	 */
	public static Hex createHex4() {
		return new Hex(Datatype.EKind.OUT, "ABC", (short) 0);
	}
}