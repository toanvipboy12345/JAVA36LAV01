import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        // Khai báo đối tượng Scanner để nhận đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập vào 3 số a, b, c
        System.out.print("Nhập vào cạnh a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập vào cạnh b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập vào cạnh c: ");
        double c = scanner.nextDouble();

        // Kiểm tra điều kiện để tạo thành tam giác
        if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)) {
            // Tính chu vi tam giác
            double perimeter = a + b + c;

            // Tính diện tích tam giác bằng công thức Heron
            double s = perimeter / 2; // nửa chu vi
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            // In kết quả
            System.out.println("3 số " + a + ", " + b + ", " + c + " tạo thành một tam giác.");
            System.out.println("Chu vi của tam giác là: " + perimeter);
            System.out.println("Diện tích của tam giác là: " + area);
        } else {
            System.out.println("3 số " + a + ", " + b + ", " + c + " không thể tạo thành một tam giác.");
        }

        // Đóng Scanner
        scanner.close();
    }
}
