package observer_subject;

/**
 * @author Le Tran Gia Huy
 * @created 24/03/2026 - 10:50 PM
 * @project Bai2_StockManagement_Observation
 * @package observer_subject
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
