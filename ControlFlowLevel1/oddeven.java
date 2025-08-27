import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.print("enter the number: ");
        number=scanner.nextInt();
        for(int i=1;i<=number;i++){
            if(i%2==0){
                System.out.println("Even number");
            }
            else{
                System.out.println("Odd number");
            }
        }
        scanner.close();
    }
}
