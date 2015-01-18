package com.tree_bit.com.rcdl.blocks;

/**
 * A sign which is placed on top of another Block (if you want a sign which is on the side of a
 * block use HangingSign instead)
 *
 * @author Alexander
 * @author Sascha Sauermann
 *
 */
public class StandingSign extends Blocks {

	private Orientation orientation;

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
		this.text = text;
		this.orientation = orientation;
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

		public Orientation getNext() {
			return values()[(ordinal() + 1) % values().length];
		}
	}

	@Override
	public void rotate(int degree) {
		rotate(degree);

		int count = (Math.abs(degree) % 90) + 1;

		if (degree < 0)
		{
			// -90 or -270
			if ((degree % 180) != 0)
			{
				// switch -90%
				count = (Math.abs(degree) % 90) + 3;
			}
		}

		for (int i = 0; i < (count * 4); i++)
		{
			orientation = orientation.getNext();
		}

		datavalue = orientation.getOrientation();
	}
}
