import java.util.Scanner;
public class wordlength2d {
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
        String[] words = new String[wordCount];
        int start = 0, w = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) {
                    word += str.charAt(j);
                }
                words[w++] = word;
                start = i + 1;
            }
        }
        String word = "";
        for (int j = start; j < length; j++) {
            word += str.charAt(j);
        }
        words[w] = word;
        return words;
    }
    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(customLength(words[i]));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        String[] words = customSplit(text);
        String[][] wordLen = wordWithLength(words);
        System.out.println("\nWord\tLength");
        System.out.println("");
        for (int i = 0; i < wordLen.length; i++) {
            System.out.println(wordLen[i][0] + "\t" + Integer.parseInt(wordLen[i][1]));
        }
        scanner.close();
    }
}
