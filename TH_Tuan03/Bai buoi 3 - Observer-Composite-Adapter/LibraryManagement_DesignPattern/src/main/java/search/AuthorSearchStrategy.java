package search;

import book.IBook;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Le Tran Gia Huy
 * @created 25/03/2026 - 12:16 PM
 * @project LibraryManagement_DesignPattern
 * @package search
 */
public class AuthorSearchStrategy implements SearchStrategy {
    @Override
    public List<IBook> search(List<IBook> books, String keyword) {
        List<IBook> result = new ArrayList<>();
        for (IBook book : books) {
            if (book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) result.add(book);
        }
        return result;
    }
}
