package A1_Java.Ex_11_Functions;

import java.util.Scanner;

public class Ex_05_4types {
    public static void main(String[] args) {

        // without parameter and without return type
        // without parameter but with return type
        // with parameter and without return type
        // with parameter and with return type

        wop_wor();

        String a = wop_wr();
        System.out.println(wop_wr());

       // wp_wor("Vicky", 29,53.5f);

        Scanner s = new Scanner(System.in);

        System.out.println("Enter name");
        String n = s.next();

        System.out.println("Enter age");
        int i = s.nextInt();

        System.out.println("Enter height");
        float f = s.nextFloat();
         wp_wor(n,i,f);

String s1 = wp_wr("Subastini " , "Logendran");
        System.out.println(s1);

       more(28);

long L1= fam_num(9047581238l);
        System.out.println(L1);

    }

    // 1.without parameter and without return type

    static void wop_wor() {
        System.out.println(" 1  First declaration");
    }

    // 2.without parameter but with return type

    static String wop_wr() {
        return " 2  Hi, how are you";
    }

    // 3.with parameter and without return type (No return type --> void)
    static void wp_wor(String name, int age, float height ) {

    }

    // 4.with parameter and with return type
    static String wp_wr(String f_n, String l_n) {
        return f_n + l_n;

    }

    // 4.1

    static void more (int weight){
        System.out.println("you weight is " + weight);

    }

    //4.2

    static long fam_num(long mother){
        return mother;
    }
}


