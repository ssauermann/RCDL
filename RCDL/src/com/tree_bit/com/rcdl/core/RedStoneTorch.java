package com.tree_bit.com.rcdl.core;

/**
 * This Class holds all Information about a Redstone Torch
 *
 * @author Alexander
 *
 */
public class RedStoneTorch extends Blocks {

	public RedStoneTorch(TorchType torchtype, TorchDataValues torchdatavalues) {
		super(torchtype.getMcID(), torchdatavalues.getDataValue());

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

}
