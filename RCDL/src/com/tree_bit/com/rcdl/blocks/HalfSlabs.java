package com.tree_bit.com.rcdl.blocks;

/**
 * Fully functional Halfslab
 *
 * @author Alexander
 *
 */
public class HalfSlabs extends Blocks {

	public HalfSlabs(Type type, Postion position) {
		super(44, type.getTypeValue() + position.getPositionValue());
	}

	public enum Type {
		Stone(0), Sandstone(1), Wood(2), Cobblestone(3), Bricks(4), StoneBricks(5), Netherbrick(6), Quartz(
				7);

		private int mcID;

		private Type(int id) {
			mcID = id;
		}

		private int getTypeValue() {
			return mcID;
		}
	}

	public enum Postion {
		UP(8), Down(0);

		private int mcID;

		private Postion(int id) {
			mcID = id;
		}

		private int getPositionValue() {
			return mcID;
		}
	}

}
