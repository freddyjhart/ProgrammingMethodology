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
import java.awt.event.KeyEvent;

public class Truck extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public static final int WINDOW_WIDTH = 800;
	public static final int WINDOW_HEIGHT = 600;
	public static final int REFRESH = 5; 
	public static String direction = "stop";
	
	public void run() 
	{
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		addKeyListeners();
		
		GCompound truck = new GCompound();
		
		GOval oval1 = new GOval(0, 40, 50, 50);	
		GOval oval2 = new GOval(50, 40, 50, 50);
		GRect rect1 = new GRect(10, 0, 80, 40);
		oval2.setFilled(true);
		oval1.setFilled(true);
		rect1.setFilled(true);
		oval2.setFillColor(Color.BLUE);
		oval1.setFillColor(Color.BLUE);
		rect1.setFillColor(Color.GREEN);
		truck.add(oval1);
		truck.add(oval2);
		truck.add(rect1);
		truck.setLocation(WINDOW_WIDTH/2,WINDOW_HEIGHT/2);
		
		
		add(truck);
		
		while(true)
		{
			
				if(direction.equals("up"))
				{
					truck.setLocation(truck.getLocation().getX(), truck.getLocation().getY() - 1);
				}
				else if(direction.equals("down"))
				{
					truck.setLocation(truck.getLocation().getX(), truck.getLocation().getY() + 1);
				}
				else if(direction.equals("left"))
				{
					truck.setLocation(truck.getLocation().getX() - 1, truck.getLocation().getY());
				}
				else if(direction.equals("right"))
				{
					truck.setLocation(truck.getLocation().getX() + 1, truck.getLocation().getY());
				}
			
				pause(REFRESH);
				
				if(truck.getLocation().getY() > WINDOW_HEIGHT)
				{
					truck.setLocation(truck.getLocation().getX(), 0 - truck.getHeight());
				}
				
				if(truck.getLocation().getY() < 0 - truck.getHeight())
				{
					truck.setLocation(truck.getLocation().getX(), WINDOW_HEIGHT);
				}
				
				if(truck.getLocation().getX() > WINDOW_WIDTH)
				{
					truck.setLocation(0 - truck.getWidth(), truck.getLocation().getY());
				}
				
				if(truck.getLocation().getX() < 0 - truck.getWidth())
				{	
					truck.setLocation(WINDOW_WIDTH, truck.getLocation().getY());
				}
			
		}
		
	}
	
	public void keyPressed(KeyEvent e)
	{
		switch(e.getKeyCode())
		{
		case KeyEvent.VK_UP: 
			direction= "up"; break;
		case KeyEvent.VK_DOWN:
			direction= "down"; break;
		case KeyEvent.VK_LEFT:
			direction= "left"; break;
		case KeyEvent.VK_RIGHT:
			direction= "right"; break;
		case KeyEvent.VK_SPACE:
			direction= "stop"; break;
		}
	}
}

