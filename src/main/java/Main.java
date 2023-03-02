import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("Scientific Calculator (DevOps)");

        boolean exit = false;

        Calculator cal = new Calculator();

        while(!exit) {
            System.out.println("------------------------------");
            System.out.println("Please choose operation to perform");
            System.out.println("1. Square root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural log");
            System.out.println("4. Power function");
            System.out.println("5. Exit");
            System.out.print("Enter operation number: ");

            int operation;
            double number1 = 0, number2 = 0;
            try {
                operation = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid option selected: " + e);
                return;
            }

            if(operation > 5 || operation < 1) {
                System.out.println("Not a valid option");
                continue;
            } else if (operation == 5) {
                exit = true;
                System.out.println("------------");
                System.out.println("Thank you!!!");
                System.out.println("------------");
                System.out.println();
                return;
            } else {
                System.out.print("Input number: ");

                try {
                    number1 = sc.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input: " + e);
                    return;
                }
            }

            switch (operation) {
                case 1:
                    double answer = cal.SquareRoot(number1);
                    if (answer != -1)
                        System.out.println("Answer: " + answer);
                    break;
                default:
                    System.out.println("Not a valid option");
                    break;
            }
        }
    }
}