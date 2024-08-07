import java.util.*;
class Library{
    private Map<String, User> users = new HashMap<>();
    private Map<String, Admin> admins = new HashMap<>();
    private Map<String, List<Book>> adminBooks = new HashMap<>();
    private Map<String, List<User>> adminUsers = new HashMap<>();
    private LibraryManager libraryManager = new LibraryManager();
    public void addAdmin(String userName, String password) {
        admins.put(userName, new Admin(userName, password));
        adminBooks.put(userName, new ArrayList<>());
        adminUsers.put(userName, new ArrayList<>());
    }
    public boolean adminLogin(String userName, String password){
        Admin admin = admins.get(userName);
        return admin != null && admin.getPassword().equals(password);
    }
    public boolean userLogin(String userName, String password){
        User user = users.get(userName);
        return user != null && user.getPassword().equals(password);
    }
    public void addBook(String adminUsername, String bookId, String title, String author, int count) {
   List<Book> books = adminBooks.get(adminUsername);
    if (books != null) {
      boolean bookExists = false;
        for (Book book : books) {
           if (book.getBookId().equals(bookId)) {
             bookExists = true;
             book.setCount(book.getCount() + count);
             libraryManager.updateBook(book);
             System.out.println("Book count updated.");
             return;
                }
            }
            if(!bookExists){
                Book newBook = new Book(bookId, title, author, "Available", count);
                books.add(newBook);
                libraryManager.addBook(newBook);
                System.out.println("Book added.");
            }
        }
    }
   public void removeBook(String adminUsername, String bookId){
        List<Book> books = adminBooks.get(adminUsername);
        if (books!= null){
            Iterator<Book> iterator = books.iterator();
            while (iterator.hasNext()) {
                Book book = iterator.next();
                if (book.getBookId().equals(bookId)){
                    iterator.remove();
                    libraryManager.removeBook(bookId);
                    System.out.println("Book removed.");
                    return;
                }
                }
           }
     }
    public void listAllBooks(String adminUsername){
        List<Book> books = adminBooks.get(adminUsername);
        if (books != null) {
            for (Book book : books) {
                System.out.println(book);
              }
            }
    }
    public void searchBookByTitle(String adminUsername, String title){
        List<Book> books = adminBooks.get(adminUsername);
        if (books!= null) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    System.out.println(book);
                }
            }
        }
    }

    public void getBooksByAuthor(String adminUsername, String author) {
        List<Book> books = adminBooks.get(adminUsername);
        if (books!= null) {
            for (Book book : books) {
                if (book.getAuthor().equalsIgnoreCase(author)) {
                    System.out.println(book);
                }
              }
        }
    }

    public void addUser(String adminUsername, String userName, String password, String name, String contact) {
        User newUser = new User(userName, password, name, contact);
        users.put(userName, newUser);
        List<User> adminUserList = adminUsers.get(adminUsername);
        if (adminUserList != null) {
            adminUserList.add(newUser);
        }
    }
    public void listAllUsers(String adminUsername) {
        List<User> adminUserList = adminUsers.get(adminUsername);
        if (adminUserList != null) {
            for (User user : adminUserList) {
                System.out.println(user);
            }
        }
    }
    public void borrowBook(String username, String bookId) {
        User user = users.get(username);
        if (user!= null) {
            for (List<Book> books : adminBooks.values()) {
                for (Book book : books) {
                    if (book.getBookId().equals(bookId) && book.getStatus().equals("Available")) {
                        if (book.getCount()>0) {
                            book.setCount(book.getCount()-1);
                            user.borrowBook(book);
                            if (book.getCount()==0) {
                                book.setStatus("Borrowed");
                            }
                            libraryManager.updateBook(book);
                            System.out.println("Book borrowed.");
                            return;
                        } else {
                            System.out.println("No copies left to borrow.");
                            return;
                      }
                   }
              }
      }
        System.out.println("Book not found.");
        } 
        else {
            System.out.println("User not found.");
        }
    }
    public void returnBook(String username, String bookId) {
        User user = users.get(username);
        if (user != null) {
            Book book = user.returnBook(bookId);
            if (book != null) {
                book.setCount(book.getCount()+1);
                if (book.getStatus().equals("Borrowed")) {
                    book.setStatus("Available");
                }
                libraryManager.updateBook(book);
                System.out.println("Book returned.");
            } 
            else {
                System.out.println("Book not found in user's borrowed list.");
            }
        } 
        else {
            System.out.println("User not found.");
        }
    }
    public void viewBorrowedBooks(String username) {
        User user = users.get(username);
        if (user != null) {
            List<Book> borrowedBooks = user.getBorrowedBooks();
            for (Book book : borrowedBooks) {
                System.out.println(book);
            }
        } 
        else {
            System.out.println("User not found.");
        }
    }
}
