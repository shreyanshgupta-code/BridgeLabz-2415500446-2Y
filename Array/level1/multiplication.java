import java.util.Scanner;
public class multiplication{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.print("enter the number: ");
        number=scanner.nextInt();
        int [] table=new int[10];
        for(int i=1;i<=10;i++){
            table[i-1]=number*i;
        }
        System.out.print("multiplication table of number "+number+" is : ");
        for(int i=0;i<10;i++){
            System.out.println(number+" * "+(i+1)+" = "+table[i]);
        }
        scanner.close();
    }
}