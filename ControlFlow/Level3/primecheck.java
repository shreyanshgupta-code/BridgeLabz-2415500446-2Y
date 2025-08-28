import java.util.Scanner;
public class primecheck {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.print("enter the number : ");
        number=scanner.nextInt();
        boolean isprime=true;
        if(number<=1){
            isprime=false;
        }
        else{
            for(int i=2;i<number;i++){
                if(number%i==0){
                    isprime=false;
                    break;
                }
            }
        }
        if(isprime){
            System.out.print("number is prime number");
        }
        else{
            System.out.print("number is not prime");
        }
        scanner.close();
    }
}
