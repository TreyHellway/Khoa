import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter string 2: ");
        String string2 = scanner.nextLine();

        int result = compareStringsIgnoreCase(string1, string2);

        if (result == 0) {
            System.out.println("\"" + string1 + "\" is equal to \"" + string2 + "\"");
        } else if (result < 0) {
            System.out.println("\"" + string1 + "\" is lexicographically less than \"" + string2 + "\"");
        } else {
            System.out.println("\"" + string1 + "\" is lexicographically greater than \"" + string2 + "\"");
        }
    }

    public static int compareStringsIgnoreCase(String str1, String str2) {
        return str1.compareToIgnoreCase(str2);
    }
}
