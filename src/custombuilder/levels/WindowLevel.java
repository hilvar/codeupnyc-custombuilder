package custombuilder.levels;

import custombuilder.walls.EndWindowWall;
import custombuilder.walls.MiddleWall;
import net.canarymod.api.world.blocks.BlockType;

import java.util.ArrayList;

/**
 * Created by andyroo on 5/20/17.
 */
public class WindowLevel extends Level {

    private ArrayList<BlockType[]> materials = new ArrayList<BlockType[]>();
    private EndWindowWall windowWall = new EndWindowWall();
    private MiddleWall wallTwo = new MiddleWall();

    public WindowLevel() {
        this.makeLevel();
    }

    public ArrayList<BlockType[]> getWallData() {
        return materials;
    }

    private void makeLevel() {
        materials.add(this.windowWall.getEndWindowWall());
        materials.add(this.wallTwo.getMiddleWall());
        materials.add(this.wallTwo.getMiddleWall());
        materials.add(this.wallTwo.getMiddleWall());
        materials.add(this.wallTwo.getMiddleWall());
        materials.add(this.wallTwo.getMiddleWall());
        materials.add(this.wallTwo.getMiddleWall());
        materials.add(this.wallTwo.getMiddleWall());
        materials.add(this.windowWall.getEndWindowWall());
    }
}
