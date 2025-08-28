import java.util.Scanner;
public class sumtillzero {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double total=0.0,value;
        System.out.print("enter the value: ");
        value=scanner.nextDouble();
        while(value!=0){
            total+=value;
            System.out.print("enter the value: ");
            value=scanner.nextDouble();
        }
        System.out.print("The sum of the numbers entered is: " + total);
        scanner.close();
    }
}
