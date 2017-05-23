package custombuilder;

import net.canarymod.api.world.blocks.BlockType;

import java.util.ArrayList;

/**
 * Created by andyroo on 5/20/17.
 */
public abstract class Level {

    public abstract ArrayList<BlockType[]> getWallData();
}
