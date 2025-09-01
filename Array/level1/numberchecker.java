import java.util.Scanner;
public class numberchecker {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size;
        System.out.print("enter the size: ");
        size=scanner.nextInt();
        int [] number=new int[size];
        for(int i=0;i<number.length;i++){
            number[i]=scanner.nextInt();
        }
        for(int i=0;i<number.length;i++){
            if(number[i]<0){
                System.out.println("negative");
            }
            else if(number[i]==0){
                System.out.println("zero");
            }
            if(number[i]>0){
                System.out.println("positive");
            }
        }
        int first=number[0];
        int last=number[number.length-1];
        if(first>last){
            System.out.print("first element "+first+" is greater than last element "+last);
        }
        else if(first==last){
            System.out.print("first element "+first+" and last element "+last+" are equal");
        }
         else if(first<last){
            System.out.print("first element "+first+" is less than last element "+last);
        }
        scanner.close();
    }
}
