import java.util.Scanner;
public class smallestlargest {
    public static int[] findSmallestandLargest(int number1,int number2,int number3){
        int maximum=number1;
        int minimum=number1;
        if(number2<minimum){
            minimum=number2;
        }
        if(number3<minimum){
            minimum=number3;
        }
        if(number2>maximum){
            maximum=number2;
        }
        if(number3>maximum){
            maximum=number3;
        }
        return new int[]{maximum,minimum};
    }
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter number1 : ");
        num1=scanner.nextInt();
        System.out.print("enter number2 : ");
        num2=scanner.nextInt();
        System.out.print("enter number3 : ");
        num3=scanner.nextInt();
        int[] result=findSmallestandLargest(num1, num2, num3);
        System.out.println("maximum number is : "+result[0]);
        System.out.print("minimum number is : "+result[1]);
        scanner.close();
    }
}
