
package org.bukkit.block;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;

/**
 * Represents a captured state of a block, which will not change automatically.
 *
 * Unlike Block, which only one object can exist per coordinate, BlockState can
 * exist multiple times for any given Block. Note that another plugin may change
 * the state of the block and you will not know, or they may change the block to
 * another type entirely, causing your BlockState to become invalid.
 */
public interface BlockState {
    /**
     * Gets the block represented by this BlockState
     * 
     * @return Block that this BlockState represents
     */
    Block getBlock();

    /**
     * Gets a Material with the same properties as this block.
     * 
     * This material can be manipulated (depending on its type) and then used to set
     * the material of the block.
     *
     * @return a Material with the same properties as this block.
     * 
     * @see setMaterial()
     */
    Material getMaterial();

    /**
     * Gets the type-id of this block
     *
     * @return block type-id
     */
    int getTypeId();

    /**
     * Gets the light level between 0-15
     *
     * @return light level
     */
    byte getLightLevel();

    /**
     * Gets the world which contains this Block
     *
     * @return World containing this block
     */
    World getWorld();

    /**
     * Gets the x-coordinate of this block
     *
     * @return x-coordinate
     */
    int getX();

    /**
     * Gets the y-coordinate of this block
     *
     * @return y-coordinate
     */
    int getY();

    /**
     * Gets the z-coordinate of this block
     *
     * @return z-coordinate
     */
    int getZ();

    /**
     * Gets the chunk which contains this block
     *
     * @return Containing Chunk
     */
    Chunk getChunk();

    /**
     * Sets the type of this block
     *
     * @param type Material to change this block to
     */
    void setMaterial(Material material);

    /**
     * Attempts to update the block represented by this state, setting it to the
     * new values as defined by this state. <br />
     * <br />
     * This has the same effect as calling update(false). That is to say,
     * this will not modify the state of a block if it is no longer the same
     * base material type as it was when this state was taken. It will return false in this
     * eventuality.
     *
     * @return true if the update was successful, otherwise false
     * @see BlockState.update(boolean force)
     */
    boolean update();

    /**
     * Attempts to update the block represented by this state, setting it to the
     * new values as defined by this state. <br />
     * <br />
     * Unless force is true, this will not modify the state of a block if it is
     * no longer the same base material type as it was when this state was taken. It will return
     * false in this eventuality.<br />
     * <br />
     * If force is true, it will set the type of the block to match the new state,
     * set the state data and then return true.
     *
     * @param force true to forcefully set the state
     * @return true if the update was successful, otherwise false
     */
    boolean update(boolean force);
}
