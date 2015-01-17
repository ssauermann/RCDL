package com.tree_bit.com.rcdl.core;

/**
 * A Block means some kind of Object which is included in Minecraft and more
 * importantly has some kind of use for Redstone circuts
 *
 * @author Alexander
 *
 */
public enum Block
{
	RedstoneWire(55, 0), RedstoneTorchOff(75, 0), RedstoneTorchOn(76, 0), RepeaterBlockOFF(
			93, 0), RepeaterBlockOn(94, 0), Repeater(356, 0), Redstone(331, 0), RedstoneLampOFF(
			123, 0), RedstoneLampOn(124, 0), RedstoneBlock(152, 0), RedstoneComparatorOFF(
			149, 0), RedstoneComparatorON(150, 0), WhiteWool(35, 0), OrangeWool(
			35, 1), MagentaWool(35, 2);

	/**
	 * The ID defines a certain Block in Minecraft
	 */
	private final int mcID;
	/**
	 * Sometimes a Block has an additional parameter which defines e.g. its
	 * color or its components, damage status etc.
	 */
	private final int blockState;

	Block(int mcID, int blockState)
	{
		this.mcID = mcID;
		this.blockState = blockState;
	}

	public int getMcID()
	{
		return mcID;
	}

	public int getblockState()
	{
		return blockState;
	}

}
