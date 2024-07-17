import java.util.Scanner;

public class Exercise6 {

    public static char firstNonRepeatingChar(String str) {
        int[] charCount = new int[256];//ASCII có 256 kí tự

        // Đếm tần suất xuất hiện của từng kí tự trong string
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        // Dùng for lần nữa để tìm kí tự đầu tiên có count = 1
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return '\0';// Nếu không có từ nào lặp thì trả về n ull = \0
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char result = firstNonRepeatingChar(input);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
