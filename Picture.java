import java.awt.Color;

public class Picture {
    public static final int NUM_COLORS = 3;
    public static final int RED_POSITION = 0;
    public static final int GREEN_POSITION = 1;
    public static final int BLUE_POSITION = 2;
    public static final int MAX_INTENSITY = 255;
    
    public static boolean isImage(int[][][] image) {
        int rowLength = image[0].length;
        
        for (int i = 0; i < image.length; i++) {
            //check if all rows are of the same length
            if (image[i].length != rowLength) {
                return false;
            }
    
            for (int j = 0; j < rowLength; j++) {
                //check if each inner array represents a pixel 
                if (image[i][j].length != NUM_COLORS) {
                    return false;
                }
    
                for (int k = 0; k <= image[i][j].length; k++) {
                    if (image[i][j][k] < 0 || image[i][j][k] > MAX_INTENSITY) {
                        return false;
                    }
                } 
            }
        }
        return true;
    }
    /**
	* Inverts all the colors of an image
	* @param pic - the image 
	* @return the inverted image
	*/
	public static int[][][] invertAll(int[][][] pic){
		pic = invertColor(pic, RED_POSITION);
		pic = invertColor(pic, GREEN_POSITION);
		pic = invertColor(pic, BLUE_POSITION);
		return pic;
	}   
    /**
	* inverts one color of an image.
	* @param pic - the picture to be inverted
	* @param color - the color to be inverted
	* @return the inverted image
	*/
	public static int[][][] invertColor(int[][][] pic, int color){
		int[][][] ans = new int[pic.length][pic[0].length][NUM_COLORS];
		
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				ans[i][j] = invertPixel(pic[i][j], color);
			}
		}
		return ans;
	}
	/**
	* invert one color of a given pixel.
	* @param pixel - the color array to be inverted
	* @param color - the color to be inverted
	* @return - the inverted pixel
	*/
	public static int[] invertPixel(int[] pixel, int color){
		int[] ans = {pixel[0], pixel[1], pixel[2]};
		ans[color] = MAX_INTENSITY - pixel[color];
		return ans;
	}

    /**
     * Writes an image to the standard output using PPM format.
     * Make sure the standard output is set before using.
     * 
     * @param pic - the image to write
     */
    public static void write(Color[][] pic){
        StdOut.println("P3");
        StdOut.println("" + pic[0].length + " " + pic.length);
        StdOut.println(MAX_INTENSITY);
        for (int i = 0; i < pic.length; i++){
            for (int j = 0; j < pic[0].length; j++){
                StdOut.print("" + pic[i][j].getRed() + " " + 
                    pic[i][j].getGreen() + " " + pic[i][j].getBlue() + "  ");
            }
            StdOut.println();
        }
    }


}
