package Ex_99_Tasks;

import java.util.Scanner;

public class May_28_02_Vowels_consonant {

    // Vowels are: a, e, i, o, u
    // Consonants   b, c, d, f, g, h, j, k, l, m, n, p, q, r, s, t, v, w, x, y and z
    public static void main(String[] args) {
// input String = something --> datatype --> string

        Scanner s = new Scanner(System.in);
        System.out.println("Enter only string");

        String input = s.nextLine();
        input = input.toLowerCase();

        int vowels = 0, consonants = 0;


        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            // Check if it's a letter
            if (ch >= 'a' && ch <= 'z') {
                // Check if it's a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++; // vowels = vowels + 1;

                } else {
                    consonants++; // a++ -->
                }
            }


        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }}
