import java.util.Scanner;
public class sumtillzeronegative {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double total=0.0;
        while (true) {
            System.out.print("enter the number: ");
            double number=scanner.nextDouble();
            if(number<=0){
                break;
            }
            total+=number;
        } 
        System.out.print("sum of entered number is:"+total);
        scanner.close();  
    }
}
