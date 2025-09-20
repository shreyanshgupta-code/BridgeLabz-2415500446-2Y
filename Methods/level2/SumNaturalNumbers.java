import java.util.Scanner;
public class SumNaturalNumbers {
    public static int recursiveSum(int n) {
        if (n == 1) {  // base case
            return 1;
        }
        return n + recursiveSum(n - 1);
    }
    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (>0).");
        } else {
            int sumRecursive = recursiveSum(n);
            int sumFormula = formulaSum(n);
            System.out.println("Sum of first " + n + " natural numbers using recursion: " + sumRecursive);
            System.out.println("Sum of first " + n + " natural numbers using formula: " + sumFormula);
            if (sumRecursive == sumFormula) {
                System.out.println("Results match for both methods");
            } else {
                System.out.println("Results do not match for both methods");
            }
        }
        sc.close();
    }
}
