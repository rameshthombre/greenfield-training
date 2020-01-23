package lift_system;

import java.util.Scanner;

public class ValidateInput 
{
	static int nLifts;
	static int mFloors;
	static int startingFloor;
	static int liftNumber;
	static int currentFloor;
	static int destinationFloor;
	Scanner in = new Scanner(System.in);
	public int inialiseInputLift()
	{
		
		System.out.println("Enter the number of lifts");
		nLifts = in.nextInt();
		if(nLifts < 0) 
		{
			System.out.println("Error: invlid input");
			inialiseInputLift();
		}
		return nLifts;
	}
	
	public int inialiseInputFloors()
	{
		System.out.println("Enter the number of floors");
		mFloors = in.nextInt();
		if(mFloors < 0)
		{
			System.out.println("Error: Please enter the floor between (0-9)");
			inialiseInputFloors();
		}
		return mFloors;
	}
	
	public int inialiseStartingFloor()
	{
		System.out.println("Enter the starting floor");
		startingFloor = in.nextInt();
		if(startingFloor < 0 )
		{
			System.out.println("Error: Please enter the floor between (0-9)");
			inialiseStartingFloor();
		}
		return startingFloor;
	}
	
	public int inialiseNearLift()
	{
		System.out.println("Enter the lift number you are near to");
		liftNumber = in.nextInt();
		if(liftNumber < 0)
		{
			System.out.println("Error: Please enter a valid lift number");
			inialiseNearLift();
		}
		return liftNumber;
	}
	
	public int inialiseCurrentFloor()
	{
		System.out.println("Enter the current floor you are at from (0-9) ");
		currentFloor = in.nextInt();
		if(currentFloor < 0)
		{
			System.out.println("Error! Floor must be between (0-9)");
			inialiseCurrentFloor();
		}
		return currentFloor;
	}
	
	public int inialiseDestinationFloor()
	{
		System.out.println("Enter the Destination floor from (0-9)");
		int destinationFloor = in.nextInt();
		if(destinationFloor < 0 && destinationFloor > mFloors)
		{
			System.out.println("Error! Floor must be between (0-9)");
			inialiseDestinationFloor();
		}
		return destinationFloor;
	}
}
