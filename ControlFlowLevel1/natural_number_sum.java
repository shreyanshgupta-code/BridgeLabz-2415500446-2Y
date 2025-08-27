import java.util.Scanner;
public class natural_number_sum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.print("enter the n: ");
        n=scanner.nextInt();
        if(n>=0){
            long sum=(n*(n+1))/2;
            System.out.print("The sum of "+n+" natural numbers is "+sum);
        }
        else{
            System.out.print("The number "+n+" is not a natural number");
        }
        scanner.close();
    }
}
