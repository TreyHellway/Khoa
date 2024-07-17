public class Upper {
    public static void main(String[] args) {
        String input = "hello world";
        String capitalized = Upper(input);
        System.out.println(capitalized); // Output: Hello World
    }

    public static String Upper(String str) {
        // Split the input string into words
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                sb.append(" "); // Add space between words
            }
            // Capitalize the first letter of each word
            sb.append(Character.toUpperCase(words[i].charAt(0)));
            if (words[i].length() > 1) {
                sb.append(words[i].substring(1)); // Add the rest of the word
            }
        }

        return sb.toString();
    }
}
