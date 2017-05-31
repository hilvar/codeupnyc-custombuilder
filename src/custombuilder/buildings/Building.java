package custombuilder.buildings;

import custombuilder.levels.*;

import java.util.ArrayList;

/**
 * Created by andyroo on 5/20/17.
 */
public class Building {

    private ArrayList<Level> levels = new ArrayList<Level>();

    public Building() {
        this.makeBuilding();
    }

    public Building(String type) {
        switch (type) {
            case "mansion":
                this.makeMansion();
                break;
            default:
                this.makeBuilding();
                break;
        }
    }

    public ArrayList<Level> getLevels() {
        return levels;
    }

    private void makeBuilding() {
        this.levels.add(new PlainLevel());
        this.levels.add(new PlainLevel());
        this.levels.add(new PlainLevel());
        this.levels.add(new PlainLevel());
        this.levels.add(new PlainLevel());
        this.levels.add(new PlainLevel());
    }

    private void makeMansion() {
        this.levels.add(new DoorLevel());
        this.levels.add(new DoorLevel());
        this.levels.add(new FrontWindowLevel());
        this.levels.add(new WindowLevel());
        this.levels.add(new FrontWindowLevel());
        this.levels.add(new WindowLevel());
        this.levels.add(new WindowLevel());
        this.levels.add(new FrontWindowLevel());
        this.levels.add(new NarrowLevel());
    }
}
