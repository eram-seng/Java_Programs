
import java.util.Scanner;

public class CountDigit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to count its digits: ");
        int num = input.nextInt();
        int count = 0;

        //Count the number of digits in a number		
        while (num != 0) {
            num = num / 10;
            count++;
        }

        System.out.println("Number of digits are: " + count);
        input.close();
    }

}
