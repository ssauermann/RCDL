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

	/**
	 * Current orientation
	 */
	private Orientation16 orientation;

	/**
	 * Creates a new standing sign with the given orientation.
	 *
	 * @param orientation
	 *            <b>Orientation16</b> orientation ({@link Orientation16})
	 * @param <b>String[]</b> sign text, one line per entry (max array length 4)
	 */
	public StandingSign(Orientation16 orientation, String[] text) {
		super(63, orientation.getDataValue());
		if (text.length > 4)
			throw new IllegalArgumentException(
					"Too much text for a sign. String array is too big (max 4): " + text.length);
		this.text = text;
		this.orientation = orientation;
	}

	@Override
	public void rotateCount(int count) {
		orientation = orientation.rotate(count * 4);
		datavalue = orientation.getDataValue();
	}

	@Override
	public void mirror(boolean xAxis) {
		orientation = orientation.mirror(xAxis);
	}
}
