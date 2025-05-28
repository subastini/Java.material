package A1_Java.Ex_10_While_loop;

import java.util.Random;
import java.util.Scanner;

public class Ex_08_Guessing_Game {

    public static void main(String[] args) {
 // guess number 1 t0 100
        // Datatype of input and output
        // to get input as random number

        Random ra = new Random();
        int numberToguess = ra.nextInt(100) + 1; // bound means 99 so + 1
        // ex : bound is your salary
       // System.out.println(numberToguess);

        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 to 100");

        int guess;
        int attempt = 0;

        while (true){

            guess = s.nextInt();
            attempt++;

            if (guess < numberToguess) {
                System.out.println("Too low, Try Again");
            } else if ( guess > numberToguess) {
                System.out.println("Too high, Try Again");
            }
            else {
                System.out.println("WOW Congrats, your guess is right " + attempt + " Attempts");
                break;
            }
            {

            }
        }



       // int num = s.nextInt();


    }
}
