package stuff;
import java.lang.Math;
import java.util.Scanner;
import java.io.PrintWriter;
public class Encrypter 
/*Get user number
 * Seperate number into the four digits by using the modulus operator
 * Encrypt each digit by adding 7 and then using modulus 10
 * swap digits two with four and one with three
 * Multiply digits 3 by 10, 2 by 100, 1 by 1000 then add them back together 
 * print encrypted number 
 * */
{
	Scanner input = new Scanner(System.in);
	private int encryptedNum = 0;
	private int digitOne = 0;
	private int digitTwo = 0;
	private int digitThree = 0;
	private int digitFour = 0;	
	
	public void encrypt ()
	{
	
	System.out.print("Enter the number to be encrypted");
	int userNum = input.nextInt();
    int permUserNum = userNum;
	digitFour = userNum % 10;
	userNum = permUserNum;
	digitThree = ((userNum % 100) - digitFour)/10;
	userNum = permUserNum;
	digitTwo = ((userNum % 1000) - (userNum % 100)) /100;
	userNum = permUserNum;
	digitOne = ((userNum % 10000) - (userNum % 1000)) /1000;
	userNum = permUserNum;
	
	
	digitFour = (digitFour + 7) % 10;
	digitThree = (digitThree + 7) % 10;
	digitTwo = (digitTwo + 7) % 10;
	digitOne = (digitOne + 7) % 10;
	
	permUserNum = digitFour;
	digitFour = digitTwo;
	digitTwo = permUserNum;
	permUserNum = digitThree;
	digitThree = digitOne;
	digitOne = permUserNum;

	
	digitThree *= 10;
	digitTwo *= 100;
	digitOne *= 1000;
	encryptedNum = digitFour + digitThree + digitTwo + digitOne;
	System.out.printf("Encrypted Number: %d", encryptedNum);
	
}
}