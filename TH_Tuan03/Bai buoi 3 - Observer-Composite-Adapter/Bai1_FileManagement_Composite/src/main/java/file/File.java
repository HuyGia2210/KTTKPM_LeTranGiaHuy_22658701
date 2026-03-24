package file;

/**
 * @author Le Tran Gia Huy
 * @created 24/03/2026 - 10:31 PM
 * @project Bai1_FileManagement_Composite
 * @package file
 */
public class File implements FileComponent {
    private String name;
    private int size; // Kích thước tính bằng KB

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "- [File] " + name + " (" + size + " KB)");
    }
}