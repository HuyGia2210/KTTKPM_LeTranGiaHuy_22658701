package observer_subject;

/**
 * @author Le Tran Gia Huy
 * @created 24/03/2026 - 10:49 PM
 * @project Bai2_StockManagement_Observation
 * @package observer_subject
 */
public interface Observer {
    void update(String stockSymbol, double price);
}
