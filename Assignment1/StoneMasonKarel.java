/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run()
	{
		checkRow();
	}
	private void checkRow()
	{
		if(noBeepersPresent())
		{
			move();
		}
		else
		{
			checkColumn();
		}
	}
	
	private void checkColumn()
	{
		if(facingEast())
		{
			turnLeft();
			if (noBeepersPresent())
			{
				putBeeper();
				if(frontIsClear())
				{
					move();
				}
			}
			else
			{
				if (frontIsClear())
				{
					move();
				}
				else
				{
					
				}
			}
		}
		else if(facingNorth())
		{
			
		}
		else if (facingWest())
		{
			turnRight();
		}
		else
		{
			turnAround();
		}
	}
}
