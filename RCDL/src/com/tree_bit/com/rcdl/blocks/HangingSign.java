package com.tree_bit.com.rcdl.blocks;

/**
 * A Sign which is placed on the side of a block (not on Top, if you need to place a sign on top of
 * a block use StandingSign instead)
 *
 * @author Alexander
 *
 */
public class HangingSign extends Blocks {

	/**
	 * Defines which direction the front side of the sign faces
	 *
	 * @param orientation
	 *            (North,West etc.)
	 */
	public HangingSign(Orientation orientation) {
		super(68, orientation.getOrientation());
	}

	public enum Orientation {
		North(2), South(3), West(4), East(5);

		private int value;

		private Orientation(int value) {
			this.value = value;
		}

		private int getOrientation() {
			return value;
		}
	}
}
