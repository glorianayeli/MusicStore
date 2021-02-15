package MENUS;
import java.sql.SQLException;
import java.util.Scanner;

import STORES.OUTLET;
import music2.Maintenance;

public class MaintenanceOutletMenu {
	
	public static void MaintenanceOutletSubMenu() throws SQLException{
		Scanner input = new Scanner(System.in);
		
		int AMDO = 0;
        System.out.println("Great! You chose the option Add/modify/drop outlet\nChoose one option by its number:\n"
        		+ "	-1 Add an Outlet\n"
        		+ "	-2 Modify an Outlet\n"
        		+ "	-3 Drop an Outlet");
        try {
        	AMDO = input.nextInt();
        } catch (Exception e) {
            System.out.println("That's not a correct option\n Choose between option 1 and 3\nThanks");
            e.printStackTrace();
        }
        switch (AMDO) {
		case 1:
			System.out.println("You chose the option to Add an outlet");
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
			Maintenance.addOutlet(address, city, state, zip, phone);
			
			break;
		case 2:
			System.out.println("You chose the option to Modify an outlet");
			System.out.println("Enter outlet number");
			int numberU = input.nextInt();
			System.out.println("Enter address");
			String addressu = input.nextLine();
			System.out.println("Enter city");
			String cityu = input.nextLine();
			System.out.println("Enter state");
			String stateu = input.nextLine();
			System.out.println("Enter zip");
			int zipu = input.nextInt();
			System.out.println("Enter phone");
			String phoneu = input.nextLine();
			
			OUTLET outlet = new OUTLET(numberU, addressu, cityu, stateu, zipu, phoneu);
			Maintenance.updateOutlet(outlet);
			break;
		case 3:
			System.out.println("You chose the option to Drop an outlet");
			
			System.out.println("Enter outlet number");
			int numberO = input.nextInt();
			Maintenance.deleteOutlet(numberO);
			break;
		}
	}
}
