import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[] phy = new int[n];
        int[] chem = new int[n];
        int[] math = new int[n];
        float[] percentage = new float[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.print("Physics: ");
            phy[i] = scanner.nextInt();
            System.out.print("Chemistry: ");
            chem[i] = scanner.nextInt();
            System.out.print("Maths: ");
            math[i] = scanner.nextInt();

            int total = phy[i] + chem[i] + math[i];
            percentage[i] = total / 3.0f;

            if (percentage[i] >= 80){
                grade[i] = 'A';
            }
            else if (percentage[i] >= 70){
                grade[i] = 'B';
            }
            else if (percentage[i] >= 60){
                grade[i] = 'C';
            }
            else if (percentage[i] >= 50){
                grade[i] = 'D';
            }
            else if (percentage[i] >= 40){
                grade[i] = 'E';
            }
            else{
                grade[i] = 'R';
            }
        }

        System.out.println("Results:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " : " );
            System.out.println("Physics=" + phy[i]);
            System.out.println("Chem=" + chem[i]);
            System.out.println("Math=" + math[i]);
            System.out.println( "percentage=" + percentage[i]);
            System.out.println("Grade=" + grade[i]);
        }

        scanner.close();
    }
}