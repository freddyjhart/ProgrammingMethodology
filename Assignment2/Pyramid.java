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
	int windowHeight = BRICK_HEIGHT * BRICKS_IN_BASE + 30;
	int windowWidth = BRICK_WIDTH * (BRICKS_IN_BASE + 10);
	
	public void run() {
		
		setSize(windowWidth, windowHeight);
		int bricksInRow = BRICKS_IN_BASE;
		int rowNum = 1;
		
		while(bricksInRow > 0)
		{
			setBricks(bricksInRow, rowNum);
			bricksInRow--;
			rowNum++;
		}
	}
	
	public void setBricks(int bricksInBase, int rowNum)
	{
		int i = 0;
		
		while(i < bricksInBase)
		{
			GRect rect1 = new GRect(BRICK_WIDTH, BRICK_HEIGHT);
			rect1.setLocation((windowWidth/2)-(((bricksInBase/2) * BRICK_WIDTH)) + i * BRICK_WIDTH, windowHeight - BRICK_HEIGHT * rowNum);
			add(rect1);
			if (rowNum % 2 == 0)
			{
				rect1.move(-(BRICK_WIDTH/2), getY());
			}
			i++;
		}
		
		
	}
	
}

