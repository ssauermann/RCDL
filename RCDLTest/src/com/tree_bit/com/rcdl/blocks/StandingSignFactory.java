package com.tree_bit.com.rcdl.blocks;

/**
 * The class <code>StandingSignFactory</code> implements static methods that return instances of the
 * class <code>{@link StandingSign}</code>.
 *
 * @generatedBy CodePro at 18.01.15 17:22
 * @author Alexander
 * @version $Revision: 1.0 $
 */
public class StandingSignFactory {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 18.01.15 17:22
	 */
	private StandingSignFactory() {
	}

	/**
	 * Create an instance of the class <code>{@link StandingSign}</code>.
	 *
	 * @generatedBy CodePro at 18.01.15 17:22
	 */
	public static StandingSign createStandingSign() {
		return new StandingSign(Orientation16.East, new String[] { "", "0123456789", "Ant-1.0.txt",
				null });
	}

	/**
	 * Create an instance of the class <code>{@link StandingSign}</code>.
	 *
	 * @generatedBy CodePro at 18.01.15 17:22
	 */
	public static StandingSign createStandingSign2() {
		return new StandingSign(Orientation16.EastNorthEast, new String[] { "" });
	}
}