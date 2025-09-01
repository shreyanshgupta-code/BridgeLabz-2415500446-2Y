import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.print("enter the size : ");
        number=scanner.nextInt();
        if(number<=0){
            System.out.print("it is not natural number");
        }
        int [] odd=new int[(number/2)+1];
        int [] even=new int[(number/2)+1];
        int evenindex=0,oddindex=0;
        for(int i=1;i<=number;i++){
            if(i%2==0){
                even[evenindex]=i;
                evenindex++;
            }
            else{
                odd[oddindex]=i;
                oddindex++;
            }
        }
        System.out.print("odd numbers : ");
        for(int i=0;i<oddindex;i++){
            System.out.print(odd[i]+" ");
        }
        System.out.println("");
        System.out.print("even numbers : ");
        for(int i=0;i<evenindex;i++){
            System.out.print(even[i]+" ");
        }
        scanner.close();
    }
}
