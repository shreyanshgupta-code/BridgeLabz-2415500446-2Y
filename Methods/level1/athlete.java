import java.util.Scanner;
public class athlete {
    static void round(){
        Scanner scanner=new Scanner(System.in);
        double distance=5000,side1,side2,side3;
        System.out.print("enter side1 in meter : ");
        side1=scanner.nextDouble();
        System.out.print("enter side2 in meter : ");
        side2=scanner.nextDouble();
        System.out.print("enter side3 in meter : ");
        side3=scanner.nextDouble();
        double perimeter=side1+side2+side3;
        double round=distance/perimeter;
        System.out.print(round);
        scanner.close();
    }
    public static void main(String[] args) {
        round();
    }
}
