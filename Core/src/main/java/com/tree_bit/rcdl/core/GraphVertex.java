package com.tree_bit.rcdl.core;

import java.util.ArrayList;
import java.util.List;

import com.tree_bit.rcdl.core.Graph.Direction;

public class GraphVertex<T> {

	private List<GraphEdge<?>> in;
	private List<GraphEdge<?>> out;

	private T data;

	public GraphVertex(T data) {
		in = new ArrayList<GraphEdge<?>>();
		out = new ArrayList<GraphEdge<?>>();
		this.data = data;
	}

	public void addEdge(GraphEdge<?> e, Direction direction) {
		if (direction == Direction.IN)
		{
			in.add(e);
		} else
		{
			out.add(e);
		}
	}

	public void setData(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void removeEdge(GraphEdge<?> e, Direction direction) {
		if (direction == Direction.IN)
		{
			in.remove(e);
		} else
		{
			out.remove(e);
		}
	}

	public List<GraphEdge<?>> getEdges(Direction direction) {
		if (direction == Direction.IN)
			return in;
		else
			return out;
	}

	public List<GraphEdge<?>> getEdges() {
		List<GraphEdge<?>> edges = new ArrayList<>();
		edges.addAll(in);
		edges.addAll(out);
		return edges;
	}
}