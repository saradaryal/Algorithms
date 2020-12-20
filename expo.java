import java.util.Scanner;
/**
 * This Java Programs prompts the user to input two integer 
 * and calculates the power of the first to the second.
 * @author Sarad Aryal
 *
 */
public class expo {
	private static Scanner input;
	/**
	 * This is the main method. In this method the programs ask the 
	 * user to input x and y and calls power method to calculate the 
	 * power of the two numbers. Lastly after getting the value from 
	 * pow method, it prints out the answer.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Getting user input 
		input = new Scanner(System.in);
		//print user a message
		System.out.println("Please enter the value of x (in x^n): ");
		//saving the first input
		int x = input.nextInt();
		
		//print user a message
		System.out.println("Please enter the value of n (in x^n): ");
		//store the second input
		int y = input.nextInt();
		//call power method and save the return vale in pow.
		int pow = power(x,y);
		//print out the value of the power
		System.out.println(x +  " to the power of " + y + " is: " + pow);
	}
	/**
	 * This method takes two integer entered by the user as input and calcualtes
	 * the power of those two number.
	 * @param x
	 * @param y
	 * @return power
	 */
	private static int power(int x, int y) {
		// TODO Auto-generated method stub
		//for even y
		int a = y/2;
		//fir idd y
		int b = (y-1)/2;
		if (y % 2 == 0) { //if y is even 
			return ((int) Math.pow(x, a)*(int) Math.pow(x, a));
		}else //if y is odd
			return (x* ((int) Math.pow(x, b) * (int) Math.pow(x, b)));
	}

}
