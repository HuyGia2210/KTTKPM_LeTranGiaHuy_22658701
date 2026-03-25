package book;

/**
 * @author Le Tran Gia Huy
 * @created 25/03/2026 - 12:12 PM
 * @project LibraryManagement_DesignPattern
 * @package book
 */
public class BookFactory {
    public static IBook createBook(String type, String title, String author, String category) {
        if (type.equalsIgnoreCase("PAPER")) return new PaperBook(title, author, category);
        if (type.equalsIgnoreCase("EBOOK")) return new EBook(title, author, category);
        throw new IllegalArgumentException("Loại sách không hợp lệ");
    }
}
