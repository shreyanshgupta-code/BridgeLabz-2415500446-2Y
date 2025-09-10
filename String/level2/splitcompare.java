import java.util.Scanner;

public class splitcompare {
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
    public static String[] customSplit(String str) {
        int length = customLength(str);
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') wordCount++;
        }
        int[] spaces = new int[wordCount + 1];
        int idx = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaces[idx++] = i;
            }
        }
        spaces[idx] = length; 
        String[] words = new String[wordCount];
        int start = 0;
        int w = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = spaces[i];
            String word = "";
            for (int j = start; j < end; j++) {
                word += str.charAt(j);
            }
            words[w++] = word;
            start = end + 1;
        }
        return words;
    }

    public static boolean compareArrays(String[] a1, String[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals(a2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        String[] custom = customSplit(text);
        String[] builtIn = text.split(" ");

        System.out.print("Custom split: ");
        for (String w : custom) System.out.print("[" + w + "] ");
        System.out.println();

        System.out.print("Built-in split: ");
        for (String w : builtIn) System.out.print("[" + w + "] ");
        System.out.println();

        System.out.println("Are both equal? " + compareArrays(custom, builtIn));
        scanner.close();
    }
}
