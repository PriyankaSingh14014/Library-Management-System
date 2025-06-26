import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i+1) + ". " + books.get(i));
        }
    }

    public void issueBook(int bookIndex) {
        if (bookIndex >= 0 && bookIndex < books.size()) {
            Book book = books.get(bookIndex);
            if (!book.isIssued()) {
                book.issue();
                System.out.println("Book issued: " + book.getTitle());
            } else {
                System.out.println("Book is already issued.");
            }
        } else {
            System.out.println("Invalid book index.");
        }
    }

    public void returnBook(int bookIndex) {
        if (bookIndex >= 0 && bookIndex < books.size()) {
            Book book = books.get(bookIndex);
            if (book.isIssued()) {
                book.returnBook();
                System.out.println("Book returned: " + book.getTitle());
            } else {
                System.out.println("This book was not issued.");
            }
        } else {
            System.out.println("Invalid book index.");
        }
    }
}
