package com.tree_bit.com.rcdl.datatypes;

/**
 * Data Type
 *
 * @author Sascha Sauermann
 */
public abstract class Datatype {

	/**
	 * Kinds of data types.
	 *
	 * @author Sascha Sauermann
	 */
	public enum EKind {
		IN, OUT, VAR;
	}

	/**
	 * Kind of this data type
	 */
	protected final EKind kind;

	/**
	 * Creates a new data type. (abstract)
	 *
	 * @param kind
	 *            <b>EKind</b> Kind of data type
	 */
	public Datatype(EKind kind) {
		this.kind = kind;
	}

	/**
	 * Returns the kind of this data type.
	 *
	 * @return <b>EKind</b> kind
	 */
	public EKind getKind() {
		return kind;
	}

	/**
	 * Returns the value of this datatype.
	 *
	 * @return <b>Object</b> value
	 */
	public abstract Object getValue();

}
