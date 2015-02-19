package com.tree_bit.rcdl.core;

import com.tree_bit.rcdl.blocks.Block;
import com.tree_bit.rcdl.circuits.Circuit;
import com.tree_bit.rcdl.schematic.SchematicWrapper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SchematicWriter {

    public static void createSchematic(final String path, final Circuit c) throws FileNotFoundException, IOException {
        final SchematicWrapper wrapper = new SchematicWrapper();
        wrapper.writeWidth((short) c.getSize().getX());
        wrapper.writeHeight((short) c.getSize().getY());
        wrapper.writeLength((short) c.getSize().getZ());
        //
        // wrapper.writeBlocks(BlockMapToArray(c.getBlocks(), c.getSize()));
        // wrapper.writeData(DataMapToArray(c.getBlocks(), c.getSize()));

        wrapper.saveChangesToFile(path);
    }

    public static byte[] BlockMapToArray(final Map<Tuple3, Block> blocks, final Tuple3 size) {
        final byte[] blocksBA = new byte[blocks.size()];
        // for (final Tuple3 t : blocks.keySet()) {
        // blocksBA[(((t.getY() * size.getZ()) + t.getZ()) * size.getX()) +
        // t.getX()] = (byte) blocks.get(t).getMinecraftID();
        // }
        return blocksBA;
    }

    public static byte[] DataMapToArray(final HashMap<Tuple3, Block> blocks, final Tuple3 size) {
        final byte[] blocksBA = new byte[blocks.size()];
        // for (final Tuple3 t : blocks.keySet()) {
        // blocksBA[(((t.getY() * size.getZ()) + t.getZ()) * size.getX()) +
        // t.getX()] = (byte) blocks.get(t).getDatavalue();
        // }
        return blocksBA;
    }

}
