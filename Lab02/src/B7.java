import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        // Khai báo đối tượng Scanner để nhận đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập vào 4 số nguyên a, b, c, d
        System.out.print("Nhập vào số nguyên a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập vào số nguyên b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập vào số nguyên c: ");
        int c = scanner.nextInt();
        System.out.print("Nhập vào số nguyên d: ");
        int d = scanner.nextInt();

        // Tìm số lớn nhất trong cặp (a, b) và cặp (c, d)
        int maxAB = (a > b) ? a : b;  // Số lớn nhất trong cặp (a, b)
        int maxCD = (c > d) ? c : d;  // Số lớn nhất trong cặp (c, d)

        // Tìm số lớn nhất trong 2 số maxAB và maxCD
        int max = (maxAB > maxCD) ? maxAB : maxCD;

        // In ra số lớn nhất
        System.out.println("Số lớn nhất là: " + max);

        // Đóng Scanner
        scanner.close();
    }
}
