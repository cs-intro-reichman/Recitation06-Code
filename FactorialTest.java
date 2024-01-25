import org.junit.Test; 
import static org.junit.Assert.assertEquals; 

public class FactorialTest {
    @Test
    public void testFactorial1() {
        long result = AssertionsExamples.factorial(5); 
        assertEquals(120, result);
    }
    
    @Test
    public void testFactorial2() {
        long result = AssertionsExamples.factorial(1); 
        assertEquals(1, result);
    }

        @Test
        public void testStringToDouble() {
            
            double result1 = ASCIIPractice.stringToDouble("345");
            assertEquals(345, result1, 0.001);

            double result2 = ASCIIPractice.stringToDouble("-234.126");
            assertEquals(-234.126, result2, 0.001);

            double result3 = ASCIIPractice.stringToDouble("-.788");
            assertEquals(-0.788, result3, 0.001);

            double result4 = ASCIIPractice.stringToDouble("+234.6");
            assertEquals(234.6, result4, 0.001); // Use delta value for comparing floating-point numbers
        }
    } // Add the missing closing brace here
