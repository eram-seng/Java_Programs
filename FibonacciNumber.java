
import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the series");
        int n = input.nextInt();

        int num1 = 0;
        int num2 = 1;

        if (n == 1) {
            System.out.println(num1);
        } else if (n >= 2) {
            System.out.print(num1 + ", " + num2);
        }

        for (int i = 2; i < n; i++) {

            int num3 = num1 + num2;
            System.out.print(", " + num3);

            num1 = num2;
            num2 = num3;
        }
        input.close();

    }

}
