
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    books.add(new Book(title, author));
                    System.out.println("Book added!\n");
                    break;
                case 2:
                    if(books.isEmpty()) System.out.println("No books found.");
                    else {
                        System.out.println("Book List:");
                        for(Book b : books) b.display();
                    }
                    break;
                case 3:
                    System.out.print("Enter Book Title to borrow: ");
                    String borrowTitle = sc.nextLine();
                    boolean foundBorrow = false;
                    for(Book b : books) {
                        if(borrowTitle.equalsIgnoreCase(b.getTitle())) {
                            b.borrowBook();
                            foundBorrow = true;
                        }
                    }
                    if(!foundBorrow) System.out.println("Book not found!");
                    break;
                case 4:
                    System.out.print("Enter Book Title to return: ");
                    String returnTitle = sc.nextLine();
                    boolean foundReturn = false;
                    for(Book b : books) {
                        if(returnTitle.equalsIgnoreCase(b.getTitle())) {
                            b.returnBook();
                            foundReturn = true;
                        }
                    }
                    if(!foundReturn) System.out.println("Book not found!");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while(choice != 5);
        sc.close();
    }
}
