package com.tree_bit.rcdl.datatypes;

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
	 * Name of this Datatype
	 */
	protected String variablename;

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
	protected Datatype(EKind kind, String variablename) {
		this.kind = kind;
		this.variablename = variablename;
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
	 * Returns the name of this datatype.
	 *
	 * @return <b>String</b> name
	 */
	public String getName() {
		return variablename;
	}

	/**
	 * Returns the value of this datatype.
	 *
	 * @return <b>Object</b> value
	 */
	public abstract Object getValue();

}
