package com.tree_bit.com.rcdl.blocks;

/**
 * This Class holds all Information about a Redstone Torch
 *
 * @author Alexander
 * @author Sascha Sauermann
 *
 */
public class RedStoneTorch extends Blocks {

	private TorchDataValues facing;

	public RedStoneTorch(TorchType torchtype, TorchDataValues torchdatavalues) {
		super(torchtype.getMcID(), torchdatavalues.getDataValue());
		facing = torchdatavalues;
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
		FacingEast(1), FacingSouth(3), FacingWest(2), FacingNorth(4), FacingUp(5);

		private int value;

		private TorchDataValues(int value) {
			this.value = value;
		}

		private int getDataValue() {
			return value;
		}

		public TorchDataValues getNext() {
			return values()[(ordinal() + 1) % values().length];
		}

	}

	@Override
	public void rotate(int degree) {
		rotate(degree);

		// Facing up has no rotation
		if (facing == TorchDataValues.FacingUp) return;

		int count = (Math.abs(degree) % 90) + 1;

		if (degree < 0)
		{
			// -90 or -270
			if ((degree % 180) != 0)
			{
				// switch -90%
				count = (Math.abs(degree) % 90) + 3;
			}
		}

		for (int i = 0; i < count; i++)
		{
			facing = facing.getNext();

			// Facing Up is no valid rotation
			if (facing == TorchDataValues.FacingUp)
			{
				facing = facing.getNext();
			}
		}

		datavalue = facing.getDataValue();
	}
}
