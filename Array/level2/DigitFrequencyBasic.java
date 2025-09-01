import java.util.Scanner;

public class DigitFrequencyBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            number = -number;
        }
        int[] freq = new int[10];
        while (number > 0) {
            int digit = number % 10;  
            freq[digit]++;            
            number = number / 10;     
        }
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " = " + freq[i]);
            }
        }
        scanner.close();
    }
}
