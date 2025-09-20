import java.util.Scanner;
public class chocolatedistribution {
    public static int[] findRemainderAndQuoitent(int number,int divisor){
        int quotient=number/divisor;
        int remainder=number%divisor;
        return new int[]{quotient,remainder};
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int chocolate,student;
        System.out.print("enter chocolate : ");
        chocolate=scanner.nextInt();
        System.out.print("enter student : ");
        student=scanner.nextInt();
        int[] result=findRemainderAndQuoitent(chocolate, student);
        System.out.println("no of chocolate each child get is : "+result[0]);
        System.out.print("chocolate remained : "+result[1]);
        scanner.close();
    }
}
