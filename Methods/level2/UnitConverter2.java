public class UnitConverter2 {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    public static void main(String[] args) {
        double f = 98.6;
        double c = 37;
        double pounds = 150;
        double kg = 68;
        double gallons = 5;
        double liters = 10;
        System.out.println(f + " °F = " + convertFahrenheitToCelsius(f) + " °C");
        System.out.println(c + " °C = " + convertCelsiusToFahrenheit(c) + " °F");
        System.out.println(pounds + " pounds = " + convertPoundsToKilograms(pounds) + " kg");
        System.out.println(kg + " kg = " + convertKilogramsToPounds(kg) + " pounds");
        System.out.println(gallons + " gallons = " + convertGallonsToLiters(gallons) + " liters");
        System.out.println(liters + " liters = " + convertLitersToGallons(liters) + " gallons");
    }
}
