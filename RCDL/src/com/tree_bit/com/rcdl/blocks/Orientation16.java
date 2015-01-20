package com.tree_bit.com.rcdl.blocks;

/**
 * Enum containing all 16 different orientations minecraft has to offer for blocks.
 *
 * <p>
 * This is used by:
 * <ul>
 * <li>{@link StandingSign}</li>
 * </ul>
 * </p>
 *
 * @author Sascha Sauermann
 * @author Alexander
 */
public enum Orientation16 implements IOrientationEnum, IDataValueEnum {
	South(0), SouthSouthWest(1), SouthWest(2), WestSouthWest(3), West(4), WestNorthWest(5), NorthWest(
			6), NorthNorthWest(7), North(8), NorthNorthEast(9), NorthEast(10), EastNorthEast(11), East(
			12), EastSouthEast(13), SouthEast(14), SouthSouthEast(15);

	/**
	 * Data value
	 */
	private int value;

	/**
	 * Creates a new orientation.
	 *
	 * @param value
	 *            <b>int</b> data value
	 */
	private Orientation16(int value) {
		this.value = value;
	}

	/**
	 * @return <b>Orientation</b> next orientation (out of 16 possible)
	 */
	@Override
	public Orientation16 next() {
		return values()[(ordinal() + 1) % 16];
	}

	/**
	 * @return <b>Orientation</b> new orientation (out of 16 possible)
	 */
	@Override
	public Orientation16 rotate(int n) {
		Orientation16 next = next();
		for (int i = 1; i < n; i++)
		{
			next = next.next();
		}
		return next;
	}

	/**
	 * @return <b>Orientation</b> mirrored orientation (out of 16 possible)
	 */
	@Override
	public Orientation16 mirror(boolean xAxis) {
		if (xAxis)
		{
			if (ordinal() <= 8)
				// 0-8 => 8-number
				return values()[8 - ordinal()];
			else
				// 9-15 => 24-number
				return values()[24 - ordinal()];
		} else
			// 16-number mod 16
			return values()[(16 - ordinal()) & 16];

	}

	@Override
	public int getDataValue() {
		return value;
	}
}