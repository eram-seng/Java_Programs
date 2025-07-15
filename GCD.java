
import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number to calculate GCD: ");
        int firstNum = input.nextInt();

        System.out.println("Enter the second number to calculate GCD: ");
        int secondNum = input.nextInt();

        while (secondNum != 0) {
            int temp = secondNum;
            secondNum = firstNum % secondNum;
            firstNum = temp;

        }
        System.out.println("GCD is: " + firstNum);
        input.close();

    }

}
