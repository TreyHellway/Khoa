import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Loại/Thay thế khoảng cách \\s trong string = ""
        String stringWithoutSpaces = input.replaceAll("\\s", "");

        System.out.println("String without spaces: " + stringWithoutSpaces);
    }
}
