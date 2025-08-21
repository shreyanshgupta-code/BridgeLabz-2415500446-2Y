import java.util.Scanner;;
public class discounted_fees2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in); 
        int fees; 
        double discount_percent;
        double discount;
        double feestopay;
        System.out.print("Enter fees : ");
        fees=scanner.nextInt();
        System.out.println("Enter discount percentage : ");
        discount_percent=scanner.nextDouble();
        discount=(discount_percent/100)*fees;
        feestopay=fees-discount;
        System.out.println(" The discount amount is INR "+discount+" and final discounted fee is INR "+feestopay);
        scanner.close();
    }
}
