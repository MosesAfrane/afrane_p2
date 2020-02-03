package stuff;
import java.lang.Math;
import java.util.Scanner;
import java.io.PrintWriter;
/*Get user number
 * Seperate number into the four digits by using the modulus operator
 * Derypt each digit by adding 3 and then using modulus 10
 * swap digits two with four and one with three
 * Multiply digits 3 by 10, 2 by 100, 1 by 1000 then add them back together 
 * print decrypted number 
 * */
public class Decrypter {

	{
		Scanner input = new Scanner(System.in);
		 int decryptedNum = 0;
		 int digitOne = 0;
		 int digitTwo = 0;
		 int digitThree = 0;
		 int digitFour = 0;	
		 int permUserNum = 0;
		 System.out.print("Enter the number to be decrypted");
		 int userNum = input.nextInt();
		 permUserNum = userNum;
		 digitFour = userNum % 10;
		   userNum = permUserNum;
			digitThree = ((userNum % 100) - digitFour)/10;
			userNum = permUserNum;
			digitTwo = ((userNum % 1000) - (userNum % 100)) /100;
			userNum = permUserNum;
			digitOne = ((userNum % 10000) - (userNum % 1000)) /1000;
			permUserNum = digitFour;
			digitFour = digitTwo;
			digitTwo = permUserNum;
			permUserNum = digitThree;
			digitThree = digitOne;
			digitOne = permUserNum;
			
			digitOne = (digitOne + 3) % 10;
			digitTwo = (digitTwo + 3) % 10;
			digitThree = (digitThree + 3) % 10;
			digitFour = (digitFour + 3) % 10;
			
			digitThree *= 10;
			digitTwo *= 100;
			digitOne *= 1000;
			decryptedNum = digitFour + digitThree + digitTwo + digitOne;
			System.out.printf("Encrypted Number: %d", decryptedNum);
			
		

	}
	
}
