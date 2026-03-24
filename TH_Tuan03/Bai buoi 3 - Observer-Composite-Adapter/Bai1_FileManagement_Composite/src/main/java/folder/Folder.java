package folder;

import file.FileComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Le Tran Gia Huy
 * @created 24/03/2026 - 10:31 PM
 * @project Bai1_FileManagement_Composite
 * @package folder
 */
public class Folder implements FileComponent {
    private String name;
    // Danh sách chứa các thành phần con (có thể là File hoặc Folder)
    private List<FileComponent> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    // Các hàm quản lý thành phần con
    public void add(FileComponent component) {
        children.add(component);
    }

    public void remove(FileComponent component) {
        children.remove(component);
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "+ [Folder] " + name);
        // Duyệt qua tất cả các thành phần con và gọi hàm showDetails của chúng
        for (FileComponent component : children) {
            component.showDetails(indent + "    "); // Tăng khoảng trắng lùi đầu dòng cho cấp con
        }
    }
}
