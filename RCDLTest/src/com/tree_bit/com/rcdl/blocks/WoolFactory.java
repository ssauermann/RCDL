package com.tree_bit.com.rcdl.blocks;

import com.tree_bit.com.rcdl.blocks.Wool;

/**
 * The class <code>WoolFactory</code> implements static methods that return instances of the class
 * <code>{@link Wool}</code>.
 *
 * @generatedBy CodePro at 17.01.15 17:24
 * @author Alexander
 * @version $Revision: 1.0 $
 */
public class WoolFactory {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 17.01.15 17:24
	 */
	private WoolFactory() {
	}

	/**
	 * Create an instance of the class <code>{@link Wool}</code>.
	 *
	 * @generatedBy CodePro at 17.01.15 17:24
	 */
	public static Wool createWool() {
		return new Wool(Wool.WoolColor.Black);
	}

	public static Wool createWool1() {
		return new Wool(Wool.WoolColor.Blue);
	}

	public static Wool createWool2() {
		return new Wool(Wool.WoolColor.Brown);
	}

	public static Wool createWool3() {
		return new Wool(Wool.WoolColor.Magenta);
	}

	public static Wool createWool4() {
		return new Wool(Wool.WoolColor.Yellow);
	}
}