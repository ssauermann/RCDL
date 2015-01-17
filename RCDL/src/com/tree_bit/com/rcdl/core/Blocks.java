package com.tree_bit.com.rcdl.core;

/**
 *
 * @author Alexander
 *
 */
public abstract class Blocks {

	/**
	 * The Minecraft Id describes the Block which is used
	 */
	private int minecraftID;
	/**
	 * The Datavalues describe things like Orientation
	 */
	private int datavalue;

	/**
	 * Sets the Object Up with the Information about its ID and value
	 *
	 * @param mcID
	 *            (Minecraft ID)
	 * @param datavalue
	 *            (Value of the Block)
	 */
	public Blocks(int mcID, int datavalue) {
		if ((datavalue > 15) || (datavalue < 0))
			throw new IllegalArgumentException(
					"Datavalues higher than 15 and lower than 0 are permitted.");
		minecraftID = mcID;
		this.datavalue = datavalue;
	}

	/**
	 * Retrieves the Minecraft ID of the Object
	 *
	 * @return <b>Integer</b>
	 */
	public int getMinecraftID() {
		return minecraftID;
	}

	/**
	 * Retrieves Information about the Orientation or the state of the Block
	 *
	 * @return <b>Integer</b> The Data Value of this Object
	 */
	public int getDatavalue() {
		return datavalue;
	}

}
