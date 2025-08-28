import java.util.Scanner;
public class powerfor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number,power,result=1;
        System.out.print("enter the number:");
        number=scanner.nextInt();
        System.out.print("enter the power:");
        power=scanner.nextInt();
        for(int i=1;i<=power;i++){
            result=result*number;
        }
        System.out.print("power of "+number+" to power "+power+" is "+result);
        scanner.close();
    }
}
