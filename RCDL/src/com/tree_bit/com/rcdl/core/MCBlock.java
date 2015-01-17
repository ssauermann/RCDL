package com.tree_bit.com.rcdl.core;

public abstract class MCBlock {

	private Block block;

	public int getMinecraftId() {
		return block.getMcID();
	}

}
