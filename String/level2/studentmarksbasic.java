import java.util.Random;
public class studentmarksbasic {
    public static void main(String[] args) {
        Random rand = new Random();
        int students = 5;
        int phy[] = new int[students];
        int chem[] = new int[students];
        int math[] = new int[students];
        int total[] = new int[students];
        double average[] = new double[students];
        double percentage[] = new double[students];
        char grade[] = new char[students];
        for (int i = 0; i < students; i++) {
            phy[i] = rand.nextInt(41) + 60;
            chem[i] = rand.nextInt(41) + 60;
            math[i] = rand.nextInt(41) + 60;
            total[i] = phy[i] + chem[i] + math[i];
            average[i] = total[i] / 3.0;
            percentage[i] = (total[i] / 300.0) * 100;
            if (percentage[i] >= 80) grade[i] = 'A';
            else if (percentage[i] >= 70) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 50) grade[i] = 'D';
            else if (percentage[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }
        System.out.println("Student  Physics  Chemistry  Maths  Total  Average  Percentage  Grade");
        for (int i = 0; i < students; i++) {
            System.out.println((i + 1) + "\t  " + phy[i] + "\t     " + chem[i] + "\t      " + math[i]
                    + "\t   " + total[i] + "\t  " + average[i] + "\t   " + percentage[i] + "\t     " + grade[i]);
        }
    }
}

