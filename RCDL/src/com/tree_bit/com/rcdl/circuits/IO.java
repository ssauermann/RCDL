package com.tree_bit.com.rcdl.circuits;

import com.tree_bit.com.rcdl.core.Tuple3;
import com.tree_bit.com.rcdl.datatypes.Datatype;

public class IO {
	private Tuple3 pos;
	private Datatype data;

	public IO(Tuple3 pos, Datatype data) {
		this.pos = pos;
		this.data = data;
	}

	public Tuple3 getPos() {
		return pos;
	}

	public Datatype getData() {
		return data;
	}
}