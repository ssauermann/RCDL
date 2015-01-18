package com.tree_bit.com.rcdl.datatypes;

/**
 * Hexadecimal data type.
 *
 * @author Sascha Sauermann
 */
public class Hex extends Datatype {

	/**
	 * Decimal value between 0 and 15
	 */
	protected short value;

	/**
	 * Creates a new hex datatype.
	 *
	 * @param kind
	 *            <b>EKind</b> datatype kind
	 * @param variablename
	 *            <b>String</b> name of this variable
	 * @param value
	 *            <b>short</b> number between 0 and 15
	 */
	public Hex(EKind kind, String variablename, short value) {
		super(kind, variablename);
		setValue(value);
	}

	/**
	 * Creates a new hex datatype.
	 *
	 * @param kind
	 *            <b>EKind</b> datatype kind
	 * @param variablename
	 *            <b>String</b> name of this variable
	 * @param value
	 *            <b>char</b> chacracter between A and F to be converted into a number. (case
	 *            insensitive)
	 */
	public Hex(EKind kind, String variablename, char value) {
		super(kind, variablename);
		if ((value >= '0') && (value <= '9'))
		{
			setValue((short) (value - '0'));
		} else
		{
			setValue((short) (((("" + value).toUpperCase().charAt(0)) - 'A') + 10));
		}
	}

	/**
	 * Creates a new hex datatype.
	 *
	 * @param kind
	 *            <b>EKind</b> datatype kind
	 * @param variablename
	 *            <b>String</b> name of this variable
	 */
	public Hex(EKind kind, String variablename) {
		this(kind, variablename, (short) 0);
	}

	/**
	 * Returns the value of this datatype.
	 *
	 * @return <b>Short</b> value
	 */
	@Override
	public Short getValue() {
		return value;
	}

	/**
	 * Sets the value of this data type.
	 *
	 * @param value
	 *            <b>short</b> value between 0 and 15
	 */
	private void setValue(short value) {
		if ((value < 0) || (value > 15))
			throw new IllegalArgumentException("Value has to be between 0 and 15");
		this.value = value;
	}

}
