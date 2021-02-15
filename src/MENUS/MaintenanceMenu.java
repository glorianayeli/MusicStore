package MENUS;
import java.sql.SQLException;
import java.util.Scanner;

import music2.SALESRETURNS;

public class MaintenanceMenu {
	
	public static void MaintenanceSubMenu() throws SQLException{
		Scanner input = new Scanner(System.in);
		int MAN = 0;
        System.out.println("Great! You chose the option Maintenance\nChoose one option by its number:\n"
        		+ "	-1 Add/modify/drop outlet\n"
        		+ "	-2 Add/modify/drop employee\n"
        		+ "	-3 Add/modify/drop customer\n"
        		+ "	-4 Add/modify/drop product\n"
        		+ "	-5 Process returns\n"
        		+ "	-6 Quit");
        try {
            
        	MAN = input.nextInt();
        } catch (Exception e) {
            System.out.println("That's not a correct option\n Choose between option 1 and 6\nThanks");
            e.printStackTrace();
        }
        switch (MAN) {
		case 1:
			MaintenanceOutletMenu.MaintenanceOutletSubMenu();
			break;
		case 2:
			MaintenanceEmployeeMenu.MaintenanceEmployeeSubMenu();
			break;
		case 3:
			MaintenanceCustomerMenu.MaintenanceCustomerSubMenu();
			break;
		case 4:
			MaintenanceProductMenu.MaintenanceProductSubMenu();
			break;
		case 5:
			System.out.println("Great! You chose the option Process returns");
			System.out.println("Great! You chose the option Process returns");
			System.out.println(" Input the date");
			String date = input.nextLine();
			System.out.println(" Input the customer ID");
			int cutId = input.nextInt();
			SALESRETURNS.viewReturns(date, cutId);
			break;
		case 6:
			System.out.println("See you!");
			break;
		}
	}
}
