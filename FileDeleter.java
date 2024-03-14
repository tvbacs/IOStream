import java.io.File;
import java.util.Scanner;

public class FileDeleter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập đường dẫn của thư mục hoặc file từ người dùng
        System.out.println("Nhập đường dẫn của thư mục hoặc file:");
        String path = scanner.nextLine();

        // Tạo một đối tượng File từ đường dẫn được nhập
        File file = new File(path);

        // Kiểm tra xem thư mục hoặc file có tồn tại không
        if (file.exists()) {
            // Xóa thư mục hoặc file
            if (deleteFile(file)) {
                System.out.println("Đã xóa thành công.");
            } else {
                System.out.println("Xóa không thành công.");
            }
        } else {
            System.out.println("Thư mục hoặc file không tồn tại.");
        }

        scanner.close();
    }

    // Phương thức đệ quy để xóa thư mục hoặc file
    private static boolean deleteFile(File file) {
        if (file.isDirectory()) {
            // Xóa tất cả các tệp con và thư mục con
            File[] files = file.listFiles();
            if (files != null) {
                for (File subFile : files) {
                    deleteFile(subFile);
                }
            }
        }
        // Xóa thư mục hoặc file và trả về kết quả
        return file.delete();
    }
}
