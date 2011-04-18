
package org.bukkit.inventory;

import org.bukkit.Material;

/**
 * Represents a stack of items
 */
public interface ItemStack {

    /**
     * Gets a Material with the same properties as this item
     *
     * @return Material of the items in this stack
     */
    public Material getMaterial();

    /**
     * Sets the Material of this ItemStack.
     *
     * @param material New material to set the items in this stack to
     */
    public void setMaterial(Material material);

    /**
     * Gets the amount of items in this stack
     *
     * @return Amount of items in this stick
     */
    public int getAmount();

    /**
     * Sets the amount of items in this stack
     *
     * @param amount New amount of items in this stack
     */
    public void setAmount(int amount);

    /**
     * Gets the damage of this item<br /><br />
     *
     * 0x00 represents an item which cannot be damaged<br />
     * 0x01 represents an item at maximum health<br />
     * 0x32 represents an item with no health left
     *
     * @return Damage of this item
     */
    public byte getDamage();

    /**
     * Sets the damage of this item.
     * 
     * Note that this may override the Material, if the Material is a MaterialComplex.
     *
     * 0x00 represents an item which cannot be damaged<br />
     * 0x01 represents an item at maximum health<br />
     * 0x32 represents an item with no health left
     *
     * @param damage Damage of this item
     */
    public void setDamage(final byte damage);

    /**
     * Get the maximum stacksize for the material hold in this ItemStack
     * Returns -1 if it has no idea.
     * 
     * @return The maximum you can stack this material to.
     */
    public int getMaxStackSize();
}
