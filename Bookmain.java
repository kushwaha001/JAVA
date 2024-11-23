class Book {
    private String bookID;
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String bookID, String title, String author, double price) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters and Setters
    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
class Periodical extends Book {
    private String period;

    public Periodical(String bookID, String title, String author, double price, String period) {
        super(bookID, title, author, price);
        this.period = period;
    }
    public String getPeriod() {
        return period;
    }
    public void setPeriod(String period) {
        this.period = period;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Period: " + period);
    }
}
public class Bookmain {
    public static void main(String[] args) {
        Periodical periodical = new Periodical("001", "Tech Monthly", "John Doe", 19.99, "Monthly");
        System.out.println("Initial Periodical Details:");
        periodical.displayDetails();
        periodical.setPrice(24.99);
        periodical.setPeriod("Weekly");
        System.out.println("\nUpdated Periodical Details:");
        periodical.displayDetails();
    }
}
