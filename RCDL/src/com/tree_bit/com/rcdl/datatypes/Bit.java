package com.tree_bit.com.rcdl.datatypes;

/**
 * Bit data type.
 *
 * @author Sascha Sauermann
 */
public class Bit extends Datatype {

	/**
	 * 0 or 1
	 */
	protected boolean value;

	/**
	 * Creates a new bit.
	 *
	 * @param kind
	 *            <b>EKind</b> datatype kind
	 * @param value
	 *            <b>boolean</b> value (0 or 1)
	 */
	public Bit(EKind kind, boolean value) {
		super(kind);
		this.value = value;
	}

}
