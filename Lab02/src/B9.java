import java.util.Scanner;

public class B9 {
    public static void main(String[] args) {
        // Khai báo đối tượng Scanner để nhận đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập vào lựa chọn của người chơi
        System.out.println("Chọn (B) Búa, (K) Kéo, (G) Giấy:");
        char playerChoice = scanner.next().charAt(0);

        // Chọn ngẫu nhiên cho máy tính
        char computerChoice = "BKG".charAt((int)(Math.random() * 3));

        // In ra lựa chọn của máy tính
        System.out.println("Máy tính chọn: " + computerChoice);

        // Kiểm tra kết quả của trò chơi
        switch (playerChoice) {
            case 'B':  // Người chơi chọn Búa
                switch (computerChoice) {
                    case 'B': // Máy tính chọn Búa
                        System.out.println("Hòa!");
                        break;
                    case 'K': // Máy tính chọn Kéo
                        System.out.println("Bạn thắng!");
                        break;
                    case 'G': // Máy tính chọn Giấy
                        System.out.println("Bạn thua!");
                        break;
                }
                break;
            case 'K':  // Người chơi chọn Kéo
                switch (computerChoice) {
                    case 'B': // Máy tính chọn Búa
                        System.out.println("Bạn thua!");
                        break;
                    case 'K': // Máy tính chọn Kéo
                        System.out.println("Hòa!");
                        break;
                    case 'G': // Máy tính chọn Giấy
                        System.out.println("Bạn thắng!");
                        break;
                }
                break;
            case 'G':  // Người chơi chọn Giấy
                switch (computerChoice) {
                    case 'B': // Máy tính chọn Búa
                        System.out.println("Bạn thắng!");
                        break;
                    case 'K': // Máy tính chọn Kéo
                        System.out.println("Bạn thua!");
                        break;
                    case 'G': // Máy tính chọn Giấy
                        System.out.println("Hòa!");
                        break;
                }
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                break;
        }

        // Đóng Scanner
        scanner.close();
    }
}
