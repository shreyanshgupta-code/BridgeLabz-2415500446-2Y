import java.util.Scanner;

public class substringcompare {
    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
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
        System.out.print("Enter a string: ");
        String text = scanner.next();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        String custom = customSubstring(text, start, end);
        String builtIn = text.substring(start, end);

        System.out.println("Custom substring: " + custom);
        System.out.println("Built-in substring: " + builtIn);
        System.out.println("Are they equal? " + compareStrings(custom, builtIn));
        scanner.close();
    }
}
