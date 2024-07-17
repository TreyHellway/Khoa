import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        //Dùng .toUpperCase để viết hoa hết string
        String upperCaseString = input.toUpperCase();

        System.out.println(upperCaseString);
    }
}
