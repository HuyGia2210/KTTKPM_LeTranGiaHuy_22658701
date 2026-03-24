import file.File;
import file.FileComponent;
import folder.Folder;

/**
 * @author Le Tran Gia Huy
 * @created 24/03/2026 - 10:30 PM
 * @project Bai1_FileManagement_Composite
 * @package PACKAGE_NAME
 */
public class Main {
    public static void main(String[] args) {
        // Tạo các file
        FileComponent file1 = new File("tailieu.docx", 150);
        FileComponent file2 = new File("anh_the.jpg", 2048);
        FileComponent file3 = new File("source_code.java", 15);
        FileComponent file4 = new File("huong_dan.txt", 5);

        // Tạo các thư mục con
        Folder docsFolder = new Folder("Documents");
        docsFolder.add(file1);
        docsFolder.add(file4);

        Folder picturesFolder = new Folder("Pictures");
        picturesFolder.add(file2);

        Folder sourceFolder = new Folder("SourceCode");
        sourceFolder.add(file3);

        // Tạo thư mục gốc và đưa các thư mục con vào
        Folder rootFolder = new Folder("C_Drive");
        rootFolder.add(docsFolder);
        rootFolder.add(picturesFolder);
        rootFolder.add(sourceFolder);

        // Yêu cầu thư mục gốc hiển thị thông tin
        // Client không cần biết bên trong chứa File hay Folder, chỉ cần gọi showDetails()
        System.out.println("=== Cấu trúc thư mục ===");
        rootFolder.showDetails("");
    }
}
