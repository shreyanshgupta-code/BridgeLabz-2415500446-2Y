import java.util.Scanner;
public class allfactor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.print("enter the number :");
        number=scanner.nextInt();
        int maxfactor=10;
        int [] factor=new int[maxfactor];
        int index=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                if(index==maxfactor){
                    maxfactor*=2;
                    int[] temp = new int[maxfactor];
                    for (int j = 0; j < factor.length; j++) {
                        temp[j] = factor[j];
                }
                factor = temp;
                }
                factor[index++] = i;
            }     
        }
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factor[i] + " ");
        }
        scanner.close();
    }
    
}