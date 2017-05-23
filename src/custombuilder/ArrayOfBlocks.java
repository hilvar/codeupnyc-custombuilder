/***
 * Excerpted from "Learn to Program with Minecraft Plugins, CanaryMod Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/ahmine2 for more book information.
***/
package custombuilder;

import net.canarymod.commandsys.*;
import net.canarymod.chat.MessageReceiver;
import net.canarymod.api.entity.living.humanoid.Player;
import net.canarymod.api.world.position.Location;
import net.canarymod.api.world.blocks.BlockType;
import com.pragprog.ahmine.ez.EZPlugin;

public class ArrayOfBlocks extends EZPlugin {

  public void buildTower(Player me, String[] params) {
    Building building;
    Location loc = me.getLocation();
    loc.setX(loc.getX() + 3); // Not right on top of player

    if (params.length > 1) {
      building = new Building(params[1]);
    }
    else {
      building = new Building();
    }

    for (Level level : building.getLevels()) {
      for (BlockType[] wall : level.getWallData()) {
        for (BlockType block : wall) {
          setBlockAt(loc, block);
          loc.setX(loc.getX() + 1); // go up one each time
        }
        loc.setX(loc.getX() - wall.length);
        loc.setZ(loc.getZ() + 1);
      }
      loc.setY(loc.getY() + 1);
      loc.setZ(loc.getZ() - level.getWallData().size());
    }
  }
  
  @Command(aliases = {"custombuilder"},
            description = "Create an array of blocks",
            permissions = { "" },
            toolTip = "/custombuilder")
  public void custombuilderCommand(MessageReceiver caller, String[] args) {
    if (caller instanceof Player) { 
      Player me = (Player)caller;
      buildTower(me, args);
    }
  }
}
