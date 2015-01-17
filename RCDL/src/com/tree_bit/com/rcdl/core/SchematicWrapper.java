package com.tree_bit.com.rcdl.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.jnbt.ByteArrayTag;
import org.jnbt.CompoundTag;
import org.jnbt.NBTInputStream;
import org.jnbt.ShortTag;
import org.jnbt.Tag;

/**
 * Wrapper for Minecraft NBT files. Used for MCEdit schematics.
 *
 * @see http://minecraft.gamepedia.com/Schematic
 *
 * @author Sascha Sauermann
 */
public class SchematicWrapper {

	/**
	 * Root Tag
	 */
	private final CompoundTag root;

	/**
	 * Creates a new wrapper for a schematic file.
	 *
	 * @param path
	 *            <b>String</b> path to file
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public SchematicWrapper(String path) throws FileNotFoundException, IOException {
		NBTInputStream inputStream = new NBTInputStream(new FileInputStream(path));
		root = (CompoundTag) inputStream.readTag();
		inputStream.close();
	}

	/**
	 * Returns the height of the schematic.
	 *
	 * @return <b>short</b> height
	 */
	public short readHeight() {
		return ((ShortTag) read(ESchematicFields.HEIGHT)).getValue();
	}

	/**
	 * Returns the width of the schematic.
	 *
	 * @return <b>short</b> width
	 */
	public short readWidth() {
		return ((ShortTag) read(ESchematicFields.WIDTH)).getValue();
	}

	/**
	 * Returns the length of the schematic.
	 *
	 * @return <b>short</b> length
	 */
	public short readLength() {
		return ((ShortTag) read(ESchematicFields.LENGTH)).getValue();
	}

	/**
	 * Returns a byte array containing all block ids of the schematic.
	 * <p>
	 * Each block id uses 8 bits.
	 * </p>
	 *
	 * @return <b>byte[]</b> blocks
	 */
	public byte[] readBlocks() {
		return ((ByteArrayTag) read(ESchematicFields.BLOCKS)).getValue();
	}

	/**
	 * Returns a byte array containing all data values for the blocks of the schematic.
	 * <p>
	 * Each data value uses the lower 4 bits of a byte.
	 * </p>
	 *
	 * @return <b>byte[]</b> blocks
	 */
	public byte[] readData() {
		return ((ByteArrayTag) read(ESchematicFields.DATA)).getValue();
	}

	/**
	 * Returns a Tag object matching a field of the schematic.
	 *
	 * @param field
	 *            <b>ESchematicFields</b> schematic field
	 * @return <b>Tag</b> tag
	 */
	public Tag read(ESchematicFields field) {
		return getTag(field.getKey(), root);
	}

	/**
	 * Returns the child of a CompoundTag matching a key.
	 *
	 * @param key
	 *            <b>String</b> key of the child
	 * @param parentTag
	 *            <b>CompoundTag</b> parent compound tag
	 * @return <b>Tag</b> child tag
	 */
	private static Tag getTag(String key, CompoundTag parentTag) {
		return parentTag.getValue().get(key);
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {

		SchematicWrapper wrapper = new SchematicWrapper("testfiles/treeone.schematic");

		// Minecraft default: YZX
		System.out.println("Size (YZX): " + wrapper.readHeight() + "x" + wrapper.readLength() + "x"
				+ wrapper.readWidth());

		// Print one Block Layer (Width * Length) (Layer 10)
		byte[] blocks = wrapper.readBlocks();

		int y = 10;

		for (int x = 0; x < wrapper.readWidth(); x++)
		{
			for (int z = 0; z < wrapper.readLength(); z++)
			{
				int value = blocks[(((y * wrapper.readLength()) + z) * wrapper.readWidth()) + x];
				System.out.print(((value < 10) ? ("0" + value) : value) + "|");
			}
			System.out.println("");
		}
	}
}
