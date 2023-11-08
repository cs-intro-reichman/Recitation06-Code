import java.awt.Color;

public class Colors {
	public static void main(String[] args) {
        Color red = new Color(255,0,0);
        Color green = new Color(0,255,0);
        Color blue = new Color(0,0,255);

        System.out.println(red.getRed()); // 255
        System.out.println(red.getGreen()); // 0
        System.out.println(green.getGreen()); // 255

        Color[][] array = new Color[2][2];
        array[0][0] = red;
        array[0][1] = blue;
        array[1][0] = green;
        array[1][1] = new Color(100,100,100);

        System.out.println(array[1][1].getGreen()); // 100

   	}

}
