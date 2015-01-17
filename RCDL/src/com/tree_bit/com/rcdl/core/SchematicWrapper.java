package com.tree_bit.com.rcdl.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.jnbt.ByteArrayTag;
import org.jnbt.CompoundTag;
import org.jnbt.NBTInputStream;
import org.jnbt.Tag;

/**
 * Wrapper for Minecraft NBT files.
 * Used for MCEdit schematics.
 *  
 * @see
 * http://minecraft.gamepedia.com/Schematic
 * 
 * @author Sascha Sauermann
 */
public class SchematicWrapper {
	
	final CompoundTag root;
	
	public SchematicWrapper(String path) throws FileNotFoundException, IOException{
		NBTInputStream inputStream = new NBTInputStream(new FileInputStream(path));
		root = (CompoundTag) inputStream.readTag ();
		inputStream.close();
	}
	
	private Tag getTag(String key){
		return root.getValue().get(key);
	}
	
	private int readIntValue(String key){
		return Integer.parseInt(getTag(key).getValue().toString());
	}
	
	public int readHeight(){
		return readIntValue("Height");
	}
	
	public int readWidth(){
		return readIntValue("Width");
	}
	
	public int readLength(){
		return readIntValue("Length");
	}
	
	//8 Bits per Block
	public byte[] readBlocks(){
		return ((ByteArrayTag)getTag("Blocks")).getValue();
	}
	
	//Lower 4 Bits per Block
	public byte[] readData(){
		return ((ByteArrayTag)getTag("Data")).getValue();
	}
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		SchematicWrapper wrapper = new SchematicWrapper("testfiles/treeone.schematic");
		
		//Minecraft default: YZX
		System.out.println("Size (YZX): "+wrapper.readHeight() + "x" + wrapper.readLength() + "x" + wrapper.readWidth());
		
		//Print one Block Layer (Width * Length) (Layer 10)
		byte[] blocks = wrapper.readBlocks();
		
		int y=10;
		
		for(int x=0; x<wrapper.readWidth();x++){
			for(int z=0; z<wrapper.readLength();z++){
				int value = blocks[(y*wrapper.readLength()+z)*wrapper.readWidth()+x];
			System.out.print(((value<10)?("0"+value):value)+ "|");
		}
		System.out.println("");
		}
	}
}
