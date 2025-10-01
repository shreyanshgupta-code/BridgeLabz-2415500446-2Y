public class Book {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public void borrowBook() {
        if (available) {
            System.out.println("You have successfully borrowed: " + title);
            available = false; 
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is currently not available.");
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
        System.out.println("");
    }

    public static void main(String[] args) {

        Book b1 = new Book("1984", "George Orwell", 299.99, true);
        Book b2 = new Book("The Hobbit", "J.R.R. Tolkien", 399.50, false);


        b1.displayDetails();
        b2.displayDetails();

        b1.borrowBook(); 
        b1.borrowBook(); 
        b2.borrowBook(); 
    }
}
