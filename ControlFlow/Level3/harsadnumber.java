import java.util.Scanner;
public class harsadnumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number,sum=0,orignalnumber;
        System.out.print("enter the number : ");
        number=scanner.nextInt();
        orignalnumber=number;
        while(orignalnumber!=0){
            int a=orignalnumber/10;
            int rem=orignalnumber%10;
            orignalnumber=a;
            sum+=rem;
        }
        if(number%sum==0){
            System.out.print("it is an harsad number");
        }
        else{
            System.out.print("it is not an harsad number");
        }
        scanner.close();
    }
}
