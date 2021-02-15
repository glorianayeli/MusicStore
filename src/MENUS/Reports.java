package MENUS;
import java.util.Scanner;

public class Reports {
	
	public static void ReportsMenu(){
		Scanner input = new Scanner(System.in);
		int R = 0;
    	
        System.out.println("Great! You chose the option Reports\nChoose one option by its number:\n"
        		+ "	-1 Yearly sales report\n"
        		+ "	-2 Sales report\n"
        		+ "	-3 Top 10 selling items\n"
        		+ "	-4 Quit");
        try {
            R = input.nextInt();
        } catch (Exception e) {
            System.out.println("That's not a correct option\n Choose between option 1 and 4\nThanks");
            e.printStackTrace();
        }
        switch (R) {
		case 1:
			System.out.println("Great! You chose the option Yearly sales report for outlet");
			break;
		case 2:
			System.out.println("Great! You chose the option Sales report for employee");
			break;
		case 3:
			System.out.println("Great! You chose the option Top 10 selling items");
			break;
		case 4:
			System.out.println("See you!");
			break;
		}
        
     
	}

}
