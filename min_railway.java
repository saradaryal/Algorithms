/**
 * This programs takes arrival time and departure time at the railway 
 * station and figures out the minimum number of platform required for 
 * the railway schedule to function properly. 
 * 
 * @author Sarad Aryal
 *
 */
public class min_railway {
/**
 * This is the main method. We create two arrays with arrival time and
 * departure time on it in 24 hour scale. Then print the arrival and departure 
 * time and then print the minimum number of platform reunisharyalquired.
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create two different array to save arrival and departure time
		int [] arrival = {900, 940, 950, 1100, 1500, 1800};
		int [] departure = {910, 1200, 1120, 1130, 1900, 2000};
		System.out.println("arrival time " );
		//calls to print the array
		printArray(arrival);
		System.out.println("departure time ");
		//calls to print the array
		printArray(departure);
		System.out.println("The minimum number of platform requried is " + minRailway (arrival, departure));
		
	}
	/**
	 * This method takes in two arrays, array of arrival time and array of departure time,
	 * compares it and figures out the overlapping time and calculate the number of platform 
	 * required for the railway to perform efficiently.
	 * @param arrival
	 * @param departure
	 * @return
	 */
	private static int minRailway(int[] arrival, int[] departure) {
		// TODO Auto-generated method stub
		//initializing two variable
		int platform_required = 1; int result = 1;
		//calculate the length of the array
		int n = arrival.length;
		int i = 1, j = 0;
		while (i < n && j < n) {
			//checks if the next arrival time is less than or equal to the previous departure time
			if (arrival[i] <= departure[j]) {
				//if yes increments the required platform
				platform_required ++;
				//increment i
				i++;	
				//else check if the next arrival time is greater than the previous departure time
			}else if (arrival [i] > departure[j]) {
				//if so decrease the number of platform required
				platform_required --;
				//decrement the value of j
				j++;
			}
			//check if the result is smaller than the number of platform required.
			if (platform_required > result) {
				//swap the value if so
				    result = platform_required;
				}
		}
		return result;
	}
	
	/**
	 * This method takes in the array as input and prints out the array 
	 * @param array
	 */
	static void printArray(int[] array) {
		// TODO Auto-generated method stub
		//for loop to print the arrayw
		for (int i = 0; i < array.length; i++) 
			System.out.println(array[i] + " ");
		System.out.println();
	}

}
