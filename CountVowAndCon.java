
import java.util.Scanner;

public class CountVowAndCon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Sting: ");
        String str = input.nextLine();
        int vowCount = 0;
        int conCount = 0;

        //Convert the String to Lower case
        str = str.toLowerCase();

        //Traverse the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowCount++;
                } else {
                    conCount++;
                }
            }
        }
        System.out.print("Count of Vowels in the String: " + vowCount);
        System.out.print("Count of Consonants in the String: " + conCount);

        input.close();

    }

}
