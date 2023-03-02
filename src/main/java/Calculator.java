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

    //Factorial
    //Natural Logarithm (ln(x))
    //Power Function x^b
}
