package Ex_99_Tasks;

import java.util.Scanner;

public class May_28_09_GradCalculator {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter only integer");
        int num = s.nextInt();

        if (num >= 90 && num <= 100) {
            System.out.println("your grade is A");
        }  else if (num >= 80 && num <= 89) {
            System.out.println("your grade is B");
        } else if (num >= 70 && num <= 79) {
            System.out.println("your grade is c");
        }  else if (num >= 60 && num <= 69) {
            System.out.println("your grade is D");
        } else if(num >= 0 && num <= 59){
            System.out.println("Failed");
        } else {
            System.out.println("Invalid score! Please enter 0 to 100");
        }

        System.out.println( "And your score is " + num);
    }
}
