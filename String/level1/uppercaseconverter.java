import java.util.Scanner;
public class uppercaseconverter {
    public static String customToUpperCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        String custom = customToUpperCase(text);
        String builtIn = text.toUpperCase();
        System.out.println("Custom uppercase: " + custom);
        System.out.println("Built-in uppercase: " + builtIn);
        System.out.println("Are both equal? " + compareStrings(custom, builtIn));
        scanner.close();
    }
}
