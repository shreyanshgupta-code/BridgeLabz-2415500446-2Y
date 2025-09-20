import java.util.Scanner;
public class simpleintrest{
    static void si(){
        Scanner scanner=new Scanner(System.in);
        double p,r,t;
        System.out.print("enter principal amount : ");
        p=scanner.nextDouble();
        System.out.print("enter rate : ");
        r=scanner.nextDouble();
        System.out.print("enter time : ");
        t=scanner.nextDouble();
        double si=(p*r*t)/100;
        System.out.print("simple intrest : "+si);
        scanner.close();
    }
    public static void main(String[] args) {
        si();
    }
}