package custombuilder;


import net.canarymod.api.world.blocks.BlockType;

/**
 * Created by andyroo on 5/20/17.
 */
public class EndWall {

    private BlockType[] endWall = { BlockType.BrickBlock,
                                    BlockType.BrickBlock,
                                    BlockType.BrickBlock,
                                    BlockType.BrickBlock,
                                    BlockType.BrickBlock };

    public BlockType[] getEndWall() {
        return endWall;
    }
}
