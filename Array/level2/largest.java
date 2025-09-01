import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the number : ");
        int number=scanner.nextInt();
        int maxdigit=10;
        int [] digit=new int[maxdigit];
        int index=0;
        while(number!=0){
            int a=number/10;
            int rem=number%10;
            digit[index]=rem;
            number=a;
            index++;
            if(index==maxdigit){
            break;
            }
        }
        int max=digit[0];
        int secondmax=digit[0];
        for(int i=0;i<maxdigit;i++){
            if(digit[i]>max){
                secondmax=max;
                max=digit[i];
            }
            else if(digit[i]>secondmax && digit[i]!=max){
                secondmax=digit[i];
            }
        }
       System.out.println("largest digit is : "+max);
       System.out.println("second largest digit is : "+secondmax);
        scanner.close();
    }
}
