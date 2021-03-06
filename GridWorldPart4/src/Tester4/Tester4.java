package Tester4;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.critters.HunterCritter;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;

public class Tester4 {
	 public static void main(String[] args) {
	        ActorWorld world = new ActorWorld();
	        world.add(new Location(2, 2), new HunterCritter());
	        world.add(new Location(2, 3), new Bug());
	        
	        Bug cornerBug = new Bug();
	     	world.add(new Location(9, 9), cornerBug);
	     	cornerBug.setDirection(Location.EAST);
	  
	     	
	        Bug rockBug = new Bug();
	        world.add(new Location(6, 2), rockBug);
	        rockBug.setDirection(Location.SOUTH);
	        world.add(new Location(7, 2), new Rock());
	        
	        world.show();
	 }
}
