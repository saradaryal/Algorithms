
import java.util.Scanner;
/**
 * This is a dynamic implementation of a Longest Common Subsequence 
 * where you get user input of two string to be compared. Then it compares
 * the longest string and prints it out along with the length of the string.
 * @author Sarad Aryal
 *
 */
public class long_com_seq {
	private static Scanner Obj;
	/**
	 * This method is the main method of the program. This method prompts the user
	 * to input two string to be compared. Then it finds out the length of those two 
	 * string and pass it to the next helper method for further analysis.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Getting user input 
		Obj = new Scanner(System.in);
		System.out.println("Please! Enter the first string to be compared: ");
        String seq1 = Obj.nextLine();
        System.out.println("Please! Enter the second string to be compared: ");
        String seq2 = Obj.nextLine(); 
        int m = seq1.length(); 
        int n = seq2.length(); 
        //call lowest method
        lowest(seq1, seq2, m, n);		
	}
	/**
	 * This method takes is two strings and two integers which is the length of those 
	 * string and calculates the longest common subsequence in the string and prints
	 * it out. 
	 * @param x
	 * @param y
	 * @param m
	 * @param n
	 */
	static void lowest(String x, String y, int m, int n) {
		// TODO Auto-generated method stub
		//create a two dimensional array of size m+1 and n+1
		int[][] L = new int[m+1][n+1]; 
		   
        // Following steps builds the array in bottom up fashion. Also
        // L[i][j] contains length of LCS of X[0..i-1] = i and Y[0..j-1] = j  
        for (int i=0; i<=m; i++) { 
            for (int j=0; j<=n; j++){ 
            	//if both i and j are 0 then L[i][j] = 0
                if (i == 0 || j == 0) 
                    L[i][j] = 0; 
                //else compare the character at position one less than i and j.
                else if (x.charAt(i-1) == y.charAt(j-1)) 
                //if they are equal then increase the value of L at that location by 1.
                    L[i][j] = L[i-1][j-1] + 1; 
                else
                //else assign the maximum value of the entire array till now to L
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]); 
            }
        }
        //store the max value
		int point = L[m][n]; 
        int temp = point; 
        //creating a char arrya to store the output
        char[] arr = new char[point+1]; 
        int i = m; 
        int j = n; 
        //starting from the right buttom-most part of the array
        while (i > 0 && j > 0){ 
        	//store the character if the character is same in 
        	//both x and y
            if (x.charAt(i-1) == y.charAt(j-1)){ 
                // save current character int the array 
                arr[point-1] = x.charAt(i-1);  
                i--; j--; point--;      
            } 
            //if it is not equal then follow the longest
            //string
            else if (L[i-1][j] > L[i][j-1]) i--; 
            else j--; 
        } 
   
        // Print the character array
        System.out.print("LCS of "+x+" and "+y+" is "+ arr.length + " is "); 
        for(int k=0;k<=temp;k++) 
            System.out.print(arr[k]); 
    } 
}

	
