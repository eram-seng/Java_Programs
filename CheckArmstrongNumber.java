
import java.util.Scanner;

public class CheckArmstrongNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check if it is Armstrong: ");
        int n = input.nextInt();

        int digitCount = 0;
        int originalNum = n;
        int sumDigits = 0;

        //Count number of digits
        int temp = n;
        while (temp != 0) {
            temp = temp / 10;
            digitCount++;
        }

        //Sum of the digits
        temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            sumDigits += Math.pow(digit, digitCount);
            temp = temp / 10;

        }
        if (sumDigits == originalNum) {
            System.out.print(originalNum + "Numbers is an Armstrong");
        } else {
            System.out.print(originalNum + "Numbers is not an Armstrong");
        }

        input.close();

    }

}
