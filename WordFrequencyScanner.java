import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class WordFrequencyScanner {
    public static void main(String[] args) {
        
        String filePath = "input.txt";
        HashMap<String, Integer> freq = new HashMap<>();
        try {
            Scanner sc = new Scanner(new File(filePath));

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                line = line.toLowerCase().replaceAll("[^a-z0-9 ]", " ");
                String[] words = line.split("\\s+");
                for (String w : words) {
                    if (w.length() == 0) continue;
                    freq.put(w, freq.getOrDefault(w, 0) + 1);
                }
            }
            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(freq);
    }
}
