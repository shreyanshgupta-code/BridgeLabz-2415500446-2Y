public class pens_distributed {
    public static void main(String[] args) {
        int totalpens=14;
        int totalperson=3;
        int distibuted=totalpens/totalperson;
        int notdistributed=totalpens%totalperson;
        System.out.println("The Pen Per Student is "+distibuted+" and the remaining pen not distributed is "+ notdistributed);
    }

}
