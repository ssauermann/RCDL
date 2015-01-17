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
	 * @param value
	 *            <b>short</b> number between 0 and 15
	 */
	public Hex(EKind kind, short value) {
		super(kind);
		if ((value < 0) || (value > 15))
			throw new IllegalArgumentException("Value has to be between 0 and 15");
		this.value = value;
	}

	/**
	 * Creates a new hex datatype.
	 *
	 * @param kind
	 *            <b>EKind</b> datatype kind
	 * @param value
	 *            <b>char</b> chacracter between A and F to be converted into a number. (case
	 *            insensitive)
	 */
	public Hex(EKind kind, char value) {
		this(kind, (short) ((("" + value).toUpperCase().charAt(0)) - 65));
	}

}
