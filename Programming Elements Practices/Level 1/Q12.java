import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base = input.nextDouble();
        double height = input.nextDouble();

        double areaSquareInches = 0.5 * base * height;
        double areaSquareCentimeters = areaSquareInches * 2.54 * 2.54;

        System.out.println(
                "The area of the triangle in square inches is " + areaSquareInches +
                        " and in square centimeters is " + areaSquareCentimeters
        );
    }
}
