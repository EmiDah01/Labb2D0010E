package lab2;

import java.awt.Color;
import lab2.level.LevelGUI;
import lab2.level.Level;
import lab2.level.Room;

public class Driver {

	public void run() {
	
		Room r1 = new Room(150, 150, Color.red);
		Room r2 = new Room(150, 150, Color.green);
		Room r3 = new Room(150, 150, Color.cyan);
		Room r4 = new Room(150, 150, Color.orange);
		Room r5 = new Room(150, 150, Color.yellow);
		
		r1.connectEastTo(r2);
		r2.connectWestTo(r1);
		
		r3.connectNorthTo(r1);
		r1.connectSouthTo(r3);
		
		r3.connectSouthTo(r4);
		r4.connectNorthTo(r3);
		
		r5.connectWestTo(r2);
		r2.connectEastTo(r1);

    }

}
