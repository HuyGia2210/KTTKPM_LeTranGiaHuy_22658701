package book.decorate;

import book.IBook;

/**
 * @author Le Tran Gia Huy
 * @created 25/03/2026 - 12:14 PM
 * @project LibraryManagement_DesignPattern
 * @package book.decorate
 */
public class ExtendedTimeDecorator extends BookDecorator {
    public ExtendedTimeDecorator(IBook book) { super(book); }
    @Override public String getDescription() { return book.getDescription() + " (+ Gia hạn mượn thêm 14 ngày)"; }
}
