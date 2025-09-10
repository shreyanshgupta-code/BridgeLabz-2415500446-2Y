import java.util.Scanner;

public class shortestlongestword {
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

        // Last word
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

    public static int[] findShortestLongest(String[][] wordLen) {
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < wordLen.length; i++) {
            int len = Integer.parseInt(wordLen[i][1]);
            if (len < Integer.parseInt(wordLen[minIndex][1])) {
                minIndex = i;
            }
            if (len > Integer.parseInt(wordLen[maxIndex][1])) {
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        String[] words = customSplit(text);
        String[][] wordLen = wordWithLength(words);
        int[] result = findShortestLongest(wordLen);

        System.out.println("\nWord\tLength");
        System.out.println("");
        for (int i = 0; i < wordLen.length; i++) {
            System.out.println(wordLen[i][0] + "\t" + Integer.parseInt(wordLen[i][1]));
        }

        System.out.println("\nShortest word: " + wordLen[result[0]][0] + " (" + wordLen[result[0]][1] + ")");
        System.out.println("Longest word: " + wordLen[result[1]][0] + " (" + wordLen[result[1]][1] + ")");
        scanner.close();
    }
}
