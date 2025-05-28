package Ex_99_Tasks;

import java.util.Scanner;

public class May_28_01_Reverse_forloop {
    public static void main(String[] args) {


        // data type input and output
        Scanner s = new Scanner(System.in);

        System.out.println(" Enter a number");
        int a = s.nextInt();


        // rough code
        //for (int; cond; in) a=1; a<10 ; a++

        int b = 0;
for (; a != 0 ; a /= 10){


    int get_lastdigit = a % 10;

    b = b * 10 + get_lastdigit;


}

        System.out.println("Reversed number is " + b);



    }
}
