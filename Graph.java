/**
 * 
 */
import java.util.*; 


/**
 * 
 * @author Sarad Aryal
 *
 */
class Graph { 
	//declare number of vertices for the graph
	int V; 

	// Adjacency list as ArayList of ArrayLists
	ArrayList<ArrayList<Integer> > adj; 

	/**
	 * constructor for the topological sort class
	 * @param v
	 */
	Graph(int v) 
	{ 
		V = v; 
		adj = new ArrayList<ArrayList<Integer> >(v); 
		for (int i = 0; i < v; ++i) 
			adj.add(new ArrayList<Integer>()); 
	} 

	/**
	 * Add a new edge to the graph 
	 * @param v
	 * @param w
	 */
	void addEdge(int v, int w) {
		adj.get(v).add(w); 
	} 
	/**
	 * Main method for the topological search. First of all created a new 
	 * graph with 6 nodes. Then added data into it. Prints the message for the user 
	 * and calls the main topological_sort method. 
	 * @param args
	 */
		public static void main(String args[]) { 
			// TODO Auto-generated method stub
			//create a graph
			Graph g = new Graph(6); 
			g.addEdge(5, 2); 
			g.addEdge(5, 0); 
			g.addEdge(4, 0); 
			g.addEdge(4, 1); 
			g.addEdge(2, 3); 
			g.addEdge(3, 1); 
			//print the message
			System.out.println("The topological sort of the given graph is:"); 
			//call the topologial sort method with graph g.
			g.topological_Sort(); 
		} 

	/**
	 * This method is called from the main to find the 
	 * topological sorting. This will first initialize every vertex 
	 * as not visited and then creates a loop till the number of 
	 * vertex and checks if the vertex is visited or not. If it is not 
	 * visited then it calls the helper method. 
	 */
	void topological_Sort() { 
		//create a new stack
		Stack<Integer> stack = new Stack<Integer>(); 
		//create a boolean object to keep track of the visited nodes
		boolean visited[] = new boolean[V]; 
		//initialize every vertices to not visited.
		for (int i = 0; i < V; i++) 
			visited[i] = false; 
		//loops through the number of vertices
		for (int i = 0; i < V; i++) 
			//checks if the node is visited
			if (visited[i] == false) 
				//calls the helper method if not visited
				topological_Sort_Helper(i, visited, stack); 
		//print the stack as it the final value is stored in the stack
		while (stack.empty() == false) 
			System.out.print(stack.pop() + " -->"); 
	} 
	
	/**
	 * This is a helper method for topological_Sort. It gets the pointer for 
	 * the location that is not visited and the empty stack. First this method 
	 * marks the vertex as visited, then iterates through the graph and pushes 
	 * the vertex in the stack 
	 * @param v
	 * @param visited
	 * @param stack
	 */
	void topological_Sort_Helper(int v, boolean visited[], Stack<Integer> stack) { 
			//mark current node as visited.
			visited[v] = true; 
			//create an integer object
			Integer i; 
			Iterator<Integer> it = adj.get(v).iterator();
			//this loop goes until the there is next node
			while (it.hasNext()) { 
				i = it.next(); 
				//if the next node is not visited then it recurisvely calls
				//the helper method.
				if (!visited[i]) 
					topological_Sort_Helper(i, visited, stack); 
			} 
			//pushes the integer in the stack.
			stack.push(new Integer(v)); 
			
		} 

} 
