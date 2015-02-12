package com.tree_bit.rcdl.core;

import com.tree_bit.rcdl.core.Graph.Direction;

public class GraphEdge<T> {

	private GraphVertex<?> from;
	private GraphVertex<?> to;

	private T value;

	public GraphEdge(GraphVertex<?> from, GraphVertex<?> to, T value) {
		from.addEdge(this, Direction.OUT);
		to.addEdge(this, Direction.IN);
		this.to = to;
		this.from = from;
		this.value = value;
	}

	public GraphVertex<?> getFrom() {
		return from;
	}

	public void setFrom(GraphVertex<?> from) {
		this.from.removeEdge(this, Direction.OUT);
		this.from = from;
		from.addEdge(this, Direction.OUT);
	}

	public GraphVertex<?> getTo() {
		return to;
	}

	public void setTo(GraphVertex<?> to) {
		this.to.removeEdge(this, Direction.IN);
		this.to = to;
		to.addEdge(this, Direction.IN);
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void remove() {
		this.to.removeEdge(this, Direction.IN);
		this.from.removeEdge(this, Direction.OUT);
	}

}
