import java.util.Scanner;
public class powerwhile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number,power,result=1;
        System.out.print("enter the number:");
        number=scanner.nextInt();
        System.out.print("enter the power:");
        power=scanner.nextInt();
        int counter=0;
        while(counter<power){
            result=result*number;
            counter++;
        }
        System.out.print("power of "+number+" to power "+power+" is "+result);
        scanner.close();
    }
}
