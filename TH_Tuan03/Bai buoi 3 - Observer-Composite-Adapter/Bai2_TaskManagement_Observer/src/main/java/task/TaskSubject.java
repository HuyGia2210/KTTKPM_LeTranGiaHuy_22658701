package task;

/**
 * @author Le Tran Gia Huy
 * @created 24/03/2026 - 10:57 PM
 * @project Bai2_TaskManagement_Observer
 * @package task
 */
public interface TaskSubject {
    void subscribe(TaskObserver observer);
    void unsubscribe(TaskObserver observer);
    void notifyTeam();
}
