package task;

/**
 * @author Le Tran Gia Huy
 * @created 24/03/2026 - 10:57 PM
 * @project Bai2_TaskManagement_Observer
 * @package task
 */
public interface TaskObserver {
    void onTaskStatusChanged(String taskName, String status);
}
