import java.util.Scanner;
public class leapyear2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the year: ");
        int year;
        year=scanner.nextInt();
        if(year<1582){
            System.out.print("Year should not be less than 1582");
        }
        else{
            if((year%4==0 && year%100!=0) || (year%400==0)){
                System.out.print("year is a leap year");
            }
            else{
                System.out.print("year is not a leap year");
            }
        }
        scanner.close();
    }
}
