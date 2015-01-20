package com.tree_bit.com.rcdl.blocks;

/**
 * A sign which is placed on top of another block (if you want a sign which is on the side of a
 * block use {@link HangingSign} instead).
 *
 * To configure the orientation of this sign use the values of the {@link Orientation16
 * Orientation16 Enum}.
 *
 * @author Alexander
 * @author Sascha Sauermann
 *
 */
public class StandingSign extends Blocks {

	private Orientation16 orientation;

	/**
	 * The Direction the sign is facing++
	 *
	 * @param orientation
	 *            (NorthNorthEast , NorthEast, North etc.)
	 */
	public StandingSign(Orientation16 orientation, String[] text) {
		super(63, orientation.getDataValue());
		if (text.length > 4)
			throw new IllegalArgumentException("Too much text for a sign. String array is too big.");
		this.text = text;
		this.orientation = orientation;
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
			orientation = orientation.next();
		}

		datavalue = orientation.getDataValue();
	}

	@Override
	public void mirror(boolean xAxis) {
		orientation = orientation.mirror(xAxis);
	}
}
