package com.tree_bit.com.rcdl.datatypes;

/**
 * Bit vector data type.
 *
 * @author Sascha Sauermann
 */
public class BitVector extends Datatype {

	/**
	 * Array of boolean values (0 or 1).
	 * <p>
	 * <b>Default:</b> Most significant bit at greatest index. <br>
	 * <b>If reversed:</b> Most significant bit at index 0.
	 * </p>
	 */
	protected boolean[] values;

	/**
	 * Default or reversed order of indices (array of values)
	 */
	protected final boolean reversed;

	/**
	 * Creates a new bit vector. At default the most significant bit of values has the greatest
	 * index. If an array with the reversed order is given, the parameter reversed has to be true.
	 *
	 * @param kind
	 *            <b>EKind</b> datatype kind
	 * @param values
	 *            <b>bolean[]</b> values
	 * @param reversed
	 *            <b>boolean</b> Value indices are reversed
	 */
	public BitVector(EKind kind, boolean[] values, boolean reversed) {
		super(kind);
		this.reversed = reversed;
		if (reversed)
		{
			this.values = new boolean[values.length];
			for (int i = 0; i < values.length; i++)
			{
				this.values[values.length - 1 - i] = values[i];
			}
		} else
		{
			this.values = values;
		}
	}

	/**
	 * Returns the value of this datatype.
	 *
	 * @return <b>boolean[]</b> value
	 */
	@Override
	public boolean[] getValue() {
		return values;
	}
}
