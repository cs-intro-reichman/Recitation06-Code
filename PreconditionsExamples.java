public class PreconditionsExamples {
  /**
  * Takes an integer from the user and returns its inverse.
  * Uses preconditions to enforce the user to enter a valid argument (non zero 
  * integer).
  */
  public static double inverse(int number) {
    double ans = 0;
    // Enforce specified precondition.
    if (number == 0) {
        throw new ArithmeticException("Zero doesn’t have an inverse.");
    }
    ans = 1 / number;
    return ans;
}


}
