import java.util.Scanner;
public class largestfactor2 {
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
            int counter=number-1;
            while(counter!=1){
            if(number%counter==0){
                greatestfactor=counter;
                break;
            }
            counter--;
        }
        }
        System.out.print("Greatest factor of "+number+" is "+greatestfactor);
        scanner.close();
    }
}
