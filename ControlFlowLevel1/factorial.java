import java.util.Scanner;;
public class factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n,factorial=1;
        System.out.print("enter value of n: ");
        n=scanner.nextInt();
        int i=1;
        while(i<=n){
            factorial=factorial*i;
            i++;
        }
        System.out.print("factorial of entered number is :"+factorial);
        scanner.close();
    }
}
