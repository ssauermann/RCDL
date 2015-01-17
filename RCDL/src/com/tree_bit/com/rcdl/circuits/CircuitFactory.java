package com.tree_bit.com.rcdl.circuits;

import java.util.ArrayList;
import java.util.HashMap;

import com.tree_bit.com.rcdl.blocks.Blocks;
import com.tree_bit.com.rcdl.blocks.RedStoneTorch;
import com.tree_bit.com.rcdl.blocks.RedStoneTorch.TorchType;
import com.tree_bit.com.rcdl.blocks.Wool;
import com.tree_bit.com.rcdl.core.Tuple3;
import com.tree_bit.com.rcdl.datatypes.Bit;
import com.tree_bit.com.rcdl.datatypes.Datatype.EKind;

public class CircuitFactory {
	public static Circuit NOT() {
		ArrayList<IO> io = new ArrayList<>();
		io.add(new IO(new Tuple3(0, 0, 0), new Bit(EKind.IN, "in")));
		io.add(new IO(new Tuple3(0, 0, 1), new Bit(EKind.OUT, "out")));

		HashMap<Tuple3, Blocks> blocks = new HashMap<>();
		blocks.put(new Tuple3(0, 0, 0), new Wool(Wool.WoolColor.Orange));
		blocks.put(new Tuple3(0, 0, 1), new RedStoneTorch(TorchType.RedstoneTorchOn,
				RedStoneTorch.TorchDataValues.FacingSouth));

		return new Circuit(new Tuple3(1, 1, 2), io, blocks);
	}
}
