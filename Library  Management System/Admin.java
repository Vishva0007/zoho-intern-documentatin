import java.util.*;
class Admin{
    private String userName;
    private String password;
    public Admin(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    public String getUserName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }
}
class User {
    private String userName;
    private String password;
    private String name;
    private String contact;
    private List<Book> borrowedBooks = new ArrayList<>();
    public User(String userName, String password, String name, String contact){
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.contact = contact;
    }
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }
   public Book returnBook(String bookId) {
        Iterator<Book> iterator = borrowedBooks.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getBookId().equals(bookId)) {
                iterator.remove();
                return book;
            }
        }
        return null;
    }
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    public String toString() {
        return "User [userName=" + userName + ", name=" + name + ", contact=" + contact + "]";
    }
}
