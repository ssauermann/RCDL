package com.tree_bit.com.rcdl.blocks;


/**
 * Holds all the information for a Repeater
 *
 * @author Alexander
 *
 */
public class Repeater extends Blocks {

	private RepeaterOrientation facing;
	private RepeaterDelay delay;

	public Repeater(RepeaterType repeatertype, RepeaterOrientation orientation, RepeaterDelay delay) {
		super(repeatertype.getMcID(), orientation.getOrientation() + delay.getDelay());
		// Delay and orientation are given seperatly, and get converted into one int or later byte
		facing = orientation;
		this.delay = delay;
	}

	public enum RepeaterType {
		RepeaterBlockOn(94), RepeaterBlockOFF(93);

		private int mcID;

		private RepeaterType(int id) {
			mcID = id;
		}

		private int getMcID() {
			return mcID;
		}
	}

	public enum RepeaterOrientation {
		FacingNorth(0), FacingEast(1), FacingSouth(2), FacingWest(3);

		private int value;

		private RepeaterOrientation(int value) {
			this.value = value;
		}

		private int getOrientation() {
			return value;
		}

		public RepeaterOrientation getNext() {
			return values()[(ordinal() + 1) % values().length];
		}
	}

	public enum RepeaterDelay {
		Delay1(0), Delay2(4), Delay3(8), Delay4(12);

		private int value;

		private RepeaterDelay(int value) {
			this.value = value;
		}

		private int getDelay() {
			return value;
		}

		public RepeaterDelay getNext() {
			return values()[(ordinal() + 1) % values().length];
		}
	}

	@Override
	public void rotate(int degree) {
		rotate(degree);

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
		}

		datavalue = facing.getOrientation() + delay.getDelay();
	}
}