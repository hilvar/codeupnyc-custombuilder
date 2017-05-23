package custombuilder;

import net.canarymod.api.world.blocks.BlockType;

import java.util.ArrayList;

/**
 * Created by andyroo on 4/29/17.
 */
public class PlainLevel extends Level {

    private ArrayList<BlockType[]> materials = new ArrayList<BlockType[]>();
    private EndWall wallOne = new EndWall();
    private MiddleWall wallTwo = new MiddleWall();

    PlainLevel() {
        this.makeLevel();
    }

    public ArrayList<BlockType[]> getWallData() {
        return materials;
    }

    private void makeLevel() {
        materials.add(this.wallOne.getEndWall());
        materials.add(this.wallTwo.getMiddleWall());
        materials.add(this.wallTwo.getMiddleWall());
        materials.add(this.wallTwo.getMiddleWall());
        materials.add(this.wallOne.getEndWall());
    }
}
