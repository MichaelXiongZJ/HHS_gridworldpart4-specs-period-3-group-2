package Tester5;




import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.critters.HunterCritter;
import info.gridworld.grid.Location;


//A bug right in front of the hunter, another 3 bugs in the grid that is outside of its detection range.
//The hunter should eats the bug in front and terrifies the other bugs
public class Tester5 {
	 public static void main(String[] args) {
	        ActorWorld world = new ActorWorld();
	        world.add(new Location(5, 5), new HunterCritter());
	        world.add(new Location(4, 5), new Bug());
	        
	        world.add(new Location(9, 9), new Bug());
	        world.add(new Location(1, 1), new Bug());
	        world.add(new Location(5, 8), new Bug());
	        
	        world.show();
	 }
}
