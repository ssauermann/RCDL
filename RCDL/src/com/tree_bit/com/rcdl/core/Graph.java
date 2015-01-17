package com.tree_bit.com.rcdl.core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Graph<T> implements Iterable<GraphVertex<T>> {

	public enum Direction {
		IN, OUT;
	}

	private HashSet<GraphVertex<T>> vertices = new HashSet<>();

	public HashSet<GraphVertex<T>> getVertices() {
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

	@Override
	public Iterator<GraphVertex<T>> iterator() {
		return vertices.iterator();
	}

	@Override
	public String toString() {
		String s = "";
		s += "#|";
		List<GraphVertex<T>> l = new ArrayList<>();
		for (GraphVertex<T> graphVertex : vertices)
		{
			s += graphVertex.getData().toString() + "|";
			l.add(graphVertex);
		}
		s += "\n";
		for (GraphVertex<T> graphVertex : l)
		{
			s += graphVertex.getData().toString() + "|";
			List<GraphEdge<?>> edges = graphVertex.getEdges(Direction.OUT);
			testVertices: for (GraphVertex<T> other : l)
			{
				for (GraphEdge<?> edge : edges)
				{
					if (edge.getTo().equals(other))
					{
						s += "1|";
						continue testVertices;
					}
				}
				s += "0|";
			}
			s += "\n";
		}
		return s;
	}

}
