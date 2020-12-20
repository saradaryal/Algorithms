import java.util.Scanner;
public class merge_sort {
	private static Scanner input;
	public static void main(String[] args) {
		int num = 10;
		//Getting user input 
				input = new Scanner(System.in);
				int[] array =  new int [num];
						System.out.println("Please enter ten numbers to be sorted using merge sort:");
				//saving the user input in an array
				for ( int i = 0; i <= num-1; i++) {
					array[i] = input.nextInt();
				}
				//print the user entered array that is to be sorted
				System.out.println("User entered list of numbers to be sorted using merge sort is: ");
				printArray(array, num);
				mergeSort(array, array.length);
				System.out.println("The sorted list of numbers using merge sort algorithms is :");
				printArray(array,num);
	}

	static void mergeSort(int [] array, int arrayLength) {
		int midPoint = arrayLength/2;
		int [] leftArray = new int[midPoint];
		int [] rightArray = new int [arrayLength - midPoint];
		//spliting arrays into two 
		int a = 0;
		for (int i = 0; i <= arrayLength-1; i++) {
			if (i < midPoint) {
				leftArray[i] = array[i];		
			}
			else {
				rightArray [a] = array[i];
				 a = a + 1;
			}
		}
		//printing each and every split 
		//left split
		printArray(leftArray, midPoint);
		int k = arrayLength - midPoint;
		//right split
		printArray(rightArray, k);
		//Now recursively calling this fucntion to split the array further down 
		mergeSort(leftArray, midPoint);
		mergeSort(rightArray, arrayLength-midPoint);
	 //merging the array at the end 
		merge(leftArray, rightArray, array, midPoint, arrayLength-midPoint);
	}
	
	
	static void merge(int[] leftArray,int[] rightArray, int[] array,int size1, int size2){
		 int i = 0 , l= 0, r =0;
	      while(l < size1 && r < size2){
	          
	          if(leftArray[l] < rightArray[r]){
	              array[i++] = leftArray[l++];
	          }
	          else{
	              array[i++] = rightArray[r++];
	          }
	      }
	      while(l < size1){
	          array[i++] = leftArray[l++];
	      }
	      while( r < size2){
	        array[i++] = rightArray[r++];
	      }
	}
	
	//A method to print the array 
		static void printArray(int [] arr, int size) { 
	        for (int i = 0; i <= size-1; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	    } 
}
