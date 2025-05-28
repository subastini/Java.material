package Ex_100_Programs;

public class Ex_01_Type_of_triangle {
    public static void main(String[] args) {


        int side1 = 10;
        int side2 = 20;
        int side3 = 10;

        if (side1 + side2 > side3 || side2 + side3 > side1 || side3 + side1 > side1 || side1 + side2 < side3 || side2 + side3 < side1 || side3 + side1 < side1) {

            if (side1 == side2 && side1 == side3) {
                System.out.println("Acute three sides are equal");
            } else if (side1 == side2 || side2 == side3 || side3 == side1) {
                System.out.println("Iso 2sides are equal");
            } else {
                System.out.println("Scale three sides are different");
            }
        } else {
            System.out.println("Not an triangle");
        }

    }
}
