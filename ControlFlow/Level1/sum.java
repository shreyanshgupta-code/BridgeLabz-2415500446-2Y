import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.print("enter the vale of n: ");
        n=scanner.nextInt();
        if(n>=0){
            int i=0,sumwhile=0;
            while(i<=n){
              sumwhile+=i;
              i++;  
            }
            System.out.println("sum of number using while loop is: "+sumwhile);
            int sum=(n*(n+1))/2;
            System.out.print("sum of number using formula is: "+sum);
        }
        scanner.close();
    }
}
