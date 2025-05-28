package Ex_99_Tasks;

import java.util.Scanner;

public class May_28_10_Leap_year {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = s.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is Not a Leap Year");
        }
    }
}
