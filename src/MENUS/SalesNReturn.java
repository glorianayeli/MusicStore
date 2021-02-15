package MENUS;
import java.sql.SQLException;
import java.util.Scanner;
import music2.SALESRETURNS;
public class SalesNReturn {
	
	
	public static void SalesNReturnMenu() throws SQLException{
		Scanner input = new Scanner(System.in);
		int SR = 0;
    	
        System.out.println("Great! You chose the option Sales/Returns\nChoose one option by its number:\n"
        		+ "	-1 Process a sale\n"
        		+ "	-2 Process a return\n"
        		+ "	-3 View a sale\n"
        		+ "	-4 View a return\n"
        		+ "	-5 Quit");
        try {
            SR = input.nextInt();
        } catch (Exception e) {
            System.out.println("That's not a correct option\n Choose between option 1 and 5\nThanks");
            e.printStackTrace();
        }
        switch (SR) {
		case 1:
			System.out.println("Great! You chose the option Process a Sale");
			System.out.println(" Input the date");
			String SALE_DATE = input.nextLine(); 
			System.out.println(" Input the time");
			String SALE_TIME = input.nextLine(); 
			System.out.println(" Input the quantity");
			int quantity = input.nextInt();
			System.out.println(" Input the outlet number");
			int FK_OUTLET_NUMBER = input.nextInt();
			System.out.println(" Input the employee number");
			int FK_EMP_NUMBER = input.nextInt();
			System.out.println(" Input the customer ID");
			int FK_CUSTOMER_ID = input.nextInt();
			System.out.println(" Input the product code");
			int FK_PRODUCT_CODE = input.nextInt();
			SALESRETURNS.addSale(SALE_DATE, SALE_TIME, quantity, FK_OUTLET_NUMBER, FK_EMP_NUMBER, FK_CUSTOMER_ID, FK_PRODUCT_CODE);
			break;
		case 2:
			System.out.println("Great! You chose the option Process a Return");
			System.out.println(" Input the outlet number");
			int FK_OUTLET_NUMBER2 = input.nextInt();
			System.out.println(" Input the product code");
			int FK_PRODUCT_CODE2 = input.nextInt();
			System.out.println(" Input the customer ID");
			int FK_CUSTOMER_ID2 = input.nextInt();
			System.out.println(" Input the date");
			String RETURN_DATE2 = input.nextLine();
			System.out.println(" Input the time");
			String RETURN_TIME2 = input.nextLine();
			System.out.println(" Input the quantity");
			int quantity2 = input.nextInt();
			System.out.println(" Input the reason");
			String reason2 = input.nextLine();
			SALESRETURNS.addReturns(FK_OUTLET_NUMBER2, FK_PRODUCT_CODE2, FK_CUSTOMER_ID2, RETURN_DATE2, RETURN_TIME2, quantity2, reason2);
			break;
		case 3:
			System.out.println("Great! You chose the option View a Sale please wite a date and a customer ID");
			System.out.println(" Input the date");
			String date3 = input.nextLine();
			System.out.println(" Input the customer ID");
			int cutId3 = input.nextInt();
			SALESRETURNS.viewSale(date3, cutId3);
			break;
		case 4:
			System.out.println("Great! You chose the option View a Return please write a date and a customer ID");
			String date4 = input.nextLine();
			System.out.println(" Input the customer ID");
			int cutId4 = input.nextInt();
			SALESRETURNS.viewReturns(date4, cutId4);
			break;
		case 5:
			System.out.println("See you!");
			break;
		}
        
     
	}

}
