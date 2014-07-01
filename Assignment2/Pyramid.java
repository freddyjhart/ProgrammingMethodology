/*
 * File: Pyramid.java

 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	int windowHeight = BRICK_HEIGHT * BRICKS_IN_BASE + 10;
	int windowWidth = BRICK_WIDTH * BRICKS_IN_BASE + 1;
	
	public void run() {
		
		setSize(windowWidth, windowHeight);
		setBricksOnBase();
		
	}
	
	public void setBricksOnBase()
	{
		int i = 0;
		int amountOfBricksInRow = 0;
		
		while(i < BRICKS_IN_BASE+1)
		{
			GRect rect1 = new GRect(BRICK_WIDTH, BRICK_HEIGHT);
			rect1.setLocation((windowWidth/2)-(((BRICKS_IN_BASE/2) * BRICK_WIDTH)), windowHeight-(BRICK_HEIGHT));
			add(rect1);
			i++;
			
			
		}
	}
	
}

