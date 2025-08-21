import java.util.Scanner;
public class height {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double cm;
        double feet;
        double inches;
        System.out.print("Enter height in cm : ");
        cm=scanner.nextDouble();
        inches=cm/2.54;
        feet=inches/12;
        System.out.println("Your Height in cm is "+cm+" while in feet is "+feet+" and inches is "+inches);
        scanner.close();
    }
}
