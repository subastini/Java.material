package Ex_99_Tasks;

import java.util.Scanner;

public class May_28_03_Palindrome_string {

    public static void main(String[] args) {

        // input --> something in string --> datatype --> String
        // output --> something in string --> datatype --> String

        Scanner sc = new Scanner(System.in);

        //i/p
        System.out.println("Enter String Palindrome");
        String s1 = sc.nextLine().toLowerCase();

        boolean isPalindrome = true;

        // Check each character from start and end
        for (int i = 0; i < s1.length() / 2; i++) {
            char startChar = s1.charAt(i);
            char endChar = s1.charAt(s1.length() - 1 - i);

            if (startChar != endChar) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a Palindrome.");
        }
    }
}
