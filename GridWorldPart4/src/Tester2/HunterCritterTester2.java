package Tester2;

import info.gridworld.actor.ActorWorld;
import info.gridworld.critters.*;

import java.awt.Color;

import info.gridworld.actor.*;
import info.gridworld.grid.Location;

public class HunterCritterTester2 {
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		
		
		Bug aliveBug = new Bug();
		world.add(new Location(5, 7), aliveBug);
		aliveBug.setDirection(Location.SOUTH);
		aliveBug.setColor(Color.CYAN);
		Bug eatenBug = new Bug();
        world.add(new Location(6, 5), eatenBug);
        eatenBug.setDirection(Location.EAST);
        
        HunterCritter hunter = new HunterCritter();
		world.add(new Location(5, 5), hunter);
		hunter.setColor(Color.GREEN);
		
		//A new red HunterCritter will spawn in a random adjacent location to the green HunterCritter
		
        world.show();

	}
	
}
