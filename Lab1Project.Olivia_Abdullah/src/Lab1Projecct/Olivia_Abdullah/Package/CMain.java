package Lab1Projecct.Olivia_Abdullah.Package;
//Lab1, Olivia Smith and Abdullah Alsinaidi

import java.util.Scanner;


public class CMain{

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		//Input for the number of years the user is going to work
		System.out.println("How many years do you intend to work? ");
		double years_of_work = x.nextInt();	
		
		//Input for the user's expected average return on investment
		//This value must be between 0 and 20 percent
		System.out.println("Expected Average return on investment (0%-20%): ");
		double ave_exp_return = x.nextInt();	
		
		//Input for how many years the user is going to draw in retirement
		System.out.println("How many years do you intend to draw? ");
		double years_of_draw = x.nextInt();	
		
		//Input for the user's expected annual return when in payback mode
		//This value must be between 0 and 3 percent
		System.out.println("Expected Annual return when in payback mode (0%-3%): ");
		double payback_return = x.nextInt();
		
		//Input for the user's required income during retirement
		System.out.println("Required Income: ");
		double income = x.nextInt();
		
		//Input for the user's expected SSI
		//This value must be between 0 and 2642
		System.out.println("Expected Social Security income: ");
		double SSI = x.nextInt();	
	
		
		//Calculates the total amount of money the user needs to save in order to draw for the inputed number of years
		double return_average = ((income-SSI)*((1- Math.pow(1+((payback_return/100)/12), -(years_of_draw*12)))/((payback_return/100)/12)));
		
		//Formating return_average
		String ave = String.format("%.2f", return_average);
		
		//Calculates the amount of money the user needs to save each month
		double monthly_save = return_average/ (((Math.pow(1+(((ave_exp_return/100)/12)), (years_of_work*12))-1)/((ave_exp_return/100)/12))); 
	
		//Formating monthly_save
		String monthlysaving = String.format("%.2f", monthly_save);

		//Prints message to user
		System.out.println("You will have to save " + monthlysaving + " dollars each month. \nThe total amount you need to save is " + ave + " dollars.");
	}
}
