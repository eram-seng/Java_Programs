
import java.util.Scanner;

public class LargestAndSmallestElementArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        //Taking input for array
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest element in the array is: " + largest);
        System.out.println("Smallest element in the array is: " + smallest);
        input.close();

    }

}
