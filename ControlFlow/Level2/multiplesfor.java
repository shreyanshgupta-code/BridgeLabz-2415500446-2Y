import java.util.Scanner;
public class multiplesfor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.print("Enter the number: ");
        number=scanner.nextInt();
        if(number<=0 || number>=100){
            System.out.print("enter number greater than 0 andd less than 100");
        }
        else{
            for(int i=100;i>=1;i--){
                if(i%number==0){
                    System.out.print(i+" ");
                }
            }
        }
        scanner.close();
    }
}
