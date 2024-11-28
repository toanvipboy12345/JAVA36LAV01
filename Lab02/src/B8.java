import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        // Khai báo đối tượng Scanner để nhận đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập vào tháng và năm
        System.out.print("Nhập vào tháng (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Nhập vào năm: ");
        int year = scanner.nextInt();

        // Kiểm tra số ngày trong tháng
        int days = 0;

        // Kiểm tra các tháng có số ngày cố định
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            days = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else if (month == 2) {
            // Kiểm tra năm nhuận cho tháng 2
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                days = 29; // Năm nhuận
            } else {
                days = 28; // Năm không nhuận
            }
        }

        // In ra kết quả
        if (days == 0) {
            System.out.println("Tháng nhập vào không hợp lệ.");
        } else {
            System.out.println("Tháng " + month + " của năm " + year + " có " + days + " ngày.");
        }

        // Đóng Scanner
        scanner.close();
    }
}
