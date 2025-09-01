import java.util.Scanner;
public class meanheight {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double [] height=new double[11];
        double sum=0;
        for (int i=0;i<11;i++){
            System.out.print("enter the height in cm :");
            height[i]=scanner.nextDouble();
            sum+=height[i];
        }
        double meanheight;
        meanheight=sum/11;
        System.out.print("meanheight of the team is : "+meanheight);
        scanner.close();
    }
}
