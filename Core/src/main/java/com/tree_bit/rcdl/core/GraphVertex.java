package com.tree_bit.rcdl.core;

import com.tree_bit.rcdl.core.Graph.Direction;

import java.util.ArrayList;
import java.util.List;

public class GraphVertex<T> {

    private final List<GraphEdge<?>> in;
    private final List<GraphEdge<?>> out;

    private T data;

    public GraphVertex(T data) {
        this.in = new ArrayList<GraphEdge<?>>();
        this.out = new ArrayList<GraphEdge<?>>();
        this.data = data;
    }

    public void addEdge(GraphEdge<?> e, Direction direction) {
        if (direction == Direction.IN) {
            this.in.add(e);
        } else {
            this.out.add(e);
        }
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void removeEdge(GraphEdge<?> e, Direction direction) {
        if (direction == Direction.IN) {
            this.in.remove(e);
        } else {
            this.out.remove(e);
        }
    }

    public List<GraphEdge<?>> getEdges(Direction direction) {
        if (direction == Direction.IN) {
            return this.in;
        } else {
            return this.out;
        }
    }

    public List<GraphEdge<?>> getEdges() {
        final List<GraphEdge<?>> edges = new ArrayList<>();
        edges.addAll(this.in);
        edges.addAll(this.out);
        return edges;
    }
}
