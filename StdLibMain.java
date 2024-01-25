public class StdLibMain {
    public static void main(String[] args) {
        In in = new In("./data.txt");
        while (in.hasNextChar()){
            StdOut.println(in.readInt());	
        }
    }
    
}
