package task;

/**
 * @author Le Tran Gia Huy
 * @created 24/03/2026 - 10:57 PM
 * @project Bai2_TaskManagement_Observer
 * @package task
 */
public class TeamMember implements TaskObserver {
    private String name;
    private String role;

    public TeamMember(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public void onTaskStatusChanged(String taskName, String status) {
        System.out.println(" -> [" + role + "] " + name + " nhận được thông báo: Task '" + taskName + "' hiện đang '" + status + "'");
    }
}
