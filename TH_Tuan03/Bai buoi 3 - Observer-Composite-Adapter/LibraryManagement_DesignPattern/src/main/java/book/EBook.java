package book;

/**
 * @author Le Tran Gia Huy
 * @created 25/03/2026 - 12:12 PM
 * @project LibraryManagement_DesignPattern
 * @package book
 */
public class EBook implements IBook {
    private String title, author, category;
    public EBook(String title, String author, String category) {
        this.title = title; this.author = author; this.category = category;
    }
    @Override public String getTitle() { return title; }
    @Override public String getAuthor() { return author; }
    @Override public String getCategory() { return category; }
    @Override public String getDescription() { return "[Sách Điện Tử] " + title + " - " + author; }
}