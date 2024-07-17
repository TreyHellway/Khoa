import java.util.Scanner;

public class CBBinToDec {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary: ");
        String binaryString = scanner.nextLine();
        long decimal = BinToDec(binaryString);
        System.out.println("Binary " + binaryString + " in decimal is " + decimal);
    }

    public static long BinToDec(String str) {
        int decimal = 0;
        int power = 0;

        // Dò chuỗi binary ừ phải sang trái
        for (int i = str.length() - 1; i >= 0; i--) {
            // '1' tại thứ i có giá trị 2^i
            if (str.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }
}
