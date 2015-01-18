package com.tree_bit.com.rcdl.blocks;

/**
 * A Sign which is placed on the side of a block (not on Top, if you need to place a sign on top of
 * a block use StandingSign instead)
 *
 * @author Alexander
 * @author Sascha Sauermann
 *
 */
public class HangingSign extends Blocks {

	private Orientation orientation;

	/**
	 * Defines which direction the front side of the sign faces
	 *
	 * @param orientation
	 *            (North, West etc.)
	 */
	public HangingSign(Orientation orientation, String[] text) {
		super(68, orientation.getOrientation());
		if (text.length > 4)
			throw new IllegalArgumentException("Too much text for a sign. String array is too big.");
		this.text = text;
		this.orientation = orientation;
	}

	public enum Orientation {
		North(2), East(5), South(3), West(4);

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

		for (int i = 0; i < count; i++)
		{
			orientation = orientation.getNext();
		}

		datavalue = orientation.getOrientation();
	}
}
