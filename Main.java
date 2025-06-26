
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        library.addBook(new Book("The Alchemist", "Paulo Coelho"));
        library.addBook(new Book("Clean Code", "Robert C. Martin"));

        while (true) {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. Show Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    library.showBooks();
                    break;
                case 2:
                    library.showBooks();
                    System.out.print("Enter book number to issue: ");
                    int issueIndex = sc.nextInt() - 1;
                    library.issueBook(issueIndex);
                    break;
                case 3:
                    library.showBooks();
                    System.out.print("Enter book number to return: ");
                    int returnIndex = sc.nextInt() - 1;
                    library.returnBook(returnIndex);
                    break;
                case 4:
                    System.out.println("Exiting... Bye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
