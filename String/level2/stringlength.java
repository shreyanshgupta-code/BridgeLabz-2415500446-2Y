import java.util.Scanner;
public class stringlength {
    public static int customLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();
        int customLen = customLength(text);
        int builtInLen = text.length();
        System.out.println("Custom length: " + customLen);
        System.out.println("Built-in length: " + builtInLen);
        scanner.close();
    }
}
