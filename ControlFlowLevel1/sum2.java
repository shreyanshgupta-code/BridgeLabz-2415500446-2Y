import java.util.Scanner;

public class sum2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.print("enter the vale of n: ");
        n=scanner.nextInt();
        if(n>=0){
            int i,sumfor=0;
           for(i=0;i<=n;i++){
            sumfor+=i;
           }
            System.out.println("sum of number using for loop is: "+sumfor);
            int sum=(n*(n+1))/2;
            System.out.print("sum of number using formula is: "+sum);
        }
        scanner.close();
    }
}
