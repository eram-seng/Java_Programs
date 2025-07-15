
import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");

        int n = input.nextInt();

        int[] arr = new int[n - 1];
        System.out.println("Enter the elements from 1 to n (one is missing):");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = input.nextInt();
        }

        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;

        for (int num : arr) {
            arrSum += num;
        }
        int missing = totalSum - arrSum;
        System.out.println("Misisng Number is: " + missing);
        input.close();

    }

}
