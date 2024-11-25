import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập hệ số a, b, c
        System.out.println("Nhập hệ số a (a ≠ 0): ");
        double a = sc.nextDouble();

        // Kiểm tra nếu a = 0
        if (a == 0) {
            System.out.println("Nhập hệ số b (b ≠ 0): ");
            double b = sc.nextDouble();
            System.out.println("Nhập hệ số c: ");
            double c = sc.nextDouble();

            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -c / b;
                System.out.println("Nghiệm của phương trình bậc nhất là: x = " + x);
            }
            return;
        }

        System.out.println("Nhập hệ số b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập hệ số c: ");
        double c = sc.nextDouble();

        // Tính Delta
        double delta = b * b - 4 * a * c;

        // Kiểm tra và tìm nghiệm
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trình có 2 nghiệm phân biệt:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        } else if (delta ==  0) {
            double x = -b / 2 * a;
            System.out.println("Phương trình có nghiệm kép: x1 = x2 ="+x);
        }
        else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
