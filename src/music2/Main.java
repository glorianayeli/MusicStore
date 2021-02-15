package music2;
import java.sql.SQLException;
import java.util.Scanner;
import MENUS.MaintenanceMenu;
import MENUS.Reports;
import MENUS.SalesNReturn;


public class Main {
	

	public static void main(String[] args) throws SQLException {
		Scanner input = new Scanner(System.in);
		int option = 0;
		
		System.out.println("Hi! Welcome to The Music Store\nWhat would you like to do?\nSelect an option writing the number of the option:\n"
				+ "	-1 Sale/Return processing\n	-2 Outlet/Employee/Customer/Product maintenance\n	-3 Reports\n	-4 Quit");
		
		try {
            option = input.nextInt();
        } catch (Exception e) {
            System.out.println("That's not a correct option\n Choose between option 1 and 4\nThanks");
            e.printStackTrace();
        }
		
		switch (option){
        case 1:
        	SalesNReturn.SalesNReturnMenu();
        	   break;
        case 2:
        	MaintenanceMenu.MaintenanceSubMenu();
            break;
        case 3:
            Reports.ReportsMenu();
            break;
        case 4:
            System.out.println("Thank you, see you soon!\n");
            break;
            }	
	}
				
}





