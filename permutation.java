/**
 * This programs prints out the permutation of the string entered.
 * @author Sarad Aryal
 *
 */
public class permutation { 
	/**
	 * This is the main method 
	 * @param args
	 */
    public static void main(String[] args) 
    { 
    	//declare string to be permuted
        String string = "xyz"; 
        //store the length of the string in b
        int b = string.length(); 
        //call the permute method
        permute(string, 0, b - 1); 
    } 
  
    /**
     * This method takes in a string and two integer which is the base value and 
     * the size of the string. It checks if the size of the stirng is equal to the base
     * value. If it is it returns the string, if not, it runs the string through a loop 
     * and swaps the position using the helper method below. 
     * @param str
     * @param l
     * @param r
     */
    private static void permute(String string, int a, int b) 
    { 
    	//if r = 0 print the string 
        if (a == b) 
            System.out.println(string); 
        else { 
            for (int i = a; i <= b; i++) { 
            	//call swap helper method 
                string = swap(string, a, i); 
                //recursively calling permute 
                permute(string, a + 1, b); 
                //again call the swap method to swap data in l and i position in the array.
                string = swap(string, a, i); 
            } 
        } 
    } 
  /**
   * This method is the helper method for the permute method.
   * This method takes in string and two integer value and swaps
   * the char at the particular location. 
   * @param a
   * @param i
   * @param j
   * @return
   */
    public static String swap(String a, int i, int j) 
    { 
    	//create a temporary char 
        char temp; 
        //convert recieved string into char array and store in a new character array.
        char[] array = a.toCharArray(); 
        //swap the position 
        //assign ith value to temp
        temp = array[i]; 
        //assign jth value to array[i]
        array[i] = array[j]; 
        //assign temp value to array[j]
        array[j] = temp; 
        //return the value of the array.
        return String.valueOf(array); 
    } 
} 