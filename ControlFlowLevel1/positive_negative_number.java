import java.util.Scanner;
public class positive_negative_number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.print("enter the number: ");
        number=scanner.nextInt();
        if(number>0){
            System.out.print("positive");
        }
        else if(number<0){
            System.out.print("negative");
        }
        else{
            System.out.print("zero");
        }
        scanner.close();
    }
}
