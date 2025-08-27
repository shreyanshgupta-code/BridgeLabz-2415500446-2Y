import java.util.Scanner;
public class divisibility_check {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.print("enter the number: ");
        number=scanner.nextInt();
        if(number%5==0){
            System.out.println("Is the number "+number+" divisible by 5? YES");
        }
        else{
            System.out.println("Is the number "+number+" divisible by 5? NO");
        }
        scanner.close();
    }
}
