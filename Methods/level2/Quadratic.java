import java.util.Scanner;

public class Quadratic {

    // Method to find the roots of quadratic equation ax^2 + bx + c = 0
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            // One real root
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // No real roots
            return new double[]{}; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input values for a, b, c
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();
        double[] roots = findRoots(a, b, c);
        if (roots.length == 2) {
            System.out.println("Two real roots: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("One real root: " + roots[0]);
        } else {
            System.out.println("No real roots (delta < 0).");
        }
        sc.close();
    }
}
