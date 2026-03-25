package search;

import book.IBook;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Le Tran Gia Huy
 * @created 25/03/2026 - 12:15 PM
 * @project LibraryManagement_DesignPattern
 * @package search
 */
public class TitleSearchStrategy implements SearchStrategy {
    @Override
    public List<IBook> search(List<IBook> books, String keyword) {
        List<IBook> result = new ArrayList<>();
        for (IBook book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) result.add(book);
        }
        return result;
    }
}
