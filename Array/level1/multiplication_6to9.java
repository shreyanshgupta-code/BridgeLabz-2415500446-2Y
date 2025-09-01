import java.util.Scanner;
public class multiplication_6to9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.print("enter the number :");
        number=scanner.nextInt();
        int [] table=new int[4];
        for(int i=6;i<=9;i++){
            table[i-6]=number*i;
        }
        System.out.println("multiplication table of number "+number+" from (6 to 9) is :");
        for(int i=6;i<=9;i++){
            System.out.println(number+" * "+i+" = "+table[i-6]);
        }
        scanner.close();      
    }
}
