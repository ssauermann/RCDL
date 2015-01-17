package com.tree_bit.com.rcdl.blocks;

import com.tree_bit.com.rcdl.blocks.HalfSlabs;

/**
 * The class <code>HalfSlabsFactory</code> implements static methods that return instances of the
 * class <code>{@link HalfSlabs}</code>.
 *
 * @generatedBy CodePro at 17.01.15 17:59
 * @author Alexander
 * @version $Revision: 1.0 $
 */
public class HalfSlabsFactory {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 17.01.15 17:59
	 */
	private HalfSlabsFactory() {
	}

	/**
	 * Create an instance of the class <code>{@link HalfSlabs}</code>.
	 *
	 * @generatedBy CodePro at 17.01.15 17:59
	 */
	public static HalfSlabs createHalfSlabs() {
		return new HalfSlabs(HalfSlabs.Type.Bricks, HalfSlabs.Postion.Down);
	}

	/**
	 * Create an instance of the class <code>{@link HalfSlabs}</code>.
	 *
	 * @generatedBy CodePro at 17.01.15 17:59
	 */
	public static HalfSlabs createHalfSlabs2() {
		return new HalfSlabs(HalfSlabs.Type.Cobblestone, HalfSlabs.Postion.UP);
	}
}