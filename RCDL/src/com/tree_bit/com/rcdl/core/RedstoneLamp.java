package com.tree_bit.com.rcdl.core;

/**
 * This class holds all Information which is needed to store a Redstone Lamp
 * 
 * @author Alexander
 *
 */
public class RedstoneLamp extends Blocks {

	public RedstoneLamp(RedStoneLampType type) {
		super(type.getMcID(), 0);
	}

	public enum RedStoneLampType {
		RedstoneLampOFF(123), RedstoneLampOn(124);

		private int mcID;

		private RedStoneLampType(int id) {
			mcID = id;
		}

		private int getMcID() {
			return mcID;
		}
	}

}
