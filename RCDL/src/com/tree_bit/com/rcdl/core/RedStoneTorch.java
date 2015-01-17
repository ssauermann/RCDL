package com.tree_bit.com.rcdl.core;

/**
 * This Class holds all Information about a Redstone Torch
 * 
 * @author Alexander
 *
 */
public class RedStoneTorch {

	/**
	 * The Datavalues of a torch describe its Orientation
	 */
	private TorchDataValues torchdatavalues;
	/**
	 * There are different Minecraft IDs for torches ON/OFF
	 */
	private TorchType torchtype;

	public RedStoneTorch(TorchDataValues torchdatavalues, TorchType torchtype) {
		this.torchdatavalues = torchdatavalues;
		this.torchtype = torchtype;
	}

	public enum TorchType {
		RedstoneTorchOff(75), RedstoneTorchOn(76);

		private int mcID;

		private TorchType(int id) {
			mcID = id;
		}

		private int getMcID() {
			return mcID;
		}
	}

	public enum TorchDataValues {
		FacingEast(1), FacingWest(2), FacingSouth(3), FacingNorth(4), FacingUp(5);

		private int value;

		private TorchDataValues(int value) {
			this.value = value;
		}

		private int getDataValue() {
			return value;
		}
	}

	/**
	 * Retrieves Information about the Orientation of the Torch
	 * 
	 * @return <b>Integer</b> The Data Value of this Object
	 */
	public int getTorchdatavalues() {
		return torchdatavalues.getDataValue();
	}

	/**
	 * Retrieves the Minecraft ID of the Torch
	 * 
	 * @return <b>Integer</b>
	 */
	public int getTorchtype() {
		return torchtype.getMcID();
	}

}
