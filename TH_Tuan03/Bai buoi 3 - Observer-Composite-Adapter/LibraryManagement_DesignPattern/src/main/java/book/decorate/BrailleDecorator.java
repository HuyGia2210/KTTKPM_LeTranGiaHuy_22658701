package book.decorate;

import book.IBook;

/**
 * @author Le Tran Gia Huy
 * @created 25/03/2026 - 12:13 PM
 * @project LibraryManagement_DesignPattern
 * @package book.decorate
 */
public class BrailleDecorator extends BookDecorator {
    public BrailleDecorator(IBook book) { super(book); }
    @Override public String getDescription() { return book.getDescription() + " (+ Kèm bản chữ nổi)"; }
}
