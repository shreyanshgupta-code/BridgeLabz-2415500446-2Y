public class earth_volume {
     public static void main(String[] args) {
        double pi=3.14;
        int radiusinkm=6378;
        double volumeinkm=(4*pi*radiusinkm*radiusinkm*radiusinkm)/3;
        double radiusinmile=radiusinkm/1.6;
        double volumeinmiles=(4/3)*pi*radiusinmile*radiusinmile*radiusinmile;
        System.out.println("The volume of earth in cubic kilometers is "+volumeinkm+" and cubic miles is "+volumeinmiles);
    }   
}
