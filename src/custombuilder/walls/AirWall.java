package custombuilder.walls;

import net.canarymod.api.world.blocks.BlockType;

public class AirWall {

    private BlockType[] airWall = { BlockType.Air,
            BlockType.Air,
            BlockType.Air,
            BlockType.Air,
            BlockType.Air };

    public BlockType[] getAirWall() {
        return airWall;
    }
}
