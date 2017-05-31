package custombuilder.walls;

import net.canarymod.api.world.blocks.BlockType;

/**
 * Created by andyroo on 5/23/17.
 */
public class MiddleWindowWall {

    private BlockType[] middleWindowWall = { BlockType.GlassPane,
            BlockType.Air,
            BlockType.Air,
            BlockType.Air,
            BlockType.GlassPane };

    public BlockType[] getMiddleWindowWall() {
        return middleWindowWall;
    }
}
