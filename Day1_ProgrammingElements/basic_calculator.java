import java.util.Scanner;
public class basic_calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double number1,number2;
        System.out.print("Enter number1 : ");
        number1=scanner.nextDouble();
        System.out.print("Enter number2 : ");
        number2=scanner.nextDouble();
        double addition,subtraction,multiplication,division;
        addition=number1+number2;
        subtraction=number1-number2;
        multiplication=number1*number2;
        division=number1/number2;
        System.out.print("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+addition +" ,"+subtraction+" , "+multiplication+",  and "+division);
        scanner.close();
    }
}
