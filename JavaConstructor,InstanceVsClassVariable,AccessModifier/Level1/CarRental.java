public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        double dailyRate;
        switch (carModel.toLowerCase()) {
            case "sedan":
                dailyRate = 2000; 
                break;
            case "suv":
                dailyRate = 3000; 
                break;
            case "luxury":
                dailyRate = 5000; 
                break;
            default:
                dailyRate = 1500; 
        }
        return dailyRate * rentalDays;
    }

    public void displayDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
        System.out.println("");
    }

    public static void main(String[] args) {
    
        CarRental rental1 = new CarRental();
        rental1.displayDetails();

        CarRental rental2 = new CarRental("Rahul Sharma", "SUV", 5);
        rental2.displayDetails();

        CarRental rental3 = new CarRental("Ananya Verma", "Luxury", 3);
        rental3.displayDetails();
    }
}

