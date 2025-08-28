import java.util.Scanner;
public class countdigit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number,digit=0;
        System.out.print("enter the number : ");
        number=scanner.nextInt();
        if(number==0){
            System.out.print("total digit in number : 1");
        }
        else{
            while(number!=0){
            int a=number/10;
            number=a;
            digit+=1;
        }
        System.out.print("total digit in number : "+digit);
        scanner.close();
        }
    }
}
