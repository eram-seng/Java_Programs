
import java.util.Scanner;

public class NumberFactorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to calculate factorial: ");
        int n = input.nextInt();

        //Logic
        int fact = 1;
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers ");
        }

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of a " + n + " is:" + fact);
        input.close();

    }

}
