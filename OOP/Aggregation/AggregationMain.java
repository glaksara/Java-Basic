package Aggregation;

public class AggregationMain {
    public static void runClass() {
        Book book1 = new Book("Amazon", 552);
        Book book2 = new Book("Hobbit", 423);

        Book[] books = {book1, book2};
        Library library = new Library("UoP", 1955, books);
        library.displayInfo();
    }
}
