
package org.bukkit.material;

import org.bukkit.block.BlockFace;

/**
 * Represents a signs Material
 */
public interface Sign extends MaterialComplex, Attachable {

    /**
     * Gets the direction that this sign is currently facing
     *
     * @return BlockFace indicating where this sign is facing
     */
    public BlockFace getFacing();

}
