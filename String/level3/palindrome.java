import java.util.Scanner;
public class palindrome {
    public static boolean isPalindrome1(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }
    public static boolean isPalindrome2(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindrome2(text, start + 1, end - 1);
    }

    public static boolean isPalindrome3(String text) {
        char[] arr = text.toCharArray();
        char[] rev = new char[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = text.charAt(arr.length - 1 - i);
        for (int i = 0; i < arr.length; i++) if (arr[i] != rev[i]) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("Logic 1: " + isPalindrome1(text));
        System.out.println("Logic 2: " + isPalindrome2(text, 0, text.length() - 1));
        System.out.println("Logic 3: " + isPalindrome3(text));
        scanner.close();
    }
}
