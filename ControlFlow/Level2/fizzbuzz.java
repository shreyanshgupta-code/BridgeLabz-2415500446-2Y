import java.util.Scanner;
public class fizzbuzz {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.print("enter the number: ");
        number=scanner.nextInt();
        if(number<0){
            System.out.print("not a positive number");
        }
        else{
            for(int i=1;i<=number;i++){
                if(i%3==0 && i%5==0){
                    System.out.println("FizzBuzz");
                }
                else if(i%3==0){
                    System.out.println("Fizz");
                }
                else if(i%5==0){
                    System.out.println("Buzz");
                }
                else{
                    System.out.println(i);                }
            }
        }
        scanner.close();
    }
}