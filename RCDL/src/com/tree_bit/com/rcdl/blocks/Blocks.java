package com.tree_bit.com.rcdl.blocks;

/**
 * Minecraft Block
 *
 * @author Alexander
 * @author Sascha Sauermann
 */
public abstract class Blocks {

	/**
	 * The Minecraft Id describes the Block which is used
	 */
	protected int minecraftID;

	/**
	 * The Datavalues describe things like Orientation
	 */
	protected int datavalue;

	protected String[] text = new String[4];

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
		text = null;
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

	/**
	 * Retrieves Information concerning the text a sign should display later
	 *
	 * @return <b>String[]</b> text
	 */
	public String[] getText() {
		return text;
	}

	/**
	 * Mirrors the orientation of this block.
	 */
	public void mirror() {
		rotate(180);
	}

	/**
	 * Rotate the block by the given amount of degree.
	 *
	 * @param degree
	 *            <b>int</b> degree (only multiples of 90 are allowed)
	 */
	public void rotate(int degree) {
		if ((degree % 90) != 0)
			throw new IllegalArgumentException(
					"Rotation is only allowed for multiples of 90 degree.");
		// Normal blocks are the same for each orientation.
	}
}
