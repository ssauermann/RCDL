package com.tree_bit.rcdl.datatypes;

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
	 * @param variablename
	 *            <b>String</b> name of this variable
	 * @param reversed
	 *            <b>boolean</b> value indices are reversed
	 * @param values
	 *            <b>bolean[]</b> values
	 */
	public BitVector(EKind kind, String variablename, boolean reversed, boolean[] values) {
		super(kind, variablename);
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
	 * Creates a new bit vector. At default the most significant bit of values has the greatest
	 * index. If an array with the reversed order is given, the parameter reversed has to be true.
	 *
	 * @param kind
	 *            <b>EKind</b> datatype kind
	 * @param variablename
	 *            <b>String</b> name of this variable
	 * @param reversed
	 *            <b>boolean</b> value indices are reversed
	 * @param length
	 *            <b>int</b> size of the vector
	 */
	public BitVector(EKind kind, String variablename, boolean reversed, int length) {
		this(kind, variablename, reversed, new boolean[length]);
	}

	/**
	 * @return <b>boolean[]</b> value
	 */
	@Override
	public boolean[] getValue() {
		return values;
	}

	/**
	 * Sets the value of this datatype.
	 *
	 * @param value
	 *            <b>boolean[]</b> value
	 */
	public void setValue(boolean[] values) {
		this.values = values;
	}
}
