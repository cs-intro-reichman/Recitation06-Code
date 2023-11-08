/*
 *  Runs several simulations of T random walkers in an N X N grid.
 *  
 *  The program expects to get the following command line arguments:
 *  - N - The size of of the N X N grid.
 * 	- T - The number of simulations to be run. 
 */
public class RWCoverage {
	
	public static void main (String[] args){
		int N = Integer.parseInt(args[0]);
		int T = Integer.parseInt(args[1]);
		int sum = 0;
		for (int i = 0; i < T ; i++){
			
			//for every simulation initialize the visited array to be all false
			boolean[][] visited = new boolean[N][N];
			int x = 0;
			int y = 0;
			visited[0][0] = true;
			int visits = 1;
			int counter = 0;
			
			//run the simulation until all nodes have been visited at least once
			while (visits < N * N){
				counter++;
				//throw the dice, 0 - up, 1 - down, 2 - right, 3 - left
				int rand = (int)(Math.random() * 4);
				
				//move the walker, using modulo to wrap around the walls
				if (rand == 0){
					x =  (x + 1) % N;
				}
				if (rand == 1){
					x = (x - 1 + N) % N;
				}
				if (rand == 2){
					y = (y + 1) % N;
				}
				if (rand == 3){
					y = (y - 1 + N) % N;
				}
				
				//if the walker lands in a new node, increase the number of visited nodes by one
				if (!visited[x][y]){
					visited[x][y] = true;
					visits++;
				}
			}
			sum += counter;
		}
		double avg = (double) sum / T;
		System.out.println ("A " + N + "X" + N + " grid is covered by an average number of "+ avg +" steps");
	}
}

