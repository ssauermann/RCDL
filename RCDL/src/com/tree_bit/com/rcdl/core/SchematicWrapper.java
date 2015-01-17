package com.tree_bit.com.rcdl.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.jnbt.ByteArrayTag;
import org.jnbt.CompoundTag;
import org.jnbt.NBTInputStream;
import org.jnbt.NBTOutputStream;
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
	private CompoundTag root;

	/**
	 * Creates a new wrapper for a schematic file.
	 *
	 * @param path
	 *            <b>String</b> path to file
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public SchematicWrapper(String path) throws FileNotFoundException, IOException {
		if (path == null) throw new IllegalArgumentException("Path is NULL");
		NBTInputStream inputStream = new NBTInputStream(new FileInputStream(path));
		root = (CompoundTag) inputStream.readTag();
		inputStream.close();
	}

	/**
	 * Creates a new wrapper for an empty schematic file.
	 */
	public SchematicWrapper() {
		root = new CompoundTag("Schematic", new HashMap<>());
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

	/**
	 * Copy the values of a compound tag to a new map and add a new tag. An existing tag with the
	 * same name is replaced.
	 *
	 * @param t
	 *            <b>Tag</b> new tag
	 * @param parentTag
	 *            <b>CompoundTag</b> parent tag
	 * @return <b>Map&lt;String, Tag&gt;</b> map with the old values and the new one
	 */
	private static Map<String, Tag> addTag(Tag t, CompoundTag parentTag) {
		Map<String, Tag> map = new HashMap<>();

		// Copy old Map
		for (Tag old : parentTag.getValue().values())
		{
			map.put(old.getName(), old);
		}

		// Add t to map (replace possibly existing old value)
		map.put(t.getName(), t);

		return map;
	}

	/**
	 * Adds a tag to the root compound tag values. Replaces possibly existing value with same
	 * name/key.
	 *
	 * @param t
	 *            <b>Tag</b> tag
	 */
	private void addTagToRoot(Tag t) {
		root = new CompoundTag(root.getName(), addTag(t, root));
	}

	/**
	 * Adds a tag for the height of the schematic to the root compound tag.
	 *
	 * @param value
	 *            <b>short</b> height
	 */
	public void writeHeight(short value) {
		ShortTag t = new ShortTag(ESchematicFields.HEIGHT.getKey(), value);
		addTagToRoot(t);
	}

	/**
	 * Adds a tag for the width of the schematic to the root compound tag.
	 *
	 * @param value
	 *            <b>short</b> width
	 */
	public void writeWidth(short value) {
		ShortTag t = new ShortTag(ESchematicFields.WIDTH.getKey(), value);
		addTagToRoot(t);
	}

	/**
	 * Adds a tag for the length of the schematic to the root compound tag.
	 *
	 * @param value
	 *            <b>short</b> length
	 */
	public void writeLength(short value) {
		ShortTag t = new ShortTag(ESchematicFields.LENGTH.getKey(), value);
		addTagToRoot(t);
	}

	/**
	 * Adds a tag for the blocks of the schematic to the root compound tag.
	 *
	 * @param value
	 *            <b>byte[]</b> blocks
	 */
	public void writeBlocks(byte[] value) {
		ByteArrayTag t = new ByteArrayTag(ESchematicFields.BLOCKS.getKey(), value);
		addTagToRoot(t);
	}

	/**
	 * Adds a tag for the data values (for blocks) of the schematic to the root compound tag.
	 *
	 * @param value
	 *            <b>byte[]</b> data values
	 */
	public void writeData(byte[] value) {
		ByteArrayTag t = new ByteArrayTag(ESchematicFields.DATA.getKey(), value);
		addTagToRoot(t);
	}

	/**
	 * Writes the current root compound tag (and value tags) to the given file.
	 *
	 * <p>
	 * If the file doesn't exist it will be created.
	 * </p>
	 *
	 * @param path
	 *            <b>String</b> path to file
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void saveChangesToFile(String path) throws FileNotFoundException, IOException {
		File f = new File(path);

		if (!f.exists())
		{
			f.getParentFile().mkdirs();
			f.createNewFile();
		}

		NBTOutputStream out = new NBTOutputStream(new FileOutputStream(f));
		out.writeTag(root);
		out.close();
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

		SchematicWrapper writer = new SchematicWrapper("testfiles/treeone.schematic");
		writer.writeHeight((short) 12);
		writer.saveChangesToFile("testfiles/treeWrite.schematic");

		SchematicWrapper wrapper2 = new SchematicWrapper("testfiles/treeWrite.schematic");
		System.out.println(wrapper2.root);
	}
}
