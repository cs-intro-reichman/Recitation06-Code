public class Compressed {
	public static String compressed(int[] arr) {
	    String str = "";
	    int arrZero = 1;
	    int count = 1;
	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] == arrZero) {
                count++;
	        } else {
                str += "" + count + ",";
                count = 1;
                arrZero = arrZero == 1 ? 0 : 1;
	        }
	        if (i == arr.length - 1) {
                str += "" + count;
	        }
	    }
        return str;
	}
}
