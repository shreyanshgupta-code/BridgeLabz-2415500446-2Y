import java.util.Scanner;
public class abundantnumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number,sum=0;
        System.out.print("enter the number: ");
        number=scanner.nextInt();
        int orignalnumber=number;
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        if(sum>orignalnumber){
            System.out.print("it is an abundant number");
        }
        else{
            System.out.print("it is not an abundant number");
        }
        scanner.close();
    }
}
