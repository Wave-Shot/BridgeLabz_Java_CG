import java.util.Scanner;

public class ChocolatesDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chocolates = sc.nextInt();
        int children = sc.nextInt();

        int each = chocolates / children;
        int remaining = chocolates % children;

        System.out.println("The number of chocolates each child gets is " + each + " and the number of remaining chocolates are " + remaining);
    }
}
