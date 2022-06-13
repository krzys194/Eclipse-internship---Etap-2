
import org.junit.Assert;
import org.junit.Test;


public class StringCalculatorTest {
    @Test
    public void shouldReturnZeroWhenEmpty() {
        Assert.assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void shouldReturnOneNumber() {
        Assert.assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void shouldReturnTwoNumbers() {
        Assert.assertEquals(3, StringCalculator.add("1,2"));
    }

    @Test
    public void shouldReturnSomeNumbers() {
        Assert.assertEquals(20, StringCalculator.add("1,2,3,4,10"));
    }

    @Test
    public void shouldReturnNumbersWithDelimiters() {
        Assert.assertEquals(6, StringCalculator.add("1\n2,3"));
    }

//    @Test (expected = StringCalculator.TestException.class)
//    public void functionTest() throws StringCalculator.TestException {
//       StringCalculator.add("-1");
//    }

    @Test
    public void shouldReturnNumbersWithout1000AndMore() {
        Assert.assertEquals(StringCalculator.add("2,1001"), 2);
    }
}
