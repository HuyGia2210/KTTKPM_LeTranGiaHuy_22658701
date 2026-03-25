import book.BookFactory;
import book.IBook;
import book.decorate.BrailleDecorator;
import book.decorate.ExtendedTimeDecorator;
import library.Library;
import observer.LibrarianSubscriber;
import observer.UserSubscriber;
import search.AuthorSearchStrategy;
import search.TitleSearchStrategy;

import java.util.List;

/**
 * @author Le Tran Gia Huy
 * @created 25/03/2026 - 12:11 PM
 * @project LibraryManagement_DesignPattern
 * @package PACKAGE_NAME
 */
public class Main {
    public static void main(String[] args) {
        // 1. Lấy instance duy nhất của Thư viện
        Library library = Library.getInstance();

        // 2. Observer: Đăng ký người nhận thông báo
        library.attach(new LibrarianSubscriber("Cô Hương"));
        library.attach(new UserSubscriber("Bạn Nam"));

        System.out.println("=== THÊM SÁCH VÀO THƯ VIỆN ===");
        // 3. Factory Method: Tạo sách
        IBook book1 = BookFactory.createBook("PAPER", "Design Patterns", "Gang of Four", "IT");
        IBook book2 = BookFactory.createBook("EBOOK", "Clean Code", "Robert C. Martin", "IT");

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("\n=== TÌM KIẾM SÁCH ===");
        // 4. Strategy: Đổi chiến lược tìm kiếm
        library.setSearchStrategy(new TitleSearchStrategy());
        List<IBook> foundByTitle = library.searchBooks("Clean");
        System.out.println("Tìm theo tên 'Clean': " + foundByTitle.get(0).getDescription());

        library.setSearchStrategy(new AuthorSearchStrategy());
        List<IBook> foundByAuthor = library.searchBooks("Four");
        System.out.println("Tìm theo tác giả 'Four': " + foundByAuthor.get(0).getDescription());

        System.out.println("\n=== MƯỢN SÁCH VỚI TÍNH NĂNG ĐẶC BIỆT ===");
        // 5. Decorator: Mượn sách giấy, yêu cầu thêm chữ nổi và gia hạn thời gian
        IBook borrowedBook = new ExtendedTimeDecorator(new BrailleDecorator(book1));
        System.out.println("Phiếu mượn: " + borrowedBook.getDescription());
    }
}
