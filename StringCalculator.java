import java.util.Arrays;

public class StringCalculator {
    public static int add(String input){
        String[] numbers = input.split((",|\n"));
            if (!input.isEmpty()) {
               if (numbers.length>1) {
                   return sumNumbers(numbers);
               }
                return checkNegativeNumber(input);
            }
               return 0;
}
            private static int sumNumbers(String[] numbers) {
                int sum=0;
                for (String Number:numbers) {
                    if (checkNegativeNumber(Number)>1000) {
                        continue;
                    }
                    sum+=checkNegativeNumber(Number);
                }
                return sum;
            }

            private static int checkNegativeNumber(String number) {
                int checkNumber=Integer.parseInt(number);
                if (checkNumber<0) {
                    try {
                        throw new TestException("negatives not allowed");
                    } catch (TestException e) {
                        e.printStackTrace();
                    }

                }
                return checkNumber;
            }

    public static class TestException extends Exception {
        public TestException(String message) {
            super("Test Exception:");
        }
    }
}



