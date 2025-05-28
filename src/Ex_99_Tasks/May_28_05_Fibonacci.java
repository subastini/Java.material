package Ex_99_Tasks;

import java.util.Scanner;

public class May_28_05_Fibonacci {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter how many time to print");
        int n = s.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci Series: " + a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}
