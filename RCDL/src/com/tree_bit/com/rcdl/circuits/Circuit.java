package com.tree_bit.com.rcdl.circuits;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.tree_bit.com.rcdl.blocks.Blocks;
import com.tree_bit.com.rcdl.core.SchematicWrapper;
import com.tree_bit.com.rcdl.core.Tuple3;
import com.tree_bit.com.rcdl.core.World;
import com.tree_bit.com.rcdl.datatypes.Datatype.EKind;

public class Circuit {

	protected final Tuple3 size;
	protected final List<IO> io;
	protected final HashMap<Tuple3, Blocks> blocks;

	int number;
	static int nextNumber = 0;

	public Circuit(Tuple3 size, List<IO> io, HashMap<Tuple3, Blocks> blocks) {
		this.size = size;
		this.io = io;
		this.blocks = blocks;
		number = Circuit.getNewNumber();
	}

	private static int getNewNumber() {
		nextNumber++;
		return nextNumber - 1;
	}

	public void createSchematic(String path) throws FileNotFoundException, IOException {
		SchematicWrapper wrapper = new SchematicWrapper();
		wrapper.writeWidth((short) size.getX());
		wrapper.writeHeight((short) size.getY());
		wrapper.writeLength((short) size.getZ());

		wrapper.writeBlocks(World.BlockMapToArray(blocks, size));
		wrapper.writeData(World.DataMapToArray(blocks, size));

		wrapper.saveChangesToFile(path);
	}

	public List<IO> getIOList() {
		return io;
	}

	public HashMap<String, IO> getOutputs() {
		HashMap<String, IO> outputs = new HashMap<>();

		for (IO var : getIOList())
		{
			if (var.getData().getKind() == EKind.OUT)
			{
				outputs.put(var.getData().getname(), var);
			}
		}
		return outputs;
	}

	public HashMap<String, IO> getInputs() {
		HashMap<String, IO> outputs = new HashMap<>();

		for (IO var : getIOList())
		{
			if (var.getData().getKind() == EKind.IN)
			{
				outputs.put(var.getData().getname(), var);
			}
		}
		return outputs;
	}

	@Override
	public String toString() {
		// return "" + number;
		return io.get(1).getData().getname();
	}
}
