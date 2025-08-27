import java.util.Scanner;

public class smallest_number_checker2 {
     public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double number1,number2,number3;
        System.out.print("enter the number1: ");
        number1=scanner.nextDouble();
        System.out.print("enter the number2: ");
        number2=scanner.nextDouble();
        System.out.print("enter the number3: ");
        number3=scanner.nextDouble();
        if(number1<number2 && number1<number3){
            System.out.println("Is the first number the smallest? Yes ");
        }
        else{
            System.out.println("Is the first number the smallest? No "); 
        }
        if(number2<number1 && number2<number3){
            System.out.println("Is the second number the smallest? Yes ");
        }
        else{
            System.out.println("Is the second number the smallest? No "); 
        }
        if(number3<number1 && number3<number2){
            System.out.println("Is the third number the smallest? Yes "); 
        }
        else{
            System.out.println("Is the third number the smallest? No "); 
        }
        scanner.close();
    }
}
