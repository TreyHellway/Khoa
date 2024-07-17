import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        //Dùng .length để lấy chiều dài string
        int length = string.length();

        System.out.println("The length of " + string + " is: " + length);
    }
}
