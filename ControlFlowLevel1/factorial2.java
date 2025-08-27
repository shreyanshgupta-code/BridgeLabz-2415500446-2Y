import java.util.Scanner;
public class factorial2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n,factorial=1;
        System.out.print("enter value of n: ");
        n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.print("factorial of entered number is :"+factorial);
        scanner.close();
    }
}
