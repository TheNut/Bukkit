
package org.bukkit;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;

import org.bukkit.plugin.PluginManager;

/**
 * Represents a server implementation
 */
public interface Server {
    /**
     * Gets the name of this server implementation
     *
     * @return name of this server implementation
     */
    public String getName();

    /**
     * Gets the version string of this server implementation.
     *
     * @return version of this server implementation
     */
    public String getVersion();

    /**
     * Gets a list of all currently logged in players
     *
     * @return An array of Players that are currently online
     */
    public Player[] getOnlinePlayers();
    
    /**
     * Broadcast a message to all players.
     * 
     * @param message the message
     * @return the number of players
     */
    public int broadcastMessage(String message);

    /**
     * Gets a player object by the given username
     *
     * This method may not return objects for offline players
     *
     * @param name Name to look up
     * @return Player if it was found, otherwise null
     */
    public Player getPlayer(String name);

    /**
     * Attempts to match any players with the given name, and returns a list
     * of all possibly matches
     *
     * This list is not sorted in any particular order. If an exact match is found,
     * the returned list will only contain a single result.
     *
     * @param name Name to match
     * @return List of all possible players
     */
    public List<Player> matchPlayer(String name);

    /**
     * Gets the PluginManager for interfacing with plugins
     *
     * @return PluginManager for this Server instance
     */
    public PluginManager getPluginManager();

    /**
     * Gets a list of all worlds on this server
     *
     * @return An array of worlds
     */
    public World[] getWorlds();

    /**
     * Gets the in-game time on the server (in hours*1000)
     *
     * @return The current time in hours*1000
     */
    public long getTime();

    /**
     * Sets the in-game time on the server (in hours*1000)
     *
     * @param time The time to set the in-game time to (in hours*1000)
     */
    public void setTime(long time);

    /**
     * Reloads the server, refreshing settings and plugin information
     */
    public void reload();

    /**
     * Create a new Material of type <tt>type</tt>
     * 
     * This material is only guaranteed to have the basic functionality of any material.
     * It may have extra functionality, but this needs to be checked for using <tt>instanceof</tt>.
     * For example, to check if a material is colorable, you must use:
     * <tt>if (material instanceof org.bukkit.material.Colorable) </tt>
     * 
     * @param type the type of this material
     * @return
     */
    public Material newMaterial(Material.Type type);

    /**
     * Similar to <tt>newMaterial(Material.Type type)</tt> but uses a lookup against a name.
     * 
     * This can be used to get materials through their enum name, or to get custom materials that are server specific.
     * @param name
     * @return
     */
    public Material newMaterial(String name);
    
    /**
     * Create a stack of Material.
     * 
     * @param material the Material of the ItemStack.
     * @param amount the number of Material in this stack.
     * 
     * @return a new ItemStack as specified, or null if it was not created.
     */
    public ItemStack newItemStack(Material material, int amount);
}
