import java.util.Scanner;

public class grade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        int[][] marks = new int[n][3];  
        float[] percentage = new float[n];
        char[] grade = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.print("Physics: ");
            marks[i][0] = scanner.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = scanner.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = scanner.nextInt();
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0f;
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }
        System.out.println("Results:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " :");
            System.out.println("Physics = " + marks[i][0]);
            System.out.println("Chemistry = " + marks[i][1]);
            System.out.println("Maths = " + marks[i][2]);
            System.out.println("Percentage = " + percentage[i]);
            System.out.println("Grade = " + grade[i]);
        }

        scanner.close();
    }
}
