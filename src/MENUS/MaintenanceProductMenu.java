package MENUS;
import java.sql.SQLException;
import java.util.Scanner;

import STORES.PRODUCT;
import music2.Maintenance;

public class MaintenanceProductMenu {
	
	public static void MaintenanceProductSubMenu() throws SQLException{
		Scanner input = new Scanner(System.in);
		
		int AMDP = 0;
        System.out.println("Great! You chose the option Add/modify/drop Product\nChoose one option by its number:\n"
        		+ "	-1 Add a Product\n"
        		+ "	-2 Modify a Product\n"
        		+ "	-3 Drop a Product");
        try {
        	AMDP = input.nextInt();
        } catch (Exception e) {
            System.out.println("That's not a correct option\n Choose between option 1 and 3\nThanks");
            e.printStackTrace();
        }
        switch (AMDP) {
		case 1:
			System.out.println("You chose the option to Add a product");
			System.out.println("Enter the artist");
			String artist = input.nextLine();
			System.out.println("Enter the title");
			String title = input.nextLine();
			System.out.println("Enter the cost");
			float cost = input.nextFloat();
			System.out.println("Enter the public cost");
			float public_cost = input.nextFloat();
			
			Maintenance.addProduct(artist, title, cost, public_cost);
			break;
		case 2:
			System.out.println("You chose the option to Modify a product");
			System.out.println("Enter the number product");
			int number = input.nextInt();
			System.out.println("Enter the artist");
			String artistU = input.nextLine();
			System.out.println("Enter the title");
			String titleU = input.nextLine();
			System.out.println("Enter the cost");
			float costU = input.nextFloat();
			System.out.println("Enter the public cost");
			float public_costU = input.nextFloat();
			
			PRODUCT product = new PRODUCT(number, artistU, titleU, costU, public_costU);
			Maintenance.updateProduct(product);
			break;
		case 3:
			System.out.println("You chose the option to Drop a product");
			System.out.println("Enter the number product");
			int number_product = input.nextInt();
			
			Maintenance.deleteProduct(number_product);
			
			break;
		}
	}

}
