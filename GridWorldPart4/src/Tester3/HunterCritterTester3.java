package Tester3;

import java.awt.Color;

import info.gridworld.actor.ActorWorld;
import info.gridworld.critters.HunterCritter;
import info.gridworld.grid.Location;

public class HunterCritterTester3 {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();

		HunterCritter hunter = new HunterCritter();
		world.add(new Location(5, 5), hunter);
		hunter.setColor(Color.GREEN);
		//HunterCritter moves to a random adjacent location, like a Critter would
        world.show();

	}

}
