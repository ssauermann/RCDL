package com.tree_bit.com.rcdl.core;

import org.jnbt.ByteArrayTag;
import org.jnbt.ByteTag;
import org.jnbt.CompoundTag;
import org.jnbt.DoubleTag;
import org.jnbt.EndTag;
import org.jnbt.FloatTag;
import org.jnbt.IntTag;
import org.jnbt.ListTag;
import org.jnbt.LongTag;
import org.jnbt.NBTConstants;
import org.jnbt.ShortTag;
import org.jnbt.StringTag;
import org.jnbt.Tag;

/**
 * Enum, containing important fields of a schematic file.
 *
 * @author Sascha Sauermanns
 */
public enum ESchematicFields {
	HEIGHT("Height", NBTConstants.TYPE_SHORT), LENGTH("Length", NBTConstants.TYPE_SHORT), WIDTH(
			"Width", NBTConstants.TYPE_SHORT), BLOCKS("Blocks", NBTConstants.TYPE_BYTE_ARRAY), DATA(
			"Data", NBTConstants.TYPE_BYTE_ARRAY), MATERIALS("Materials", NBTConstants.TYPE_STRING);

	private String key;
	private int type;

	private ESchematicFields(String key, int type) {
		this.key = key;
		this.type = type;
	}

	/**
	 * Returns the key of a field to access the child tags of a compound tag by key.
	 *
	 * @return <b>String</b> key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Returns the class of a field to cast the tags returned by the NBTInputStream to a child type
	 * of Tag.
	 *
	 * @return <b>Class&lt;? extends Tag&gt;</b> type
	 */
	public Class<? extends Tag> getTypeClass() {
		switch (getType()) {
		case NBTConstants.TYPE_BYTE:
			return ByteTag.class;
		case NBTConstants.TYPE_BYTE_ARRAY:
			return ByteArrayTag.class;
		case NBTConstants.TYPE_COMPOUND:
			return CompoundTag.class;
		case NBTConstants.TYPE_DOUBLE:
			return DoubleTag.class;
		case NBTConstants.TYPE_END:
			return EndTag.class;
		case NBTConstants.TYPE_FLOAT:
			return FloatTag.class;
		case NBTConstants.TYPE_INT:
			return IntTag.class;
		case NBTConstants.TYPE_LIST:
			return ListTag.class;
		case NBTConstants.TYPE_LONG:
			return LongTag.class;
		case NBTConstants.TYPE_SHORT:
			return ShortTag.class;
		case NBTConstants.TYPE_STRING:
			return StringTag.class;
		default:
			throw new IllegalStateException("Enum type not supported!");
		}
	}

	/**
	 * Returns the type of a field.
	 *
	 * @return <b>int</b> type
	 */
	public int getType() {
		return type;
	}
}
