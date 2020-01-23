package medicine_app;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;
public class Medicine
{
	public static int id;
	public static String medicineName;
	public static String companyName;
	public static int price;
	public static String manu_date;
	public static String exp_date;
	public static PreparedStatement ps=null;
	public static ResultSet rs=null;
	public static Connection con =null;
	public static final String dbUrl = "jdbc:mysql://localhost:3306/java_gf";
	public static final String username="root";
	public static final String password="";

	public void addMedicine() throws ClassNotFoundException 
	{
		Scanner in =new Scanner(System.in);
		System.out.println("enter the Medicine ID");
		id = in.nextInt();
		in.nextLine();
		
		System.out.println("enter the Medicine Name");
		medicineName = in.nextLine();
		
		System.out.println("enter the Medicine company Name");
		companyName = in.nextLine();
		
		System.out.println("enter the Medicine Price");
		price = in.nextInt();
		in.nextLine();
		
		System.out.println("enter the Medicine manufacturing date");
		manu_date = in.nextLine();
		
		System.out.println("enter the Medicine expiry date");
		exp_date = in.nextLine();
		
		Class.forName("com.mysql.jdbc.Driver");
		try
		{
			con = DriverManager.getConnection(dbUrl,username,password);
			String sqlQuery = "insert into medicine() values(?,?,?,?,?,?)";
			ps = con.prepareStatement(sqlQuery);
			ps.setInt(1, id);
			ps.setString(2, medicineName);
			ps.setString(3, companyName);
			ps.setInt(4, price);
			ps.setString(5, manu_date);
			ps.setString(6, exp_date);
			ps.executeUpdate();
			System.out.println("Added successfully!!!");
		}catch (Exception e) 
		{
			System.out.println(e);
			System.out.println("Error in connecting Database");
		}
	}
	public void displayMedicineDetails() 
	{
		HashMap<Integer,Medicine> med = new HashMap<Integer,Medicine>();
		try
		{
			con = DriverManager.getConnection(dbUrl,username,password);
			String sqlQuery = "select * from medicine";
			ps = con.prepareStatement(sqlQuery);
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				int id = rs.getInt(1);
				String medicineName = rs.getString(2);
				String companyName = rs.getString(3);
				int price = rs.getInt(4);
				String manu_date = rs.getString(5);
				String exp_date = rs.getString(6);
				System.out.println();
				System.out.println("*****Medicine Details*****");
				System.out.println("Id --->" + id + "\n" 
									+ "Medicine Name --->" + medicineName + "\n" 
									+ "Medicine company Name --->" + companyName + "\n" 
									+ "Medicine price --->" + price + "\n" 
									+ "Medicine  manufacturing date --->" + manu_date + "\n" 
									+ "Medicine  expiry date --->" + exp_date );
				
				System.out.println("****************************");
				System.out.println();
				
			}
			
		}catch (Exception e) {
			System.out.println(e);
			System.out.println("Error in connecting Database");
		}
	}
	
	public void updateMedicine() {
		System.out.println("Details Update");
		System.out.println();
	}

	public void deleteMedicine() {
		System.out.println("Details deleted");
		System.out.println();
	}

	
	
}