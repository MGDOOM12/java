package Main;

public class Aggregation {

    public static void main(String[] args) {
        // Aggregation = Represent a "has-a" relationship between objects. One object contains another object as part of its structure, but the contained object/s can exist independently.

        Book book1 = new Book("Project Hail Mary", 496 );
        Book book2 = new Book("Red Rising", 416);
        Book book3 = new Book("All Systems Red", 160 );

        Book[] books = {book1, book2, book3};

        Library library = new Library("MGDOOM'S BOOKS", 2025, books);

        library.displayInfo();

    }
}
