package library;

import book.IBook;
import observer.LibraryObserver;
import search.SearchStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Le Tran Gia Huy
 * @created 25/03/2026 - 12:17 PM
 * @project LibraryManagement_DesignPattern
 * @package library
 */
public class Library {
    private static Library instance;

    private List<IBook> books = new ArrayList<>();
    private List<LibraryObserver> observers = new ArrayList<>();
    private SearchStrategy searchStrategy;

    // 2. Private constructor
    private Library() {}

    // 3. Cổng truy cập toàn cục
    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    // --- Chức năng Observer ---
    public void attach(LibraryObserver observer) { observers.add(observer); }
    public void detach(LibraryObserver observer) { observers.remove(observer); }
    private void notifyObservers(String message) {
        for (LibraryObserver obs : observers) {
            obs.update(message);
        }
    }

    // --- Chức năng Quản lý Sách ---
    public void addBook(IBook book) {
        books.add(book);
        notifyObservers("Thư viện vừa nhập sách mới: '" + book.getTitle() + "'");
    }

    // --- Chức năng Strategy (Tìm kiếm) ---
    public void setSearchStrategy(SearchStrategy strategy) {
        this.searchStrategy = strategy;
    }

    public List<IBook> searchBooks(String keyword) {
        if (searchStrategy == null) {
            System.out.println("Vui lòng chọn chiến lược tìm kiếm!");
            return new ArrayList<>();
        }
        return searchStrategy.search(books, keyword);
    }
}
