import java.util.Scanner;

public class B10 {
    public static void main(String[] args) {
        // Khai báo đối tượng Scanner để nhận đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập vào ký tự color
        System.out.print("Nhập vào màu (R, G, B hoặc ký tự khác): ");
        char color = scanner.next().charAt(0);  // Lấy ký tự đầu tiên

        // Kiểm tra và in ra thông báo dựa trên giá trị của color
        switch (Character.toLowerCase(color)) {
            case 'r':
                System.out.println("RED");
                break;
            case 'g':
                System.out.println("GREEN");
                break;
            case 'b':
                System.out.println("BLUE");
                break;
            default:
                System.out.println("BLACK");
                break;
        }

        // Đóng Scanner
        scanner.close();
    }
}
