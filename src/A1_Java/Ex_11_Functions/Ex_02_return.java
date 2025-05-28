package A1_Java.Ex_11_Functions;

public class Ex_02_return {
    public static void main(String[] args) {

        int a = return_type();
        System.out.println(a);
    }

  static void non_return(){
        System.out.println("Hi");

    }
    static int return_type(){
        System.out.println("Hello");
        return 100;
    }
}
