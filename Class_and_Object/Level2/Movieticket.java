class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

    public MovieTicket() {
        this.movieName = "";
        this.seatNumber = 0;
        this.price = 0.0;
    }

    public void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    public void displayTicketDetails() {
        System.out.println("     Ticket Details     ");
        System.out.println("Movie Name : " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price      : " + price);
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();
        System.out.print("Enter Seat Number: ");
        int seat = sc.nextInt();
        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket(movie, seat, price);
        ticket.displayTicketDetails();
        sc.close();
    }
}

