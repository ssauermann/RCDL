package com.tree_bit.com.rcdl.blocks;

import com.tree_bit.math.MathExtended;

/**
 * This Class holds all information about a Redstone Torch.
 *
 * @author Alexander
 * @author Sascha Sauermann
 */
public class RedstoneTorch extends Blocks {

	/**
	 * orientation
	 */
	private Orientation facing;

	/**
	 * Creates a new RedstoneTorch with the given type and parameter.
	 *
	 * @param torchtype
	 *            <b>Type</b> ({@link Type})
	 * @param torchdatavalues
	 *            <b>Orientation</b> ({@link Orientation})
	 */
	public RedstoneTorch(Type torchtype, Orientation torchdatavalues) {
		super(torchtype.getID(), torchdatavalues.getDataValue());
		facing = torchdatavalues;
	}

	/**
	 * Redstone Torch Type
	 *
	 * @author Sascha Sauermann
	 * @author Alexander
	 */
	public enum Type implements IBlockTypeEnum {
		Off(75), On(76);

		/**
		 * Minecraft block id
		 */
		private int mcID;

		/**
		 * Creates a new Torch Type.
		 *
		 * @param id
		 *            <b>int</b> block id
		 */
		private Type(int id) {
			mcID = id;
		}

		@Override
		public int getID() {
			return mcID;
		}
	}

	/**
	 * Redstone Torch Orientation.
	 *
	 * @author Sascha Sauermann
	 * @author Alexander
	 */
	public enum Orientation implements IDataValueEnum, IOrientationEnum {
		FacingEast(1), FacingSouth(3), FacingWest(2), FacingNorth(4), FacingUp(5);

		/**
		 * data value
		 */
		private int value;

		/**
		 * Creates a new Redstone Torch Orientation.
		 *
		 * @param value
		 */
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
			Orientation temp = values()[MathExtended.mod((ordinal() + i), 16)];
			if (temp != null) return temp;
			throw new IllegalStateException();
		}

	}

	@Override
	public void rotateCount(int n) {
		facing = facing.rotate(n);
	}
}
