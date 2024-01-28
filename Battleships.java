public class Battleships {
    public static void main(String[] args){
        StdOut.println("What size game would you like to play?");
        In in = new In ();
        int N = in.readInt();

        //create an N X N board
        boolean[][] subs = new boolean[N][N];

        //Choose N random locations for battleships.
        for (int i = 0; i < N; i++){
            int x = (int) (Math.random() * N);
            int y = (int) (Math.random() * N);
            
            while(subs[x][y]){
                x = (int) (Math.random() * N);
                y = (int) (Math.random() * N);
            }
            subs[x][y] = true;
        }
        int userX = 0;
        int userY = 0;
        int sunk = 0;

        // Keep playing the game until the number of sunk battleship reaches N
        while (sunk < N){
            StdOut.println("enter your guess:");
            userX = in.readInt();
            userY = in.readInt();    
            //check if the coordinates are within the board
            if (userX < N && userX >= 0 && userY < N && userY >= 0){
                //if a battleship is in the coordinates update the data
                if (subs[userX][userY]){
                    StdOut.println("You sunk my battleship, good job.");
                    sunk++;
                    subs[userX][userY] = false;
                } else {
                    StdOut.println("Nothing here, only water.");
                }
            } else {
                StdOut.println("Illegal coordinates, try again.");
            }
            StdOut.println();
        }
        StdOut.println("VICTORY!!!!!!");
    }
}
