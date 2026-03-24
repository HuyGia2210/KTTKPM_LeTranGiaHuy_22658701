package task;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Le Tran Gia Huy
 * @created 24/03/2026 - 10:57 PM
 * @project Bai2_TaskManagement_Observer
 * @package task
 */
public class Task implements TaskSubject {
    private List<TaskObserver> teamMembers = new ArrayList<>();
    private String taskName;
    private String status;

    public Task(String taskName) {
        this.taskName = taskName;
        this.status = "To Do"; // Trạng thái mặc định
    }

    public void setStatus(String status) {
        this.status = status;
        System.out.println("\n[Jira Bot] Task '" + taskName + "' đã chuyển sang trạng thái: " + status);
        notifyTeam();
    }

    @Override
    public void subscribe(TaskObserver observer) { teamMembers.add(observer); }

    @Override
    public void unsubscribe(TaskObserver observer) { teamMembers.remove(observer); }

    @Override
    public void notifyTeam() {
        for (TaskObserver member : teamMembers) {
            member.onTaskStatusChanged(taskName, status);
        }
    }
}