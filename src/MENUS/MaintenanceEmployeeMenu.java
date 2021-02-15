package MENUS;
import java.sql.SQLException;
import java.util.Scanner;

import STORES.EMPLOYEE;
import music2.Maintenance;

public class MaintenanceEmployeeMenu {
	
	public static void MaintenanceEmployeeSubMenu() throws SQLException{
		Scanner input = new Scanner(System.in);
		
		int AMDE = 0;
        System.out.println("Great! You chose the option Add/modify/drop employee\nChoose one option by its number:\n"
        		+ "	-1 Add an Employee\n"
        		+ "	-2 Modify an Employee\n"
        		+ "	-3 Drop an Employee");
        try {
        	AMDE = input.nextInt();
        } catch (Exception e) {
            System.out.println("That's not a correct option\n Choose between option 1 and 3\nThanks");
            e.printStackTrace();
        }
        switch (AMDE) {
		case 1:
			System.out.println("You chose the option to Add an employee");
			System.out.println("Enter the emp_name");
			String emp_name = input.nextLine();
			System.out.println("Enter the outlet key");
			int fk_outlet = input.nextInt();
			Maintenance.addEmployee(emp_name, fk_outlet);
			break;
		case 2:
			System.out.println("You chose the option to Modify an employee");
			System.out.println("Enter the employee number");
			int emp_numberU = input.nextInt();
			System.out.println("Enter the emp_name");
			String emp_nameU = input.nextLine();
			System.out.println("Enter the outlet number");
			int number_outlet = input.nextInt();
			EMPLOYEE employ = new EMPLOYEE(emp_numberU, emp_nameU, number_outlet);
			Maintenance.updateEmployee(employ);
			break;
		case 3:
			System.out.println("You chose the option to Drop an employee");
			System.out.println("Enter the emp_name");
			int emp_number = input.nextInt();
			Maintenance.deleteCustomer(emp_number);
			break;
		}
	}

}
