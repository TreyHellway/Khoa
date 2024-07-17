import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        String result = removeDuplicates(string);

        System.out.println(result);
    }

    public static String removeDuplicates(String str) {
        // Thiết lập boolean array để theo dõi các kí tự đã đánh dấu
        boolean[] seen = new boolean[256]; // Có 256 kí tự trong bảng mã ASCII
        StringBuilder sb = new StringBuilder();//tạo String mới bằng StringBuilder

        for (char c : str.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true; // Đánh dấu là thấy lần đầu
                sb.append(c); // đưa kí tự "c" vào string mới "sb" bằng .append
            }
        }
        return sb.toString();
    }
}
