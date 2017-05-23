package custombuilder;

import net.canarymod.api.world.blocks.BlockType;

import java.util.ArrayList;

/**
 * Created by andyroo on 5/20/17.
 */
public class DoorLevel extends Level {

    private ArrayList<BlockType[]> materials = new ArrayList<BlockType[]>();
    private EndWall wallOne = new EndWall();
    private MiddleWall wallTwo = new MiddleWall();
    private DoorWall doorWall = new DoorWall();

    DoorLevel() {
        this.makeLevel();
    }

    @Override
    public ArrayList<BlockType[]> getWallData() {
        return materials;
    }

    private void makeLevel() {
        materials.add(this.wallOne.getEndWall());
        materials.add(this.wallTwo.getMiddleWall());
        materials.add(this.wallTwo.getMiddleWall());
        materials.add(this.wallTwo.getMiddleWall());
        materials.add(this.doorWall.getDoorWall());
        materials.add(this.wallTwo.getMiddleWall());
        materials.add(this.wallTwo.getMiddleWall());
        materials.add(this.wallTwo.getMiddleWall());
        materials.add(this.wallOne.getEndWall());
    }
}
