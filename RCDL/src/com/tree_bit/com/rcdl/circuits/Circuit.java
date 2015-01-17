package com.tree_bit.com.rcdl.circuits;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.tree_bit.com.rcdl.blocks.Blocks;
import com.tree_bit.com.rcdl.core.SchematicWrapper;
import com.tree_bit.com.rcdl.core.Tuple3;

public class Circuit {

	protected Tuple3 size;
	protected List<IO> io;
	HashMap<Tuple3, Blocks> blocks;

	public Circuit(Tuple3 size, List<IO> io, HashMap<Tuple3, Blocks> blocks) {
		this.size = size;
		this.io = io;
		this.blocks = blocks;
	}

	public void createSchematic(String path) throws FileNotFoundException, IOException {
		SchematicWrapper wrapper = new SchematicWrapper();
		wrapper.writeWidth((short) size.getX());
		wrapper.writeHeight((short) size.getY());
		wrapper.writeLength((short) size.getZ());

		wrapper.writeBlocks(MapToArray(blocks, size));
		wrapper.writeData(MapToArrayData(blocks, size));

		wrapper.saveChangesToFile(path);

	}

	public static byte[] MapToArray(HashMap<Tuple3, Blocks> blocks, Tuple3 size) {
		byte[] blocksBA = new byte[blocks.size()];
		for (Tuple3 t : blocks.keySet())
		{
			blocksBA[(((t.getY() * size.getZ()) + t.getZ()) * size.getX()) + t.getX()] = (byte) blocks
					.get(t).getMinecraftID();
		}
		return blocksBA;
	}

	public static byte[] MapToArrayData(HashMap<Tuple3, Blocks> blocks, Tuple3 size) {
		byte[] blocksBA = new byte[blocks.size()];
		for (Tuple3 t : blocks.keySet())
		{
			blocksBA[(((t.getY() * size.getZ()) + t.getZ()) * size.getX()) + t.getX()] = (byte) blocks
					.get(t).getDatavalue();
		}
		return blocksBA;
	}
}
