
import java.util.Scanner;

public class PrintOnlyAOrB {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a line:");
        String str = input.nextLine();

        String[] words = str.split(" ");

        for (String word : words) {
            if (word.equals("a") || word.equals("b")) {

                System.out.print(word);
            }
        }
        input.close();
    }

}
