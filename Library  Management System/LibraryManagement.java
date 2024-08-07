import java.util.*;
import java.io.*;
public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        library.addAdmin("admin", "123");
        while (true) {
            try {
                System.out.println("1. Admin Login");
                System.out.println("2. User Login");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");
                int choice = Integer.parseInt(reader.readLine()); 
                if (choice == 1) {
                    System.out.print("Admin Username: ");
                    String adminUsername = reader.readLine();
                    System.out.print("Admin Password: ");
                    String adminPassword = reader.readLine();

                    if (library.adminLogin(adminUsername, adminPassword)) {
                        adminMenu(library, adminUsername, reader);
                    } else {
                        System.out.println("Invalid admin credentials.");
                    }
                } else if (choice == 2) {
                    System.out.print("Username: ");
                    String username = reader.readLine();
                    System.out.print("Password: ");
                    String password = reader.readLine();
                    if (library.userLogin(username, password)) {
                        userMenu(library, username, reader);
                    } else {
                        System.out.println("Invalid user credentials.");
                    }

                } else if (choice == 3) {
                    System.out.println("Exiting...");
                    break;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("An error occurred. Please try again.");
            }
        }
    }

    private static void adminMenu(Library library, String adminUsername, BufferedReader reader) throws IOException {
        while (true) {
            try {
                System.out.println("\nAdmin Menu:");
                System.out.println("1. Add Book");
                System.out.println("2. Remove Book");
                System.out.println("3. List All Books");
                System.out.println("4. Search Book by Title");
                System.out.println("5. Get Books by Author");
                System.out.println("6. Add New Admin");
                System.out.println("7. Add New User");
                System.out.println("8. List All Users");
                System.out.println("9. Logout");
                System.out.print("Choose an option: ");
                int choice = Integer.parseInt(reader.readLine());

                if (choice == 1) {
                    System.out.print("Book ID: ");
                    String bookId = reader.readLine();
                    System.out.print("Title: ");
                    String title = reader.readLine();
                    System.out.print("Author: ");
                    String author = reader.readLine();
                    System.out.print("Count: ");
                    int count = Integer.parseInt(reader.readLine());
                    library.addBook(adminUsername, bookId, title, author, count);
                    System.out.println("Book added.");
                } else if (choice == 2) {
                    System.out.print("Book ID to remove: ");
                    String bookId = reader.readLine();
                    library.removeBook(adminUsername, bookId);
                    System.out.println("Book removed.");

                } else if (choice == 3) {
                    library.listAllBooks(adminUsername);

                } else if (choice == 4) {
                    System.out.print("Title to search: ");
                    String title = reader.readLine();
                    library.searchBookByTitle(adminUsername, title);

                } else if (choice == 5) {
                    System.out.print("Author to search: ");
                    String author = reader.readLine();
                    library.getBooksByAuthor(adminUsername, author);

                } else if (choice == 6) {
                    System.out.print("New Admin Username: ");
                    String newAdminUsername = reader.readLine();
                    System.out.print("New Admin Password: ");
                    String newAdminPassword = reader.readLine();
                    library.addAdmin(newAdminUsername, newAdminPassword);
                    System.out.println("New admin added.");
                } else if (choice == 7) {
                    System.out.print("New User Username: ");
                    String newUserUsername = reader.readLine();
                    System.out.print("New User Password: ");
                    String newUserPassword = reader.readLine();
                    System.out.print("New User Name: ");
                    String newUserName = reader.readLine();
                    System.out.print("New User Contact: ");
                    String newUserContact = reader.readLine();
                    library.addUser(adminUsername, newUserUsername, newUserPassword, newUserName, newUserContact);
                    System.out.println("New user added.");
                } else if (choice == 8) {
                    library.listAllUsers(adminUsername);
                } else if (choice == 9) {
                    System.out.println("Logging out...");
                    break;

                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("An error occurred. Please try again.");
            }
        }
    }

    private static void userMenu(Library library, String username, BufferedReader reader) throws IOException {
        while (true) {
            try {
                System.out.println("\nUser Menu:");
                System.out.println("1. Borrow Book");
                System.out.println("2. Return Book");
                System.out.println("3. View Borrowed Books");
                System.out.println("4. Logout");
                System.out.print("Choose an option: ");
                int choice = Integer.parseInt(reader.readLine());
                if (choice == 1) {
                    System.out.print("Book ID to borrow: ");
                    String bookId = reader.readLine();
                    library.borrowBook(username, bookId);
                } else if (choice == 2) {
                    System.out.print("Book ID to return: ");
                    String bookId = reader.readLine();
                    library.returnBook(username, bookId);
                } else if (choice == 3) {
                    library.viewBorrowedBooks(username);
                } else if (choice == 4) {
                    System.out.println("Logging out...");
                    break;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("An error occurred. Please try again.");
            }
        }
    }
}
