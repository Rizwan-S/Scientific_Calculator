import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static double SquareRoot(double number) {
        if(number < 0) {
            System.out.println("Invalid Input: Negative Number ");
            return -1;
        }

        double answer;
        try {
            answer = Math.sqrt(number);
        } catch (Exception e) {
            System.out.println("SquareRoot function error");
            return -1;
        }

        logger.info("RESULT - SquareRoot of " + number + " = " + answer);
        return answer;
    }

    public static double Factorial(double number) {
        if(number < 0) {
            System.out.println("Invalid Input: Negative Number ");
            return -1;
        }
        if(number == 0) return 0;
        double answer = 1;
        for(int i = 1; i <= number; ++i) {
            answer = answer * i;
        }

        logger.info("RESULT - Factorial of " + number + " = " + answer);
        return answer;
    }

    public static double NaturalLog(double number) {
        if(number <= 0) {
            System.out.println("Invalid Input: Negative Number or Zero ");
            return -1;
        }
        double answer = 0;

        try {
            answer = Math.log(number);
        } catch (ArithmeticException  e) {
            System.out.println("Natural log error: "+ e);
        }

        logger.info("RESULT - NaturalLog of " + number + " = " + answer);
        return answer;
    }

    public static double Power(double base, double power) {
        double answer = (double)Math.pow(base, power);

        logger.info("RESULT - Power of " + base + "^" + power +  " = " + answer);
        return answer;
    }
}
