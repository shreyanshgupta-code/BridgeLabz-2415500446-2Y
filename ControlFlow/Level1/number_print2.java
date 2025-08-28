import java.util.Scanner;
public class number_print2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int counter,i;
        System.out.print("Enter counter: ");
        counter=scanner.nextInt();
        for(i=counter;i>=1;i--){
            System.out.println(i);
        }
        scanner.close();
    }
    
}
