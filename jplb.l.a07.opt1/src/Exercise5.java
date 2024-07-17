import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String originalString = scanner.nextLine();

        // Đảo string bằng stringbuilder
        String reversedString = new StringBuilder(originalString).reverse().toString();

        System.out.println("Reversed string: " + reversedString);
    }
}
