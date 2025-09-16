import java.util.*;

class Book {
    String title, author;
    Book(String t, String a) {
        title = t;
        author = a;
    }
    void showInfo() {
        System.out.println("Book: " + title + " by " + author);
    }
}

class Library {
    String name;
    ArrayList<Book> books = new ArrayList<>();

    Library(String n) { name = n; }

    void addBook(Book b) { books.add(b); }

    void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) b.showInfo();
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James");
        Book b2 = new Book("OOP Concepts", "Peter");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        lib1.addBook(b1);
        lib1.addBook(b2);
        lib2.addBook(b2); // same book can exist outside lib1

        lib1.showBooks();
        lib2.showBooks();
    }
}
