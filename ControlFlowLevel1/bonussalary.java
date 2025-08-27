import java.util.Scanner;
public class bonussalary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in); 
        int salary,years;
        System.out.print("enter your salary: ");
        salary=scanner.nextInt();
        System.out.print("enter the years: ");
        years=scanner.nextInt();
        if(years>5){
            double bonus=(5*salary)/100;
            System.out.print("bonus salary is: "+bonus);
        } 
        else{
            System.out.print("you are not eligible");
        }
        scanner.close();
    }
}
