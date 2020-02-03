package stuff2;
import java.util.Scanner;
import java.lang.Math;
/*Take user weight and height input
 * Let user choose whether to use metric or customary formula
 * calculate and print bmi using formula 
 * Display bmi categories so the user can compare
 */
public class BMIcalculator {
	double weight = 0.0;
	double height = 0.0;
	int userChoice = 0;
	double bmi;
	public static void main(String[]args)
	{
		BMIcalculator bmi = new BMIcalculator();
		bmi.readUserData();
		bmi.calculateBmi();
		bmi.displayBmi();
	}
	public void readUserData()
	{
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your weight and then height");
		weight = input.nextDouble();
		height = input.nextDouble();
		System.out.println(weight);
		System.out.println(height);
		System.out.println("[1] Calculate in pounds and inches\n[2] Calculate in kilograms and meters");
		userChoice = input.nextInt();
	}
	public void calculateBmi()
	{
		if(userChoice == 1)
		{
			weight = 703.0 * weight;
			height = height * height;
			bmi = weight / height;
			System.out.println(bmi);
		}
		if(userChoice == 2)
		{
			height = height * height;
			bmi = weight / height;
			System.out.printf("%0.2f",bmi);
		}
	}
	public void displayBmi()
	{

		System.out.println("Underweight	= <18.5");
		System.out.println("Normal weight	= 18.5 - 24.9");
		System.out.println("Overweight	= 25-29.9");
		System.out.println("Obese	= >30");
	}
			
	}

