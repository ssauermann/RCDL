package com.tree_bit.rcdl.blocks;

import com.google.common.math.IntMath;

import java.util.Set;

/**
 * Position of a half slab.
 *
 * <p>
 * This orientation is used by:
 * <ul>
 * <li>{@link HalfSlab1}</li>
 * <li>{@link HalfSlab2}</li>
 * <li>{@link WoodHalfSlab}</li>
 * </ul>
 *
 * <p>
 * Allowed axes for rotation (multiple of 90/180 degree) are:
 * <ul>
 * <li>x (180°)</li>
 * <li>y (90°)</li>
 * <li>z (180°)</li>
 * </ul>
 *
 * <p>
 * Allowed plains for mirroring are:
 * <ul>
 * <li>x-y</li>
 * <li>z-y</li>
 * <li>x-z</li>
 * </ul>
 */
public enum SlabPosition implements IDataValueEnum, IOrientationEnum {
    /** Upper half of the block - upside-down */
    UP(8),
    /** Lower half of the block - right-side-up */
    Down(0);

    private int value;

    private SlabPosition(final int dataValue) {
        this.value = dataValue;
    }

    @Override
    public int getDataValue() {
        return this.value;
    }

    @Override
    public SlabPosition rotate(final Axis axis, final int n) {
        if (axis != Axis.Y) {
            return this.next(n);
        }
        return this;
    }

    @Override
    public SlabPosition mirror(final Set<Axis> plain) {
        Axis.checkPlain(plain);
        if (plain.contains(Axis.Z) && plain.contains(Axis.X)) {
            return this.next(1);
        }
        return this;
    }

    @Override
    public SlabPosition next(final int n) {
        final SlabPosition temp = values()[IntMath.mod((this.ordinal() + n), 2)];
        if (temp != null) {
            return temp;
        }
        throw new NullPointerException();
    }
}
