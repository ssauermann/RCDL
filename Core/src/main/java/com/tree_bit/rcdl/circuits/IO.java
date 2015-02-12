package com.tree_bit.rcdl.circuits;

import com.tree_bit.rcdl.core.Tuple3;
import com.tree_bit.rcdl.datatypes.Datatype;

/**
 * Manages a in- or output.
 *
 * @author Sascha Sauermann
 */
public class IO {

    /**
     * Position of this IO in the parent circuit.
     */
    private final Tuple3 pos;

    /**
     * Type of this IO.
     */
    private final Datatype data;

    /**
     * Creates a new IO
     *
     * @param pos <b>Tuple3</b> position of this IO relative to the parent
     *        circuit.
     * @param data <b>Datatype</b> type of this IO
     */
    public IO(Tuple3 pos, Datatype data) {
        this.pos = pos;
        this.data = data;
    }

    /**
     * Returns the position of this IO relative to the parent circuit.
     *
     * @return <b>Tuple3</b> position
     */
    public Tuple3 getPos() {
        return this.pos;
    }

    /**
     * Returns the type of this IO.
     *
     * @return <b>Datatype</b>
     */
    public Datatype getData() {
        return this.data;
    }
}
