/**
 * This is a dynamic program written in Java to calculate the longest increasing 
 * subsequence in a sequence of number
 * @author Sarad Aryal
 *
 */
public class long_inc_subsequence {
	/**
	 * This is the main method which declares the array that is to be worked with, 
	 * calculates its length and calls another method to calculate the Longest 
	 * increasing subsequence with the array and its length.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {3, 10, 2, 1, 20, 30, 4, 33, 54, 6, 7, 8, 90, 9, 11, 13};
		int m = array.length;
		System.out.println("The Longest increasing subsequence from the given sequence of number is: " + size (array, m));
		}
	/**
	 * this method takes in an array and its size as input and calculates the longest increassing 
	 * subsequence in that array. 
	 * @param array
	 * @param n
	 * @return
	 */
	static int size (int[] array, int n ) {
	//create a new array of size n 
	int size [] = new int [n];
	//initialize the array to 1
	for (int i = 0; i< n; i++) {
		size[i] = 1;
	}
	//calculating longest increasing subsequence value in the beginning 
	//at the end of the array
	for ( int i = 1; i < n; i++ ) 
        for ( int j = 0; j < i; j++ )  
                   if ( array[i] > array[j] && size[i] < size[j] + 1) 
                	   size[i] = size[j] + 1; 
	//create a variable max to store the maximum value
	int max =0;
	//save the maximum of all the values in max
	for (int i = 0; i < n; i++ ) 
        if ( max < size[i] ) 
           max = size[i]; 
	// return max value 
      return max; 
	}
}

