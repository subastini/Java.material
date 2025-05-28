package A1_Java.Ex_11_Functions;

public class Ex_03_Return_string {

    public static void main(String[] args) {

      String s = return_type(); // calling return_type and storing in s
      Float f = return_float();
      Long l = longf();

        System.out.println(s);
        System.out.println(f);
        System.out.println(l);

    }

    static String return_type(){
        return "Stini";
    }

    static float return_float(){
        return 100f;
    }

    static long longf(){
        return 98765441l;
    }

    //  if not return use void
    // static long longf(){
    // static void fuc() {

}
