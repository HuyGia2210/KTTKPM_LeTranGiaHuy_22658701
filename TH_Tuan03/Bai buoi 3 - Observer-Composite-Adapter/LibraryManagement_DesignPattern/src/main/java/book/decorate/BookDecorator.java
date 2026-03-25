package book.decorate;

import book.IBook;

/**
 * @author Le Tran Gia Huy
 * @created 25/03/2026 - 12:12 PM
 * @project LibraryManagement_DesignPattern
 * @package book
 */
public abstract class BookDecorator implements IBook {
    protected IBook book;
    public BookDecorator(IBook book) { this.book = book; }

    @Override public String getTitle() { return book.getTitle(); }
    @Override public String getAuthor() { return book.getAuthor(); }
    @Override public String getCategory() { return book.getCategory(); }
}