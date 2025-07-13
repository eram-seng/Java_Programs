
import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str1 = input.nextLine().toLowerCase().replaceAll("\\s", "");
        String str2 = input.nextLine().toLowerCase().replaceAll("\\s", "");

        if (str1.length() != str2.length()) {
            System.out.print("Strings are anot anagram ");

        }
        //Created array
        int[] count = new int[26];

        //Traverse str1
        for (int i = 0; i < str1.length(); i++) {
            count[str.CheckAt(i) - 'a']++;
        }

        //Traverse str2
        for (int i = 0; i < str2.length(); i++) {
            count[str.CheckAt(i) - 'a']--;
        }

        //Checking if the count array data is '0'
        boolean isAnagram = true;

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                isAngram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.print("Strings are Anagram")
        } else {
            System.out.print("No anagram");
        }
    }

}
