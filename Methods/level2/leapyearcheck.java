import java.util.Scanner;
public class leapyearcheck {
    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        System.out.println(year + (isLeapYear(year) ? " is a Leap Year" : " is NOT a Leap Year"));
        scanner.close();
    }
}