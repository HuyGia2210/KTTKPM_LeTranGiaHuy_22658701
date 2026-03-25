package search;

import book.IBook;

import java.util.List;

/**
 * @author Le Tran Gia Huy
 * @created 25/03/2026 - 12:15 PM
 * @project LibraryManagement_DesignPattern
 * @package search
 */
public interface SearchStrategy {
    List<IBook> search(List<IBook> books, String keyword);
}
