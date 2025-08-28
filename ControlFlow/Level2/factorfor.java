import java.util.Scanner;
public class factorfor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.print("enter the number:");
        number=scanner.nextInt();
        for(int i=1;i<number;i++){
            if(number%i==0){
                System.out.print(i+" ");
            }
        }
        scanner.close();
    }
}
