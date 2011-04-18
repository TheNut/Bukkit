/**
 * 
 */
package org.bukkit.event.block;

import org.bukkit.block.Block;

/**
 * @author durron597
 */
public class BlockCanBuildEvent extends BlockEvent {
    protected boolean buildable;

    public BlockCanBuildEvent(Type type, Block block, boolean canBuild) {
        super(type, block);
        buildable = canBuild;
    }

    /**
     * Returns whether or not the block can be built here. By default, returns
     * Minecraft's answer on whether the block can be built
     * 
     * @return boolean whether or not the block can be built
     */
    public boolean isBuildable() {
        return buildable;
    }

    /**
     * Set whether the block can be built here.
     */
    public void setBuildable(boolean cancel) {
        this.buildable = cancel;
    }
}
