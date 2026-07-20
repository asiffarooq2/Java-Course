import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Abstract base class
abstract class Item {
    private String id;
    private String title;
    private LocalDate publicationDate;
    private int maxCheckoutDays;

    public Item(String id, String title, LocalDate publicationDate, int maxCheckoutDays) {
        this.id = id;
        this.title = title;
        this.publicationDate = publicationDate;
        this.maxCheckoutDays = maxCheckoutDays;
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public int getMaxCheckoutDays() {
        return maxCheckoutDays;
    }
}

// Book class
class Book extends Item {
    private String author;
    private int pages;

    public Book(String id, String title, LocalDate publicationDate,
            String author, int pages) {
        super(id, title, publicationDate, 21);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
}

// CD class
class CD extends Item {
    private String artist;
    private int tracks;

    public CD(String id, String title, LocalDate publicationDate,
            String artist, int tracks) {
        super(id, title, publicationDate, 14);
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getArtist() {
        return artist;
    }

    public int getTracks() {
        return tracks;
    }
}

// DVD class
class DVD extends Item {
    private String director;
    private int runningTime;

    public DVD(String id, String title, LocalDate publicationDate,
            String director, int runningTime) {
        super(id, title, publicationDate, 7);
        this.director = director;
        this.runningTime = runningTime;
    }

    public String getDirector() {
        return director;
    }

    public int getRunningTime() {
        return runningTime;
    }
}

// Patron class
class Patron {
    private String name;
    private int id;
    private List<Item> checkedOutItems;

    public Patron(String name, int id) {
        this.name = name;
        this.id = id;
        checkedOutItems = new ArrayList<>();
    }

    // Check out an item (maximum 10 items)
    public void checkOutItem(Item item) {
        if (checkedOutItems.size() < 10) {
            checkedOutItems.add(item);
            System.out.println(item.getTitle() + " checked out successfully.");
        } else {
            System.out.println("Cannot check out more than 10 items.");
        }
    }

    // Return an item
    public void returnItem(Item item) {
        if (checkedOutItems.remove(item)) {
            System.out.println(item.getTitle() + " returned successfully.");
        } else {
            System.out.println("Item not found.");
        }
    }

    // Number of checked-out items
    public int getNumItemsCheckedOut() {
        return checkedOutItems.size();
    }

    // Display all checked-out items
    public void displayCheckedOutItems() {
        System.out.println("\nItems checked out by " + name + ":");

        if (checkedOutItems.isEmpty()) {
            System.out.println("No items checked out.");
            return;
        }

        for (Item item : checkedOutItems) {
            System.out.println("- " + item.getTitle()
                    + " (Maximum Checkout: "
                    + item.getMaxCheckoutDays() + " days)");
        }
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

// Driver class
public class LibraryManagementTest {

    public static void main(String[] args) {

        // Create library items
        Book book = new Book(
                "B001",
                "1984",
                LocalDate.of(1949, 6, 8),
                "George Orwell",
                328);

        DVD dvd = new DVD(
                "D001",
                "Inception",
                LocalDate.of(2010, 7, 16),
                "Christopher Nolan",
                148);

        CD cd = new CD(
                "C001",
                "Thriller",
                LocalDate.of(1982, 11, 30),
                "Michael Jackson",
                9);

        // Create a patron
        Patron alice = new Patron("Alice", 1234);

        // Check out items
        alice.checkOutItem(book);
        alice.checkOutItem(dvd);

        System.out.println("\nNumber of checked-out items: "
                + alice.getNumItemsCheckedOut());

        alice.displayCheckedOutItems();

        // Return DVD
        System.out.println("\nReturning DVD...");
        alice.returnItem(dvd);

        System.out.println("\nNumber of checked-out items: "
                + alice.getNumItemsCheckedOut());

        alice.displayCheckedOutItems();

        // Check out CD
        System.out.println("\nChecking out a CD...");
        alice.checkOutItem(cd);

        System.out.println("\nNumber of checked-out items: "
                + alice.getNumItemsCheckedOut());

        alice.displayCheckedOutItems();
    }
}
