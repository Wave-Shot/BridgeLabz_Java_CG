import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    static void generateException(String text) {
        text.charAt(text.length());
    }

    static void handleException(String text) {
        try {
            text.charAt(text.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException Handled");
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
