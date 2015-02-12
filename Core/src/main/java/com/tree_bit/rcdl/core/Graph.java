package com.tree_bit.rcdl.core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Graph<T> implements Iterable<GraphVertex<T>> {

    public enum Direction {
        IN, OUT;
    }

    private final HashSet<GraphVertex<T>> vertices = new HashSet<>();

    public HashSet<GraphVertex<T>> getVertices() {
        return this.vertices;
    }

    public void addVertex(GraphVertex<T> v) {
        this.vertices.add(v);
    }

    public void removeVertex(GraphVertex<T> v) {
        final List<GraphEdge<?>> edges = v.getEdges();
        for (final GraphEdge<?> e : edges) {
            e.remove();
        }
        this.vertices.remove(v);
    }

    @Override
    public Iterator<GraphVertex<T>> iterator() {
        return this.vertices.iterator();
    }

    @Override
    public String toString() {
        String s = "";
        s += "#|";
        final List<GraphVertex<T>> l = new ArrayList<>();
        for (final GraphVertex<T> graphVertex : this.vertices) {
            s += graphVertex.getData().toString() + "|";
            l.add(graphVertex);
        }
        s += "\n";
        for (final GraphVertex<T> graphVertex : l) {
            s += graphVertex.getData().toString() + "|";
            final List<GraphEdge<?>> edges = graphVertex.getEdges(Direction.OUT);
            testVertices: for (final GraphVertex<T> other : l) {
                for (final GraphEdge<?> edge : edges) {
                    if (edge.getTo().equals(other)) {
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
