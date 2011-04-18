package org.bukkit.material;

import org.bukkit.DyeColor;

/**
 * Represents a Material that can be colored
 */
public interface Colorable extends MaterialComplex{

    /**
     * Gets the current color of this dye
     *
     * @return DyeColor of this dye
     */
    public DyeColor getColor();

    /**
     * Sets the color of this dye
     *
     * @param color New color of this dye
     */
    public void setColor(DyeColor color);

}