package medicine_app;
import java.util.HashMap;
import java.util.Scanner;
public class MainApp {
		static int number;
		public static void main(String[] args) throws ClassNotFoundException
		{
			Medicine m = new Medicine();
			HashMap<Integer, Medicine> medicine = new HashMap<Integer, Medicine>();
			
			do
			{
				Scanner in = new Scanner(System.in);
				
				System.out.println("Press 1. To Add A Medicine");
				System.out.println("Press 2. To Display medicine details");
				System.out.println("Press 3. To Update  A medicine");
				System.out.println("Press 4. To Delete A Medicine");
				System.out.println("Press 5. To Exit ");
				
				System.out.print("ENTER YOUR CHOICE!! -->");
				number = in.nextInt();
				
				switch(number)
				{
					case 1:
						m.addMedicine();
						break;
					case 2:
						m.displayMedicineDetails();
						break;
					case 3:
						m.updateMedicine();
						break;
					case 4:
						m.deleteMedicine();
						break;
					case 5:
						System.exit(0);
						break;
					default:
						System.out.println("invalid input choice");
				}
			}while(number > 0);
			
		}
}


