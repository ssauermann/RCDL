package com.tree_bit.com.rcdl.blocks;

import com.tree_bit.com.rcdl.blocks.Repeater;



/**
 * The class <code>RepeaterFactory</code> implements static methods that return instances of the class <code>{@link Repeater}</code>.
 *
 * @generatedBy CodePro at 17.01.15 17:24
 * @author Alexander
 * @version $Revision: 1.0 $
 */
public class RepeaterFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 17.01.15 17:24
	 */
	private RepeaterFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Repeater}</code>.
	 *
	 * @generatedBy CodePro at 17.01.15 17:24
	 */
	public static Repeater createRepeater() {
		return new Repeater(Repeater.RepeaterType.RepeaterBlockOFF, Repeater.RepeaterOrientation.FacingEast, Repeater.RepeaterDelay.Delay1);
	}


	/**
	 * Create an instance of the class <code>{@link Repeater}</code>.
	 *
	 * @generatedBy CodePro at 17.01.15 17:24
	 */
	public static Repeater createRepeater2() {
		return new Repeater(Repeater.RepeaterType.RepeaterBlockOFF, Repeater.RepeaterOrientation.FacingSouth, Repeater.RepeaterDelay.Delay3);
	}


	/**
	 * Create an instance of the class <code>{@link Repeater}</code>.
	 *
	 * @generatedBy CodePro at 17.01.15 17:24
	 */
	public static Repeater createRepeater3() {
		return new Repeater(Repeater.RepeaterType.RepeaterBlockOn, Repeater.RepeaterOrientation.FacingNorth, Repeater.RepeaterDelay.Delay2);
	}
}