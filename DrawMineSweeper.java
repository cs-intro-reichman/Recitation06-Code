public class DrawMineSweeper {
	public static void main (String[] args) {
		int N = Integer.parseInt(args[0]);
		int M = Integer.parseInt(args[1]);
		//sets the scale of the drawing board.
		StdDraw.setXscale(0, N);
		StdDraw.setYscale(0, M);
		
		//at each cell put a number or a bomb
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				String s = StdIn.readString();
				if (s.equals("*")) {
					StdDraw.picture(i + 0.5, j + 0.5,"mine.png"); 
				} else {
					StdDraw.text(i + 0.5, j + 0.5, s);
				}
			}
		}
	}	
}
