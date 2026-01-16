import java.util.Scanner;

public class NumberFormatDemo {
    static void generateException(String text) {
        Integer.parseInt(text);
    }

    static void handleException(String text) {
        try {
            Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException Handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException Handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception Generated");
        }
        handleException(text);
    }
}
