package com.tree_bit.rcdl.core;

/**
 * 3 dimensional tuple/vector.
 *
 * @author Sascha Sauermann
 */
public class Tuple3 implements Comparable<Tuple3> {
	/**
	 * x coordinate
	 */
	private int x;

	/**
	 * y coordinate
	 */
	private int y;

	/**
	 * z coordinate
	 */
	private int z;

	/**
	 * Creates a new Tuple3 from single coordinates.
	 *
	 * @param x
	 *            <b>int</b> x value
	 * @param y
	 *            <b>int</b> y value
	 * @param z
	 *            <b>int</b> z value
	 */
	public Tuple3(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * Creates a new Tuple3 from an other tuple.
	 *
	 * @param tuple
	 *            <b>Tuple</b> tuple
	 */
	public Tuple3(Tuple3 tuple) {
		if (tuple == null) throw new IllegalArgumentException("Tuple is NULL");
		x = tuple.x;
		y = tuple.y;
		z = tuple.z;
	}

	/**
	 * Returns the x value.
	 *
	 * @return <b>int</b> x value
	 */
	public int getX() {
		return x;
	}

	/**
	 * Sets the x value.
	 *
	 * @param x
	 *            <b>int</b> x value
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Returns the y value.
	 *
	 * @return <b>int</b> y value
	 */
	public int getY() {
		return y;
	}

	/**
	 * Sets the y value.
	 *
	 * @param y
	 *            <b>int</b> y value
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Returns the z value.
	 *
	 * @return <b>int</b> z value
	 */
	public int getZ() {
		return z;
	}

	/**
	 * Sets the z value.
	 *
	 * @param z
	 *            <b>int</b> z value
	 */
	public void setZ(int z) {
		this.z = z;
	}

	/**
	 * Adds an other vector to this one.
	 *
	 * @param t
	 *            <b>Tuple3</b> second vector
	 * @return <b>Tuple3</b> sum
	 */
	public Tuple3 add(Tuple3 t) {
		return new Tuple3(x + t.x, y + t.y, z + t.z);
	}

	/**
	 * Negates this vector.
	 *
	 * @return <b>Tuple3</b> negated vector
	 */
	public Tuple3 negate() {
		return new Tuple3(-x, -y, -z);
	}

	/**
	 * Multiplies this vector with an integer.
	 *
	 * @param m
	 *            <b>int</b> factor
	 * @return <b>Tuple3</b> product
	 */
	public Tuple3 multiply(int m) {
		return new Tuple3(x * m, y * m, z * m);
	}

	/**
	 * Divides this vector by an integer.
	 *
	 * @param m
	 *            <b>int</b> divisor
	 * @return <b>Tuple3</b> quotient
	 */
	public Tuple3 divide(int m) {
		return new Tuple3(x / m, y / m, z / m);
	}

	/**
	 * Returns the length of this vector.
	 *
	 * @return <b>double</b> length
	 */
	public double getLength() {
		return Math.sqrt((x * x) + (y * y) + (z * z));
	}

	/**
	 * Returns the volume of the cuboid spanned by this vector.
	 *
	 * @return <b>Tuple3</b> volume
	 */
	public int getVolume() {
		return getX() * getY() * getZ();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + x;
		result = (prime * result) + y;
		result = (prime * result) + z;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof Tuple3)) return false;
		Tuple3 other = (Tuple3) obj;
		if (x != other.x) return false;
		if (y != other.y) return false;
		if (z != other.z) return false;
		return true;
	}

	@Override
	public int compareTo(Tuple3 o) {
		// Length of a vector
		int valThis = ((getX() * getX()) + (getY() * getY()) + (getZ() * getZ()));
		int valOther = ((o.getX() * o.getX()) + (o.getY() * o.getY()) + (o.getZ() * o.getZ()));
		return valThis - valOther;
	}
}
