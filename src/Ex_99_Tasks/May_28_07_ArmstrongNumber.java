package Ex_99_Tasks;

import java.util.Scanner;

public class May_28_07_ArmstrongNumber {
    // 153 → 1³ + 5³ + 3³ = 1 + 125 + 27 = 153
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter only integer");
        int num = s.nextInt();

        int original = num;

        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is Not an Armstrong Number");
        }

        s.close();


    }
}
