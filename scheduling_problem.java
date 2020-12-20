/**
 * This program is used to schedules jobs with 
 * shortest time first. Here, we sorted the jobs out 
 * comparing their completion time. 
 * @author Sarad Aryal
 *
 */
public class scheduling_problem {
/**
 * This is the main method. It prvides an array of completion time for 
 * each jobs and prints out the job schedule according to shortest job
 * first method. 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//runtime of the jobs 
		int [] runtime = {3,6,1,8,5,4,9,7,11 };
		int l = runtime.length;
		int temp;
		System.out.println("Each iteration of the job scheduling problem are: ");
		//for loop to sort the array in ascending order
		for (int i = 0; i < l; i ++) {
			for (int j = i+1; j < l; j++) {
				if (runtime[i] > runtime[j]) {
					temp = runtime[i];
					runtime[i] = runtime[j];
					runtime[j] = temp;
					}
				}
			//Prints each iteration 
			System.out.print("iteration " + i + " =" + " ");
			printArray(runtime, i);
			}
		//print the final result
		System.out.println("The required job schedule is: ");
		printArray(runtime, l-1);
		System.out.println("The runtime of the given job schedule is: " + print_runtime(runtime));	
		}
	/**
	 * method to print the array 
	 * @param time
	 * @param index
	 */
static void printArray(int [] time, int index) {
	
	for (int i = 0; i <= index; ++i) 
        System.out.print(time[i] + " "); 	
    System.out.println(); 
	}
/**
 * method that prints the runtime of the given job schedule
 * @param job_schedule
 * @return
 */

static int print_runtime(int [] job_schedule) {
	int k = 0, l = 0; 
	for (int i = 0; i < job_schedule.length;i++) {
		 k = k + job_schedule[i];
		 l = l + k;
	}
	System.out.println("The minimun timei required is:" + k);
	return l;
 }
}
