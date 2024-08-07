import java.util.*;
class Book {
    private String bookId;
    private String title;
    private String author;
    private String status;
    private int count;
    public Book(String bookId, String title, String author, String status, int count){
     this.bookId = bookId;
     this.title = title;
     this.author = author;
     this.status = status;
     this.count = count;
    }
    public String getBookId(){
        return bookId;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public String toString() {
        return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", status=" + status + ", count=" + count + "]";
    }
}

