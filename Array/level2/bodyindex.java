import java.util.Scanner;

public class bodyindex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = scanner.nextInt();
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            System.out.print("Enter height (meters): ");
            height[i] = scanner.nextDouble();
            System.out.print("Enter weight (kg): ");
            weight[i] = scanner.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] <= 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        System.out.println("BMI Report : ");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + height[i] + " m");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.printf("BMI: %.2f%n", bmi[i]);
            System.out.println("Status: " + status[i]+"\n");
        }

        scanner.close();
    }
}
