/* This program takes input of 10 numbers from the user 
* and using merge sorting algorithms sorts the numbers 
* and displays the sorted number 
* author: Sarad Aryal
*/
import java.util.Scanner;
class sorting {
private static Scanner input;
  public static void main( String args[] ) {
	// TODO Auto-generated method stub
	  int num = 10;
		//Getting user input 
		input = new Scanner(System.in);
		int array[] =  new int [num];
				System.out.println("Please enter ten numbers to be sorted using merge sort:");
		//saving the user input in an array
		for ( int i = 0; i < num; i++) {
			array[i] = input.nextInt();
		}
		//calling mergeSort with the array of list entered by the user
        mergeSort(array,array.length);
        System.out.println("\n The final sorted array using merge sort is:");
        printArray(array);
    }
  //splits the array into two array first
  //and further splits the array until we have one attributes each
  public static void mergeSort(int [] array, int len){
      if (len < 2){return;}
      
      int mid = len / 2;
      //creating two different array of appropriate size
      int [] leftArray = new int[mid];
      int [] rightArray = new int[len-mid];
      
    //Spliting the array into two separate arrays
      int k = 0;
      for(int i = 0;i<len;++i){
          if(i<mid){
              leftArray[i] = array[i];
          }
          else{
              rightArray[k] = array[i];
              k = k+1;
          }
      }
      System.out.println("\n The left split is:");
      printArray(leftArray);
      System.out.println("\n The right split is: ");
      printArray(rightArray);
      
    // dividing the array further until we get single attributes recursively
      mergeSort(leftArray,mid);
      mergeSort(rightArray,len-mid);
    // Calling the merge method on each subdivision
      merge(leftArray,rightArray,array,mid,len-mid);
  }

  //checks is each attributes are smaller than the next one
  //and changes the places apropriately.
 public static void merge(int[] leftArray,int[] rightArray, int[] array,int lsize, int rsize){
      
      int i=0,l=0,r = 0;
     // check the merging condition 
      while(l< lsize && r< rsize){
          
          if(leftArray[l]<rightArray[r]){
              array[i++] = leftArray[l++];
          }
          else{
              array[i++] = rightArray[r++];
          }
      }
      while(l<lsize){
          array[i++] = leftArray[l++];
      }
      while(r<rsize){
        array[i++] = rightArray[r++];
      }
  }

  	
  	
  //it prints the array
  	static void printArray(int array []) {
  		for(int i =0; i< array.length;++i){
            System.out.print(array[i]+ " ");
        }
  	}
}