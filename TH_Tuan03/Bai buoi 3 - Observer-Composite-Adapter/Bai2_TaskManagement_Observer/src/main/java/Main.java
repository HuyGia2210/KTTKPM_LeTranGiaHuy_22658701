import task.Task;
import task.TeamMember;

/**
 * @author Le Tran Gia Huy
 * @created 24/03/2026 - 10:55 PM
 * @project Bai2_TaskManagement_Observer
 * @package PACKAGE_NAME
 */
public class Main {
    public static void main(String[] args) {
        Task loginTask = new Task("Xây dựng tính năng Login");

        TeamMember dev = new TeamMember("Hải", "Developer");
        TeamMember qa = new TeamMember("Lan", "Tester");
        TeamMember pm = new TeamMember("Minh", "Project Manager");

        // Add member vào task
        loginTask.subscribe(dev);
        loginTask.subscribe(qa);
        loginTask.subscribe(pm);

        // Đổi trạng thái -> Cả team nhận thông báo
        loginTask.setStatus("In Progress");
        loginTask.setStatus("Ready for QA");
    }
}
