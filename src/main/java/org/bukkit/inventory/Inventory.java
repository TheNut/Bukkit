package org.bukkit.inventory;

import java.util.Map;

import org.bukkit.Material;

/**
 * Interface to the various inventories
 */
public interface Inventory {
    /**
     * Returns the size of the inventory
     * 
     * @return The inventory size
     */
    public int getSize();

    /**
     * Return the name of the inventory
     * 
     * @return The inventory name
     */
    public String getName();

    /**
     * Get the ItemStack found in the slot at the given index
     * 
     * @param index The index of the Slot's ItemStack to return
     * @return The ItemStack in the slot
     */
    public ItemStack getItem(int index);

    /**
     * Stores the ItemStack at the given index
     * 
     * @param index The index where to put the ItemStack
     * @param item The ItemStack to set
     */
     public void setItem(int index, ItemStack item);

    /**
     * Stores the given ItemStacks in the inventory.
     * 
     * This will try to fill existing stacks and empty slots as good as it can.
     * It will return a Map of what it couldn't fit.
     * 
     * @param items The ItemStacks to add
     * @return 
     */
     public Map<Integer, ItemStack> addItem(ItemStack... items);

    /**
     * Removes the given ItemStacks from the inventory.
     * 
     * It will try to remove 'as much as possible' from the types and amounts you
     * give as arguments. It will return a Map of what it couldn't remove.
     * 
     * @param items The ItemStacks to remove
     * @return 
     */
     public Map<Integer, ItemStack> removeItem(ItemStack... items);

    /**
     * Get all ItemStacks from the inventory
     * 
     * @return All the ItemStacks from all slots
     */
    public ItemStack[] getContents();

    /**
     * Set the inventory's contents
     * 
     * @return All the ItemStacks from all slots
     */
    public void setContents(ItemStack[] items);

    /**
     * Check if the inventory contains any ItemStacks with the given Material.Type
     * 
     * @param materialType The Material.Type to check for
     * @return If any ItemStacks were found
     */
    public boolean contains(Material.Type materialType); 
    
    /**
     * Check if the inventory contains any ItemStacks with the given material
     * 
     * @param material The material to check for
     * @return If any ItemStacks were found
     */
    public boolean contains(Material material); 
    
    /**
     * Check if the inventory contains any ItemStacks matching the given ItemStack
     * This will only match if both the type and the amount of the stack match
     * 
     * @param item The ItemStack to match against
     * @return If any matching ItemStacks were found
     */
    public boolean contains(ItemStack item);

    /**
     * Find all slots in the inventory containing any ItemStacks with the given materialId
     * 
     * @param materialId The materialId to look for
     * @return The Slots found.
     */
    public Map<Integer, ? extends ItemStack> all(int materialId); 

    /**
     * Find all slots in the inventory containing any ItemStacks with the given material
     * 
     * @param materialId The material to look for
     * @return The Slots found.
     */
    public Map<Integer, ? extends ItemStack> all(Material material); 

    /**
     * Find all slots in the inventory containing any ItemStacks with the given ItemStack
     * This will only match slots if both the type and the amount of the stack match
     * 
     * @param item The ItemStack to match against
     * @return The Slots found.
     */
    public Map<Integer, ? extends ItemStack> all(ItemStack item);

    /**
     * Find the first slot in the inventory containing an ItemStack with the given Material.Type
     * 
     * @param materialType The Material.Type to look for
     * @return The Slot found.
     */
    public int first(Material.Type materialType);

    /**
     * Find the first slot in the inventory containing an ItemStack with the given material
     * 
     * @param materialId The material to look for
     * @return The Slot found.
     */
    public int first(Material material);

    /**
     * Find the first slot in the inventory containing an ItemStack with the given stack
     * This will only match a slot if both the type and the amount of the stack match
     * 
     * @param item The ItemStack to match against
     * @return The Slot found.
     */
    public int first(ItemStack item);

    /**
     * Find the first empty Slot.
     * 
     * @return The first empty Slot found.
     */
    public int firstEmpty();

    /**
     * Remove all stacks in the inventory matching the given Material.Type.
     * 
     * @param materialType The Material.Type to remove
     */
    public void remove(Material.Type materialType);

    /**
     * Remove all stacks in the inventory matching the given material.
     * 
     * @param material The material to remove
     */
    public void remove(Material material);

    /**
     * Remove all stacks in the inventory matching the given stack.
     * This will only match a slot if both the type and the amount of the stack match
     * 
     * @param item The ItemStack to match against
     */
    public void remove(ItemStack item);

    /**
     * Clear out a particular slot in the index
     * 
     * @param index The index to empty.
     */
    public void clear(int index);

    /**
     * Clear out the whole index
     */
    public void clear();
}
