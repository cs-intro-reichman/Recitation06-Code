public class Mystery {
    public static void main (String [] args) {
       int x = 3;
       int [] y = {1, 2, 3};
       triple1(x);
       triple2(y);
       System.out.println(x);
       for (int i = 0; i < x; i++){
           System.out.print(y[i] + " ");
       }
   }

   public static void triple1 (int a) {
       a = 3 * a;
   }

   public static void triple2 (int [] a) {
       for (int i = 0; i < a.length; i++){
            a[i] = 3 * a[i];
       }
   }
}
