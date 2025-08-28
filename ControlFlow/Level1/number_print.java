import java.util.Scanner;
public class number_print {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int counter;
        System.out.print("Enter counter: ");
        counter=scanner.nextInt();
        while(counter>=1){
            System.out.println(counter);
            counter--;
        }
        scanner.close();
    }
}
