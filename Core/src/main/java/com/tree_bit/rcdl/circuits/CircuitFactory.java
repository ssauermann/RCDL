package com.tree_bit.rcdl.circuits;

import com.tree_bit.rcdl.core.Tuple3;
import com.tree_bit.rcdl.datatypes.Bit;
import com.tree_bit.rcdl.datatypes.Datatype.EKind;

import java.util.ArrayList;

public class CircuitFactory {

    public static Circuit NOT(final String in, final String out) {
        final ArrayList<IO> io = new ArrayList<>();
        io.add(new IO(new Tuple3(0, 0, 0), new Bit(EKind.IN, in)));
        io.add(new IO(new Tuple3(0, 0, 1), new Bit(EKind.OUT, out)));

        // final HashMap<Tuple3, Block> blocks = new HashMap<>();
        // blocks.put(new Tuple3(0, 0, 0), new Wool(Wool.WoolColor.Orange));
        // blocks.put(new Tuple3(0, 0, 1), new RedstoneTorch(Type.On,
        // RedstoneTorch.Orientation.FacingSouth));

        // return new Circuit(new Tuple3(1, 1, 2), io, blocks);
        return null;
    }
}
