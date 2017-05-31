package custombuilder.walls;

import net.canarymod.api.world.blocks.BlockType;

/**
 * Created by andyroo on 5/20/17.
 */
public class DoorWall {

    private BlockType[] doorWall = { BlockType.Air,
            BlockType.Air,
            BlockType.Air,
            BlockType.Chest,
            BlockType.BrickBlock };

    public BlockType[] getDoorWall() {
        return doorWall;
    }
}
