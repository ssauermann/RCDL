package com.tree_bit.com.rcdl.circuits;

import java.util.HashMap;
import java.util.List;

import com.tree_bit.com.rcdl.blocks.Blocks;
import com.tree_bit.com.rcdl.core.Tuple3;
import com.tree_bit.com.rcdl.datatypes.Datatype.EKind;

/**
 * A circuit contains a list of its in- and outputs as well as
 *
 * @author Sascha Sauermann
 */
public class Circuit {

	/**
	 * Size of this tuple (cuboid)
	 */
	protected final Tuple3 size;

	/**
	 * List of all in and outputs of this circuit
	 */
	protected final List<IO> io;

	/**
	 * Outputs
	 */
	private final HashMap<String, IO> outputs;

	/**
	 * Inputs
	 */
	private final HashMap<String, IO> inputs;

	/**
	 * HashMap containing all blocks of this circuit
	 */
	private final HashMap<Tuple3, Blocks> blocks;

	/**
	 * Creates a new circuit.
	 *
	 * @param size
	 *            <b>Tuple3</b> size of this circuit (cuboid)
	 * @param io
	 *            <b>List&lt;IO&gt;</b> list with in- and outputs
	 * @param blocks
	 *            <b>HashMap&lt;Tuple3, Blocks&gt;</b> blocks
	 */
	public Circuit(Tuple3 size, List<IO> io, HashMap<Tuple3, Blocks> blocks) {
		this.size = size;
		this.io = io;
		this.blocks = blocks;
		inputs = findInputs();
		outputs = findOutputs();
	}

	/**
	 * Returns a HashMap containing pairs of output names and the matching IO object.
	 *
	 * @return <b>HashMap&lt;String, IO&gt;</b> outputs
	 */
	private HashMap<String, IO> findOutputs() {
		HashMap<String, IO> outputs = new HashMap<>();

		for (IO var : getIOList())
		{
			if (var.getData().getKind() == EKind.OUT)
			{
				outputs.put(var.getData().getName(), var);
			}
		}
		return outputs;
	}

	/**
	 * Returns a HashMap containing pairs of input names and the matching IO object.
	 *
	 * @return <b>HashMap&lt;String, IO&gt;</b> inputs
	 */
	private HashMap<String, IO> findInputs() {
		HashMap<String, IO> inputs = new HashMap<>();

		for (IO var : getIOList())
		{
			if (var.getData().getKind() == EKind.IN)
			{
				inputs.put(var.getData().getName(), var);
			}
		}
		return inputs;
	}

	@Override
	public String toString() {
		return io.get(1).getData().getName();
	}

	/**
	 * Returns the size of the circuit.
	 *
	 * @return <b>Tuple3</b> size
	 */
	public Tuple3 getSize() {
		return size;
	}

	/**
	 * Returns the blocks of the circuit.
	 *
	 * @return <b>HashMap&lt;Tuple3, Blocks&gt;</b> blocks
	 */
	public HashMap<Tuple3, Blocks> getBlocks() {
		return blocks;
	}

	/**
	 * Returns the in- and outputs as a list.
	 *
	 * @return <b>List&lt;IO&gt;</b> io list
	 */
	public List<IO> getIOList() {
		return io;
	}

	/**
	 * Returns the outputs of this circuit as a HashMap containing the name of the output and a
	 * reference to the matching IO object.
	 *
	 * @return <b>HashMap&lt;String,IO&gt;</b> outputs
	 */
	public HashMap<String, IO> getOutputs() {
		return outputs;
	}

	/**
	 * Returns the inputs of this circuit as a HashMap containing the name of the input and a
	 * reference to the matching IO object.
	 *
	 * @return <b>HashMap&lt;String,IO&gt;</b> inputs
	 */
	public HashMap<String, IO> getInputs() {
		return inputs;
	}
}
