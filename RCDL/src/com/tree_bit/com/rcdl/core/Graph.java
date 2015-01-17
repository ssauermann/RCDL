package com.tree_bit.com.rcdl.core;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph<T> {

	public enum Direction {
		IN, OUT;
	}

	private Set<GraphVertex<T>> vertices = new HashSet<>();

	public Set<GraphVertex<T>> getVertices() {
		return vertices;
	}

	public void addVertex(GraphVertex<T> v) {
		vertices.add(v);
	}

	public void removeVertex(GraphVertex<T> v) {
		List<GraphEdge<?>> edges = v.getEdges();
		for (GraphEdge<?> e : edges)
		{
			e.remove();
		}
		vertices.remove(v);
	}

}
