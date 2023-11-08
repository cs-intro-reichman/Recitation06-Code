public class SelfAvoidingWalk {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int T = Integer.parseInt(args[1]);
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N);
        int sum = 0;
        // draw T self-avoiding random walks 
        for (int i = 0; i < T; i++) {
            StdDraw.clear();
            boolean[][] visited = new boolean[N][N];		// starting position
            int x = N / 2;
            int y = N / 2;
            visited[x][y] = true;
            StdDraw.filledSquare(x + 0.5, y + 0.5, .45);		// make a random move as long as particle is not boxed in
            while (!visited[x - 1][y] || !visited[x + 1][y] 
                    || !visited[x][y - 1] || !visited[x][y + 1]){

                // try to find a legal move, draw the move and check if a boundary was reached
                while (true) {
                    double r = Math.random();				
                    if (r < 0.25 && !visited[x - 1][y]) { 
                        x--; 
                        break; 
                    } 
                    if ((r < 0.5 && r >= 0.25) && !visited[x + 1][y]) { 
                        x++; 
                        break; 
                    } 
                    if ((r < 0.75 && r >= 0.5) && !visited[x][y - 1]) { 
                        y--; 
                        break; 
                    } 
                    if ((r < 1.00 && r >= 0.75) && !visited[x][y + 1]) { 
                        y++; 
                        break; 
                    }
            
                }
                StdDraw.show();
            }
            StdOut.println((double) sum / T);
        }
    }
}

