package custombuilder;

import net.canarymod.api.world.blocks.BlockType;

/**
 * Created by andyroo on 5/20/17.
 */
public class EndWindowWall {

    private BlockType[] endWindowWall = { BlockType.BrickBlock,
            BlockType.BrickBlock,
            BlockType.GlassPane,
            BlockType.BrickBlock,
            BlockType.BrickBlock };

    public BlockType[] getEndWindowWall() {
        return endWindowWall;
    }
}
