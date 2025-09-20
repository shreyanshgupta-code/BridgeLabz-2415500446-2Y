import java.util.Scanner;
public class windchillcalculator {
    public static double calculateWindChill(double temp,double windSpeed){
        double windchill=35.74+0.625*temp+(0.4275*temp-35.75)*Math.pow(windSpeed,0.16);
        return windchill;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double temp,windSpeed;
        System.out.print("enter the temprature : ");
        temp=scanner.nextDouble();
        System.out.print("enter the windspeed : ");
        windSpeed=scanner.nextDouble();
        System.out.print("windchill is : "+calculateWindChill(temp,windSpeed));
        scanner.close();
    }
}
