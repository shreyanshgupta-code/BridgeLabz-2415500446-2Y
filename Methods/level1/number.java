import java.util.Scanner;
public class number{
    static int num(int num){
        if(num<0){
            return -1;
        }
        else if(num==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int number;
    System.out.print("enter the number : ");
    number=scanner.nextInt();
    if(number<0){
        System.out.print("negative");
    }
    else if(number==0){
        System.out.print("zero");
    }
    else{
        System.out.print("positive");
    }
    scanner.close();
    }
}