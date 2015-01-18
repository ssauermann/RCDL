package com.tree_bit.com.rcdl.blocks;

/**
 * The class <code>HangingSignFactory</code> implements static methods that return instances of the
 * class <code>{@link HangingSign}</code>.
 *
 * @generatedBy CodePro at 18.01.15 17:22
 * @author Alexander
 * @version $Revision: 1.0 $
 */
public class HangingSignFactory {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 18.01.15 17:22
	 */
	private HangingSignFactory() {
	}

	/**
	 * Create an instance of the class <code>{@link HangingSign}</code>.
	 *
	 * @generatedBy CodePro at 18.01.15 17:22
	 */
	public static HangingSign createHangingSign() {
		return new HangingSign(HangingSign.Orientation.East, new String[] { "", "0123456789",
				"Ant-1.0.txt", null });
	}

	/**
	 * Create an instance of the class <code>{@link HangingSign}</code>.
	 *
	 * @generatedBy CodePro at 18.01.15 17:22
	 */
	public static HangingSign createHangingSign2() {
		return new HangingSign(HangingSign.Orientation.North, new String[] { "" });
	}
}