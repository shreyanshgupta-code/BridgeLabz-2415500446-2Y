public class discounted_fees {
    public static void main(String[] args) {
        int fees=125000;
        int discount=10;
        int discountfees=(discount*fees)/100;
        int feestopay=fees-discountfees;
        System.out.println("The discount amount is INR " + discountfees+" and final discounted fee is INR "+ feestopay);
    }
}
