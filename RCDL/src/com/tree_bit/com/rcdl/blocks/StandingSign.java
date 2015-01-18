package com.tree_bit.com.rcdl.blocks;

/**
 * A sign which is placed on top of another Block (if you want a sign which is on the side of a
 * block use HangingSign instead)
 *
 * @author Alexander
 *
 */
public class StandingSign extends Blocks {

	/**
	 * The Direction the sign is facing++
	 *
	 * @param orientation
	 *            (NorthNorthEast , NorthEast, North etc.)
	 */
	public StandingSign(Orientation orientation, String[] text) {
		super(63, orientation.getOrientation());
		if (text.length > 4)
			throw new IllegalArgumentException("Too much text for a sign. String array is too big.");
	}

	public enum Orientation {
		South(0), SouthSouthWest(1), SouthWest(2), WestSouthWest(3), West(4), WestNorthWest(5), NorthWest(
				6), NorthNorthWest(7), North(8), NorthNorthEast(9), NorthEast(10), EastNorthEast(11), East(
				12), EastSouthEast(13), SouthEast(14), SouthSouthEast(15);

		private int value;

		private Orientation(int value) {
			this.value = value;
		}

		private int getOrientation() {
			return value;
		}
	}

}
