package com.tree_bit.com.rcdl.blocks;

import com.tree_bit.math.MathExtended;

/**
 * This Class holds all Information about a Redstone Torch.
 *
 * @author Alexander
 * @author Sascha Sauermann
 */
public class RedStoneTorch extends Blocks {

	private Orientation facing;

	public RedStoneTorch(Type torchtype, Orientation torchdatavalues) {
		super(torchtype.getID(), torchdatavalues.getDataValue());
		facing = torchdatavalues;
	}

	public enum Type implements IBlockTypeEnum {
		RedstoneTorchOff(75), RedstoneTorchOn(76);

		private int mcID;

		private Type(int id) {
			mcID = id;
		}

		@Override
		public int getID() {
			return mcID;
		}
	}

	public enum Orientation implements IDataValueEnum, IOrientationEnum {
		FacingEast(1), FacingSouth(3), FacingWest(2), FacingNorth(4), FacingUp(5);

		private int value;

		private Orientation(int value) {
			this.value = value;
		}

		@Override
		public int getDataValue() {
			return value;
		}

		@Override
		public Orientation rotate(int n) {
			if (value == FacingUp.value) return FacingUp;
			return next(n + ((n + ordinal()) / 4));
		}

		@Override
		public Orientation mirror(boolean xAxis) {
			if (value == FacingUp.value) return FacingUp;
			if (xAxis)
			{
				if (next(0) == FacingSouth)
					return FacingNorth;
				else if (next(0) == FacingNorth) return FacingSouth;
			} else
			{
				if (next(0) == FacingEast)
					return FacingWest;
				else if (next(0) == FacingWest) return FacingEast;
			}
			return next(0);
		}

		@Override
		public Orientation next(int i) {
			return values()[MathExtended.mod((ordinal() + i), 16)];
		}

	}

	@Override
	public void rotateCount(int n) {
		facing = facing.rotate(n);
	}
}
