package lift_system;

public class LiftMoveOperations 
{
	public static int time=0;
	public static boolean openState=false;
	static void MoveLift(int currentFloor, int destinationFloor) 
	{
		if(destinationFloor  == currentFloor)
		{
			System.out.println("You are on the same floor");
			openState = false;
		}else if(destinationFloor > currentFloor)
		{
			liftUp(currentFloor, destinationFloor);
		}else
		{
			liftDown(currentFloor, destinationFloor);
		}
	}
	private static void liftUp(int currentFloor, int destinationFloor) 
	{
		System.out.println("Lift is going up...");
		while(currentFloor <= destinationFloor)
		{
			currentFloor++;
			time++;
			System.out.println("current floor----> "+currentFloor);
			
		}
		System.out.println("Arrived the at the destination floor in " + (++time) +" Units");
		System.out.println("Exit from");
		openState=false;
	}
	
	private static void liftDown(int currentFloor, int destinationFloor) 
	{
		System.out.println("Lift is going down...");
		while(currentFloor >= destinationFloor)
		{
			currentFloor--;
			time++;
			System.out.println("current floor----> "+currentFloor);
		}
		System.out.println("Arrived the at the destination floor" + (++time) +" Units");
		System.out.println("Exit from");
		openState=false;
	}
}
