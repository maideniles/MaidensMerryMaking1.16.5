package com.maideniles.maidensmerrymaking.util;

import net.minecraft.util.math.vector.Vector3d;

public class Utils {

    public static Vector3d fraction(Vector3d vec)
    {
        return new Vector3d(
                vec.getX() - Math.floor(vec.getX()),
                vec.getY() - Math.floor(vec.getY()),
                vec.getZ() - Math.floor(vec.getZ())
        );
    }
}
