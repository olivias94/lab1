package Lab1Projecct.Olivia_Abdullah.Package;

import java.util.Scanner;


public class CMain{

	public static void main(String[] args) {
		// Test
		// Second Test for Repository Clone
		// another test comment
		Scanner x = new Scanner(System.in);
		System.out.println("How many years you intednt to work?");
		double years_of_work = x.nextInt();	
		
		System.out.println("Expected Average return on investment (0%-20%): ");
		double ave_exp_return = x.nextInt();	
		
		
		System.out.println("How long you intend to draw? ");
		double years_of_draw = x.nextInt();	
		
		
		System.out.println("Expected Annual return when in payback mode (0%-3%): ");
		double payback_return = x.nextInt();
		
		
		System.out.println("Required Income: ");
		double income = x.nextInt();
		
		
		System.out.println("Expected SSI income: ");
		double SSI = x.nextInt();	
	
		
		
		double return_average = ((income-SSI)*((1- Math.pow(1+((payback_return/100)/12), -(years_of_draw*12)))/((payback_return/100)/12)));
		
		String ave = String.format("%.2f", return_average);
		
		double monthly_save= return_average/ (((Math.pow(1+(((ave_exp_return/100)/12)), (years_of_work*12))-1)/((ave_exp_return/100)/12))); 
	
		
		String mothlysaving = String.format("%.2f", monthly_save);

		System.out.println("You will have to save: " + mothlysaving + " Dollars each month \nThe amount need to be saved is " + ave + " Dollars");
	}
}



