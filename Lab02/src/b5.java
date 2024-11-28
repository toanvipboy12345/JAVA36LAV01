import java.util.Scanner;
public class b5 {
    public static void main(String[] args) {
        // Khai báo đối tượng Scanner để nhận đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập vào một số nguyên N
        System.out.print("Nhập vào một số nguyên: ");
        int N = scanner.nextInt();

        // Kiểm tra xem N là số chẵn hay số lẻ
        if (N % 2 == 0) {
            System.out.println(N + " là số chẵn.");
        } else {
            System.out.println(N + " là số lẻ.");
        }

        // Đóng Scanner
        scanner.close();
    }
}
