package A1_Java.Ex_11_Functions;

import java.util.Scanner;

public class Ex_07_prac {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int result1 = readInt( s , "Enter a value");
        int result2 = readInt( s , "Enter b value");

        int sum = add(result1, result2);
        int minus = sub(result1,result2);
        int ast = mul(result1,result2);
        int slash = div(result1,result2);

        System.out.println(sum);
        System.out.println(minus);
        System.out.println(ast);
        System.out.println(slash);

        s.close();
    }




static  int readInt(Scanner s  , String details){

    System.out.println(details);
    if (s.hasNextInt()) {
        return s.nextInt();
    }

    else
        System.out.println("Enter only interger");
    System.exit(0);
    return -1;
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
        return div1/div2;
    }
}
