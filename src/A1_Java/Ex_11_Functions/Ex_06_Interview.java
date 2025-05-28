package A1_Java.Ex_11_Functions;

import java.util.Scanner;

public class Ex_06_Interview {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
// sum
       System.out.println("Add a value");
       int result = s.nextInt();

        System.out.println("Add b value");
        int result2 = s.nextInt();

        System.out.println(result + result2);
       // System.out.println("a value is " +result + "\n b value is "+ result2 + ""+  result+result2 );
//sub
        System.out.println("Sub c value");
        int resultc = s.nextInt();

        System.out.println("Sub d value");
        int resultd = s.nextInt();

        System.out.println(resultc - resultd);

        //mul
        System.out.println("Mul x value");
        int resultx = s.nextInt();

        System.out.println("Mul y value");
        int resulty = s.nextInt();

        System.out.println(resultx * resulty);

        //div
        System.out.println("Div x value");
        int resultdiv1 = s.nextInt();

        System.out.println("Div y value");
        int resultdiv2 = s.nextInt();

        System.out.println(resultdiv1 / resultdiv2);


        s.close();
    }

    static int add(int a , int b){
        return a+b;
    }
    static int sub(int c , int d){
        return c-d;
    }
    static int mul(int x , int y){
        return x*y;
    }
    static int div(int div1 , int div2){
         if (div2==0){
             throw new ArithmeticException("Divisible by zero is not allowed");
         }
        return div1/div2;
    }
}
