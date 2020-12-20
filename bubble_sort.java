/* This program takes input of 10 numbers as input 
* and sorts using bubble sort algorithms and finally 
* displays the sorted result
* author : Sarad Aryal
*/

import java.util.Scanner;
public class bubble_sort {

	private static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare the number of integers
		int num = 10;
		//Getting user input 
		input = new Scanner(System.in);
		int[] array =  new int [num];
				System.out.println("Please enter ten numbers to be sorted using bubble sort:");
		//saving the user input in an array
		for ( int i = 0; i < num; i++) {
			array[i] = input.nextInt();
		}
		//print the user entered array that is to be sorted
		System.out.println("User entered list of numbers to be sorted using bubble sort is: ");
		printArray(array);
		
		//main sorting algorithms
		//compares the two consecutive elements recursively and swaps their
		//places if the first one is greater than the second one.
		//Keeps doing this until the entire list is sorted.
		for (int i = 0; i < (num -1); i++) { 
			for (int j = 0; j< num - i - 1; j++) {
				if (array[j] > array [j+1]) {
					int temp = array [j];
					array[j] = array [j+1];
					array[j+1] = temp;
				}
				System.out.println("\n next step of the bubble sorted algorithms is:");
				printArray(array);
			}
		}
		System.out.println("\n The final sorted list using bubble sort is:");
		printArray(array);
		}
	
	//A method to print the array 
	static void printArray(int []arr) 
    { 
        for (int i = 0; i < 10; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
}


