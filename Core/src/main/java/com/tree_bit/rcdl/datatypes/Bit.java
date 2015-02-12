package com.tree_bit.rcdl.datatypes;

/**
 * Bit data type.
 *
 * @author Sascha Sauermann
 */
public class Bit extends Datatype {

    /**
     * Value of this bit (0 or 1)
     */
    private boolean value;

    /**
     * Creates a new bit.
     *
     * @param kind <b>EKind</b> datatype kind
     * @param variablename <b>String</b> name of this variable
     */
    public Bit(EKind kind, String variablename) {
        this(kind, variablename, false);
    }

    /**
     * Creates a new bit.
     *
     * @param kind <b>EKind</b> datatype kind
     * @param variablename <b>String</b> name of this variable
     * @param value <b>boolean</b> value(0 or 1)
     */
    public Bit(EKind kind, String variablename, boolean value) {
        super(kind, variablename);
        this.value = value;
    }

    /**
     * @return <b>Boolean</b> value
     */
    @Override
    public Boolean getValue() {
        return this.value;
    }

    /**
     * Sets the value of this datatype.
     *
     * @param value <b>boolean</b> value
     */
    public void setValue(boolean value) {
        this.value = value;
    }

}
