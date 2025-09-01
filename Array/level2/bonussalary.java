import java.util.Scanner;

public class bonussalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter salary for Employee " + i + ": ");
            double salary = scanner.nextDouble();
            System.out.print("Enter years of service for Employee " + i + ": ");
            double years = scanner.nextDouble();
            double bonus;
            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }
            double newSalary = salary + bonus;
            totalOldSalary += salary;
            totalBonus += bonus;
            totalNewSalary += newSalary;
            System.out.println("Old Salary: " + salary);
            System.out.println("Bonus: " + bonus);
            System.out.println("New Salary: " + newSalary);
            System.out.println();
        }
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
        scanner.close();
    }
}
