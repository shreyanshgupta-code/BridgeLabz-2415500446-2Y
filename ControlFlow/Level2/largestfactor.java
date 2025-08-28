import java.util.Scanner;
public class largestfactor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.print("enter the number:");
        number=scanner.nextInt();
        int greatestfactor=1;
        if(number<0){
            System.out.print("please enter positive number: ");
        }
        else{
            for(int i=number-1;i>=1;i--){
            if(number%i==0){
                greatestfactor=i;
                break;
            }
        }
        }
        System.out.print("Greatest factor of "+number+" is "+greatestfactor);
        scanner.close();
    }
}
