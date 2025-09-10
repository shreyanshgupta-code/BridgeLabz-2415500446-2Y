import java.util.Scanner;

public class chararraycompare {
    public static char[] customToCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static boolean compareArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();

        char[] custom = customToCharArray(text);
        char[] builtIn = text.toCharArray();

        System.out.print("Custom array: ");
        for (char c : custom) System.out.print(c + " ");
        System.out.println();

        System.out.print("Built-in array: ");
        for (char c : builtIn) System.out.print(c + " ");
        System.out.println();

        System.out.println("Are both arrays equal? " + compareArrays(custom, builtIn));
        scanner.close();
    }
}
