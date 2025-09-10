import java.util.Scanner;

public class firstnonrepeating {
    public static char firstNonRepeating(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) return text.charAt(i);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        char result = firstNonRepeating(text);
        if (result != 0) System.out.println("First non-repeating char: " + result);
        else System.out.println("No non-repeating character found.");
        scanner.close();
    }
}

