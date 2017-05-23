package custombuilder;

import net.canarymod.api.world.blocks.BlockType;

/**
 * Created by andyroo on 5/20/17.
 */
public class MiddleWall {

    private BlockType[] middleWall = { BlockType.BrickBlock,
                                    BlockType.Air,
                                    BlockType.Air,
                                    BlockType.Air,
                                    BlockType.BrickBlock };

    public BlockType[] getMiddleWall() {
        return middleWall;
    }
}
