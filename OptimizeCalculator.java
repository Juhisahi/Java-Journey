import java.util.Scanner;

public class OptimizeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first number");
        double num1 = sc.nextDouble();

        System.out.println("Please enter your second number");
        double num2 = sc.nextDouble();

        System.out.println("What operation do you need to perform in these numbers\n" +
                "1. Addition (+)\n" +
                "2. Subtraction (-)\n" +
                "3. Multiplication (*) \n" +
                "4. Divide (/)");

        System.out.println("Please enter your choice");
        int op = sc.nextInt();

        switch(op) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;

            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;

            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;

            case 4:
                if (num2 == 0) {
                    System.out.println("Error: cannot be divisible by zero");
                }
                else {
                    System.out.println("Result: " + (num1 / num2));
                }
                break;

            default:
                System.out.println("Please enter a valid operation");

        }
    }

}
