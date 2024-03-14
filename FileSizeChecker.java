import java.io.File;
import java.util.Scanner;

public class FileSizeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập đường dẫn của file:");
        String filePath = scanner.nextLine();

        // Tạo một đối tượng File từ đường dẫn được nhập
        File file = new File(filePath);

        // Kiểm tra xem file có tồn tại không
        if (file.exists()) {
            // Lấy kích thước của file
            long fileSizeInBytes = file.length();
            double fileSizeInKB = fileSizeInBytes / 1024.0;
            double fileSizeInMB = fileSizeInKB / 1024.0;

            // Xuất kích thước của file ra màn hình
            System.out.println("Kích thước của file:");
            System.out.println("Bytes: " + fileSizeInBytes);
            System.out.println("KB: " + fileSizeInKB);
            System.out.println("MB: " + fileSizeInMB);
        } else {
            System.out.println("File không tồn tại.");
        }

        scanner.close();
    }
}
