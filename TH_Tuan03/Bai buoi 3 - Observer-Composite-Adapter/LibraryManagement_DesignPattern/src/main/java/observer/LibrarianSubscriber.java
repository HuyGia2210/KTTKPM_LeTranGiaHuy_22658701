package observer;

/**
 * @author Le Tran Gia Huy
 * @created 25/03/2026 - 12:16 PM
 * @project LibraryManagement_DesignPattern
 * @package observer
 */
public class LibrarianSubscriber implements LibraryObserver {
    private String name;
    public LibrarianSubscriber(String name) { this.name = name; }
    @Override public void update(String message) {
        System.out.println("-> [Thủ thư " + name + "] Hệ thống cập nhật: " + message);
    }
}