import java.util.Scanner;

public class kilometer_to_miles2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double km;
        System.out.println("enter distance in kilometer : ");
        km=scanner.nextInt();
        double miles=km/1.6;
        System.out.println("The total miles is "+ miles+" mile for the given "+km +" km");
        scanner.close();
    }
}
