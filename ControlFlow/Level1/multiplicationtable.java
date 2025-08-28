import java.util.Scanner;
public class multiplicationtable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.print("enter the number: ");
        number=scanner.nextInt();
        for(int i=1;i<=10;i++){
            int table=number*i;
            System.out.println(number+" * "+i+" = "+table);
        }
        scanner.close();
    }
}
