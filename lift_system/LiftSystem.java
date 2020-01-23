package lift_system;

public class LiftSystem 
{
	static int currentFloor;
	static int nlifts;
	static int mFloors;
	static int startingFloor;
	static int liftNumber;
	static int destinationFloor;
	public static void main(String[] args) 
	{
		// object of LiftMoveOperations class
		LiftMoveOperations ls = new LiftMoveOperations();

		// object of ValidateInput class
		ValidateInput li = new ValidateInput();
		
		nlifts = li.inialiseInputLift();
		mFloors = li.inialiseInputFloors();
		startingFloor = li.inialiseStartingFloor();
		liftNumber = li.inialiseNearLift();
		currentFloor = li.inialiseCurrentFloor();
		destinationFloor = li.inialiseDestinationFloor();
		
		// lift will open when current arrives at destination floor
		ls.MoveLift(currentFloor, destinationFloor);
		//ls.MoveLift(currentFloor);
	}
}
