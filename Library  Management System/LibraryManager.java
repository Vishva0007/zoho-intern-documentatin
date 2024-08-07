import java.util.Map;
import java.util.HashMap;
class LibraryManager{
    private Map<String, Book> bookInventory = new HashMap<>();
    public void addBook(Book book){
        bookInventory.put(book.getBookId(), book);
    }
    public void updateBook(Book book){
        bookInventory.put(book.getBookId(), book);
    }
    public void removeBook(String bookId){
        bookInventory.remove(bookId);
    }
}
