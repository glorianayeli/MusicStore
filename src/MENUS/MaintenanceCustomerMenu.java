package MENUS;
import java.sql.SQLException;
import java.util.Scanner;

import STORES.CUSTOMER;
import music2.Maintenance;
public class MaintenanceCustomerMenu {
	
	public static void MaintenanceCustomerSubMenu() throws SQLException{
		Scanner input = new Scanner(System.in);
		
		int AMDC = 0;
        System.out.println("Great! You chose the option Add/modify/drop customer\nChoose one option by its number:\n"
        		+ "	-1 Add a Customer\n"
        		+ "	-2 Modify a Customer\n"
        		+ "	-3 Drop a Customer");
        try {
        	AMDC = input.nextInt();
        } catch (Exception e) {
            System.out.println("That's not a correct option\n Choose between option 1 and 3\nThanks");
            e.printStackTrace();
        }
        switch (AMDC) {
		case 1:
			System.out.println("You chose the option to Add a customer");
			System.out.println("Enter the name");
			String name = input.nextLine();
			System.out.println("Enter address");
			String address = input.nextLine();
			System.out.println("Enter city");
			String city = input.nextLine();
			System.out.println("Enter state");
			String state = input.nextLine();
			System.out.println("Enter zip");
			int zip = input.nextInt();
			System.out.println("Enter phone");
			String phone = input.nextLine();
			Maintenance.addCustomer(name, address, city, state, zip, phone);
			break;
		case 2:
			System.out.println("You chose the option to Modify a customer");
			System.out.println("Enter the customer number");
			int number = input.nextInt();
			System.out.println("Enter the name");
			String nameU = input.nextLine();
			System.out.println("Enter address");
			String addressU = input.nextLine();
			System.out.println("Enter city");
			String cityU = input.nextLine();
			System.out.println("Enter state");
			String stateU = input.nextLine();
			System.out.println("Enter zip");
			int zipU = input.nextInt();
			System.out.println("Enter phone");
			String phoneU = input.nextLine();
			CUSTOMER customer = new CUSTOMER(number,nameU,addressU,cityU,stateU,zipU,phoneU);
			Maintenance.updateCUSTOMER(customer);
			break;
		case 3:
			System.out.println("You chose the option to Drop a customer");
			System.out.println("Enter the id");
			int id = input.nextInt();
			Maintenance.deleteCustomer(id);
			break;
		}
	}

}
