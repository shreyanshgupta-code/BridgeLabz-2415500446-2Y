import java.util.Scanner;
public class quotientremainder{
    public static int[] findRemainderAndQuoitent(int number,int divisor){
        int quotient=number/divisor;
        int remainder=number%divisor;
        return new int[]{quotient,remainder};
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number,divisor;
        System.out.print("enter number : ");
        number=scanner.nextInt();
        System.out.print("enter divisor : ");
        divisor=scanner.nextInt();
        int[] result=findRemainderAndQuoitent(number, divisor);
        System.out.println("quotient is : "+result[0]);
        System.out.print("remainder is : "+result[1]);
        scanner.close();
    }
}