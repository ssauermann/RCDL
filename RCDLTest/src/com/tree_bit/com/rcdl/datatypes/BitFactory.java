package com.tree_bit.com.rcdl.datatypes;

/**
 * The class <code>BitFactory</code> implements static methods that return instances of the class
 * <code>{@link Bit}</code>.
 *
 * @generatedBy CodePro at 17.01.15 20:13
 * @author Sascha
 * @version $Revision: 1.0 $
 */
public class BitFactory {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 17.01.15 20:13
	 */
	private BitFactory() {
	}

	/**
	 * Create an instance of the class <code>{@link Bit}</code>.
	 *
	 * @generatedBy CodePro at 17.01.15 20:13
	 */
	public static Bit createBit() {
		return new Bit(Datatype.EKind.IN, "ABC");
	}

	/**
	 * Create an instance of the class <code>{@link Bit}</code>.
	 *
	 * @generatedBy CodePro at 17.01.15 20:13
	 */
	public static Bit createBit2() {
		return new Bit(Datatype.EKind.OUT, "ABC");
	}
}