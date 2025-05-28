package A1_Java.Ex_10_While_loop;

// If input is a not a integer

import java.util.Scanner;

public class Ex_07_Ip_not_integer {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Factorial");
// checking input is integer
        if (!s.hasNextInt()){
            System.out.println("Enter the interger value");
        }

        int a = s.nextInt();
        int factorial = 1;
// checking number can;t be < 0
        if (factorial <= 0) {

            System.out.println("Factorial is " + factorial);
        }

        int i = 1;

        while (i<= a ){

            factorial = factorial *i;
            i++;

        }

        System.out.println("final factorial is " + factorial);

// Checking maximum value
        if (i > Integer.MAX_VALUE);
        System.out.println("Enter minimun value");
    }
}