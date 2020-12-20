/**
 * This program takes 10 numbers and sort them 
 * in ascending order using quick-sort algorithm.
 * 
 * Submitted to: Dr. Rushit Dave
 * Class: Algorithms
 * Author: Sarad Aryal
 * Date: November 1st, 2020
 */
import java.util.Scanner;
/**
 * @author Sarad Aryal
 */
public class quick_sort {
	
	private static Scanner input;
	/**
	 * this is the main method that prompts user
	 * to enter 10 numbers that is to be sorted.
	 * Then it stores in an array then it calls
	 * another method to sort the array of numbers.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		//Getting user input 
		input = new Scanner(System.in);
		int [] array=  new int [num];
				System.out.println("Please enter ten numbers to be sorted using quick sort:");
		//saving the user input in an array
		for ( int i = 0; i < num; i++) {
			array[i] = input.nextInt();
		}
		//prints the user entered numbers
		System.out.println("\n The user entered number that is to be sorted using quick sort is:");
        printArray(array);
		//calling quick_sort with the array of list entered by the user
		quick_sort qs = new quick_sort();
        qs.sort(array, 0, num -1);
        //prints the final sorted array
        System.out.println("\n The final sorted array using quick sort is:");
        printArray(array);
    }
	
	/**
	 * This method takes the array and lower and higher value from the array 
	 * and calls the helper method i.e. partition to find the pivot and then 
	 * recursively do the same thing until every number is sorted in correct 
	 * order.
	 * 
	 * @param array
	 * @param low
	 * @param high
	 */
	void sort(int [] array, int low, int high) { 
  		
        if (low < high) { 
            // pp is the partition point for the array. 
            int pp = partition(array, low, high); 
            // recursively sort elements before and 
            // after sorting.
            System.out.println("\n The next step for quick sort is:");
            printArray(array);
            sort(array, low, pp-1); 
            sort(array, pp+1, high); 
           
        } 
    } 
	/**
	 * helper method for sort which calculates the pivot point 
	 * for the given partition. 
	 * @param array
	 * 
	 * @param low
	 * @param high
	 * @return the new pivot point for the partition of the array.
	 */
	int partition(int[] array, int low, int high) { 
	
		int l = (low-1);
		int pivot = array[high];  
        for (int k=low; k<high; k++) { 
           //checks if the current element is smaller than the pivot.
            if (array[k] < pivot){ 
                l++; 
                // swap array [k] and array [l]
                int temp = array[l]; 
                array[l] = array[k]; 
                array[k] = temp; 
            } 
        } 
        // we are swapping array[l+1] and the pivot i.e. array[high]
        int temp = array[l+1]; 
        array[l+1] = array[high]; 
        array[high] = temp; 
  
        return l+1; 
    } 
  	
  	/**
  	 * method to print the array 
  	 * 
  	 * @param array
  	 */
  	static void printArray(int array []) {
  		
  		for(int i =0; i< array.length;++i){
            System.out.print(array[i]+ " ");
        }
  	}
}

