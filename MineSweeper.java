public class MineSweeper {
    public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		int M = Integer.parseInt(args[1]);
		double probability = Double.parseDouble(args[2]);
		// Initialize the mines.
		int[][] mines = new int[N + 2][M + 2];
		
		// For each cell, 'flip a coin' to see if it has a mine.
		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < M + 1; j++) {
				if (Math.random() < probability){
					mines[i][j]++;
				}
			}
		}
        // Initialize and calculate the values of the board.
	    // The board is larger than needed to avoid giving special attention to the edges.
        int[][] board = new int[N + 2][M + 2];	
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < M + 1; j++) {
                board[i][j] = board[i][j] + mines[i - 1][j] + mines[i - 1][j - 1] +
                              mines[i - 1][j + 1] + mines[i][j - 1] + mines[i][j + 1] + 
                              mines[i + 1][j] + mines[i + 1][j + 1] + mines[i + 1][j - 1];
            } 
        }

        //print the board, if a cell contains a mine - print '*'
        for (int i = 1; i < N + 1; i++) {
            for(int j = 1; j < M + 1; j++) {
                String cur = mines[i][j] == 0 ? board[i][j] + " " : '*' + " " ;
                System.out.print(cur);
            }
            System.out.println();
        }
    }
}
