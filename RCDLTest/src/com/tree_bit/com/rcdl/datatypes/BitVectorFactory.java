package com.tree_bit.com.rcdl.datatypes;



/**
 * The class <code>BitVectorFactory</code> implements static methods that return instances of the class <code>{@link BitVector}</code>.
 *
 * @generatedBy CodePro at 17.01.15 20:13
 * @author Sascha
 * @version $Revision: 1.0 $
 */
public class BitVectorFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 17.01.15 20:13
	 */
	private BitVectorFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link BitVector}</code>.
	 *
	 * @generatedBy CodePro at 17.01.15 20:13
	 */
	public static BitVector createBitVector() {
		return new BitVector(Datatype.EKind.IN, new boolean[] {false}, false);
	}


	/**
	 * Create an instance of the class <code>{@link BitVector}</code>.
	 *
	 * @generatedBy CodePro at 17.01.15 20:13
	 */
	public static BitVector createBitVector2() {
		return new BitVector(Datatype.EKind.OUT, new boolean[] {true}, true);
	}


	/**
	 * Create an instance of the class <code>{@link BitVector}</code>.
	 *
	 * @generatedBy CodePro at 17.01.15 20:13
	 */
	public static BitVector createBitVector3() {
		return new BitVector(Datatype.EKind.VAR, new boolean[] {false, true}, true);
	}
}