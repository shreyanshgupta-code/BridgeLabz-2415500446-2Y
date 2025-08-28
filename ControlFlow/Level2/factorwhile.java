import java.util.Scanner;
public class factorwhile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.print("enter the number:");
        number=scanner.nextInt();
        int i=1;
        while(i!=number){
            if(number%i==0){
                System.out.print(i+" ");
            }
            i++;
        }
        scanner.close();
    }
}
