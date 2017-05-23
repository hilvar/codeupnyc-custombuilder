package custombuilder;

import net.canarymod.api.world.blocks.BlockType;

import java.util.ArrayList;

/**
 * Created by andyroo on 5/23/17.
 */
public class SevenPlain extends Level{

    private ArrayList<BlockType[]> materials = new ArrayList<BlockType[]>();
    private EndWall wallOne = new EndWall();
    private MiddleWall wallTwo = new MiddleWall();

    SevenPlain() {
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
        materials.add(this.wallTwo.getMiddleWall());
        materials.add(this.wallTwo.getMiddleWall());
        materials.add(this.wallTwo.getMiddleWall());
        materials.add(this.wallTwo.getMiddleWall());
        materials.add(this.wallOne.getEndWall());
    }
}
