package Tester3_new;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.critters.HunterCritter;
import info.gridworld.grid.Location;

public class Tester3 {
	 public static void main(String[] args) {
	        ActorWorld world = new ActorWorld();
	        world.add(new Location(5, 5), new HunterCritter());
	        world.add(new Location(4, 5), new Bug());
	        
	        for (int a=2; a<=8; a++) {
	        	 world.add(new Location(1, a), new Bug());
	        	 world.add(new Location(7, a), new Bug());
	        }

	        for (int a=2; a<=7; a++) {
	        	 world.add(new Location(a, 2), new Bug());
	        	 world.add(new Location(a, 8), new Bug());
	        }
	        
	        world.show();
	 }
}
