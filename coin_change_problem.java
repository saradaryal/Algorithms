import java.util.Scanner;
import java.util.Vector;
/**
 * This program takes an input of decimal numbers and figures 
 * out the minimum number of coins required to reach that decimal 
 * value. 
 * @author Sarad Aryal
 *
 */
public class coin_change_problem {
	private static Scanner input;
	/**
	 * This is a recursive method which takes an array of double, 
	 * integer value and a double value checks if the double value is 
	 * greater than or equal to the coin at an index i, if it is then subtract 
	 * the coin from the double value and add the value subtracted to the vector
	 * as the final result.
	 * @param coins
	 * @param m
	 * @param V
	 */
	 	static void min_Coins(double coins[], int m, double V) { 
	 		//initialize vector for final output
	 	Vector<Double> requirement = new Vector<>();
	 	//recursive loop 
		for (int i = m-1 ; i >= 0; i--) {
			//this is executed only when the value entered by the user
			//is greater than or equal to the value of teh coin.
			while (V >= coins[i]) {
				//subtract the value of coin from the value 
			V = V - coins[i];
			//add the element to the vector
			requirement.add(coins[i]);
			}
		}	
		//call the print method
		print(requirement);
	}
	/**
	 * This method takes the vector of double values and prints out the vector.
	 * This also print out the minimum number of coins required. 	
	 * @param requirement
	 */
 static void print(Vector<Double> requirement) {
	 // Print result  
	 System.out.println("Minimum coins required are ");
     for (int i = 0; i < requirement.size(); i++) { 
         System.out.print(requirement.elementAt(i) + " "); 
     } 
     System.out.println();
     System.out.println("The minimum number of required coins are: " + requirement.size());
	}
	
 /**
  * This is the main method. This declares the denomination of the coin.
  * Then it creates an scanner object to get user input. Then calls teh min_Coin method 
  * to find the minimum amount of required coin for the change. This is where the program 
  * starts when executed. 
  * @param args
  */
	public static void main(String args[]) {
		//create an array with the denomination stored in it.
		double[] denomination = { 0.01, 0.05, 0.10, 0.25, 0.50, 1};
		// find the length of the array
		int m = denomination.length;
		//create a scanner object
		input = new Scanner(System.in);
		//prompt the user to input change amount
		System.out.println("Enter the change amount: ");
		//Store the user input 
		double k = input.nextDouble();
		//call the min_coins method. 
	   min_Coins(denomination, m, k); 
	} 
}

