import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String fromCity = sc.nextLine();
        String viaCity = sc.nextLine();
        String toCity = sc.nextLine();

        double fromToVia = sc.nextDouble();
        double viaToFinalCity = sc.nextDouble();
        double timeTaken = sc.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;

        System.out.println("The distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " miles and took " + timeTaken + " hours");
    }
}
