package Ex_99_Tasks;

import java.util.Scanner;

public class May_28_04_PrimeNumber {

    public static void main(String[] args) {

        // input --> prime number --> datatype --> integer
        //output --> primenumber --> datatype--> integer

        Scanner s = new Scanner(System.in);
         //ip

        System.out.println("Enter prime number");
        int num = s.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false; // 0 and 1 are not prime
        } else {
            // Check from 2 to num-1
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is Not a Prime Number");
        }



    }
}
