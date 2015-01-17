package com.tree_bit.com.rcdl.blocks;

import com.tree_bit.com.rcdl.blocks.RedstoneLamp;



/**
 * The class <code>RedstoneLampFactory</code> implements static methods that return instances of the class <code>{@link RedstoneLamp}</code>.
 *
 * @generatedBy CodePro at 17.01.15 17:24
 * @author Alexander
 * @version $Revision: 1.0 $
 */
public class RedstoneLampFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 17.01.15 17:24
	 */
	private RedstoneLampFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link RedstoneLamp}</code>.
	 *
	 * @generatedBy CodePro at 17.01.15 17:24
	 */
	public static RedstoneLamp createRedstoneLamp() {
		return new RedstoneLamp(RedstoneLamp.Type.RedstoneLampOFF);
	}
}