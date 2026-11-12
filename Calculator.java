import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first number");
        int num1 = sc.nextInt();

        System.out.println("Please enter your second number");
        int num2 = sc.nextInt();

        System.out.println("What operation do you need to perform in these numbers\n"  +
                "1. + Addition\n" +
                "2. - Subtraction\n" +
                "3. * multiplication\n" +
                "4. / divide");

        int op = sc.nextInt();
        if (op == 1) {
            int ans = num1 + num2;
            System.out.println(ans);
        }
        else if (op == 2) {
            int ans = num1 - num2;
            System.out.println(ans);
        }
        else if (op == 3) {
            int ans = num1 * num2;
            System.out.println(ans);
        }
        else if (op == 4) {
            float ans = (float) num1 / num2; //the cast (float) num1 converts the first operand to float before division. Therefore, java perfoms floating-point division, not integer division
            System.out.println(ans);
        }
        else {
            System.out.println("invalid input");
        }
    }
}