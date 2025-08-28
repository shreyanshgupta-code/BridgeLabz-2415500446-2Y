import java.util.Scanner;
public class multipleswhile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.print("Enter the number: ");
        number=scanner.nextInt();
        if(number<=0 || number>=100){
            System.out.print("enter number greater than 0 andd less than 100");
        }
        else{
            int counter=100;
            while(counter>1){
                if(counter%number==0){
                    System.out.print(counter+" ");
                }
                counter--;
            }
        }
        scanner.close();
    }
}