import java.util.Scanner;
public class sum {
    static int add(int n){
        int addition=0;
        for(int i=0;i<=n;i++){
            addition+=i;
        }
        return addition;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.print("enter the number : ");
        n=scanner.nextInt();
        add(n);
        System.out.print("addition of "+n+" numbers is : "+add(n));
        scanner.close();
    }
}
