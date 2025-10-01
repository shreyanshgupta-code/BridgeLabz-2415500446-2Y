public class Circle {
    private double radius;

    public Circle() {
    
        this(1.0);  
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayCircleDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
        System.out.println("");
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.displayCircleDetails();
        Circle c2 = new Circle(5.0);
        c2.displayCircleDetails();
    }
}

