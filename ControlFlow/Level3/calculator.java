import java.util.Scanner;
public class calculator{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double number1,number2;
        System.out.print("enter the number1: ");
        number1=scanner.nextDouble();
        System.out.print("enter the number2: ");
        number2=scanner.nextDouble();
        String op;
        System.out.print("enter the symbol (+,-,*,/): ");
        op=scanner.next();
        switch (op) {
            case "+":
                System.out.println("addition of both number is : "+(number1+number2));
                break;
            case "-":
                System.out.println("subtraction of both number is : "+(number1-number2));
                break;
            case "*":
                System.out.println("multiplication of both number is : "+(number1*number2));
                break;
            case "/":
                System.out.println("division of both number is : "+(number1/number2));
                break;
            default:
                System.out.println("enter valid operator");
                break;
        }
        scanner.close();
    }
}