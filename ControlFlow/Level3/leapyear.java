import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year;
        System.out.print("Enter the year:");
        year=scanner.nextInt();
        if(year<1582){
            System.out.print("year should not be less than 1582");
        }
        else{
            if(year%400==0){
                System.out.println("year is a leap year");
            }
            else if(year%100==0){
                System.out.println("year is not a leap year");
            }
            else if(year%4==0){
                System.out.println("year is a leap year");
            }
            else{
                System.out.println("year is not a leap year");
            }

        }
        scanner.close();
    }
}
