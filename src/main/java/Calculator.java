public class Calculator {
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

        return answer;
    }

    public static double Power(double base, double power) {
        double answer = (double)Math.pow(base, power);
        return answer;
    }
}
