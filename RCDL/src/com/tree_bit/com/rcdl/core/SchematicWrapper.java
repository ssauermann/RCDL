package com.tree_bit.com.rcdl.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

import org.jnbt.CompoundTag;
import org.jnbt.NBTInputStream;
import org.jnbt.NBTUtils;
import org.jnbt.Tag;

public class SchematicWrapper {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		NBTInputStream inputStream = new NBTInputStream(new FileInputStream("testfiles/treeone.schematic"));
		CompoundTag tag = (CompoundTag) inputStream.readTag ();
		
		System.out.print(tag.getName());
		for(Tag t:tag.getValue().values()){
			System.out.println(t);
		}
		
		System.out.println(Integer.parseInt(tag.getValue().get("Width").getValue().toString()));
		
		
		
	}
}
