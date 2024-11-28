import java.util.Scanner;

public class Lab02_BTH4 {
    // Phương thức giải phương trình bậc 1
    void giaiptb1(float a, float b) {
        if (a == 0) {
            if (b == 0) {
                System.out.printf("\nPt: %.1f.x + %.1f = 0 => Phương trình có vô số nghiệm\n", a, b);
            } else {
                System.out.printf("\nPt: %.1f.x + %.1f = 0 => Phương trình vô nghiệm\n", a, b);
            }
        } else {
            float x = -b / a;
            System.out.printf("\nPt: %.1f.x + %.1f = 0 => Có nghiệm x = %.1f\n", a, b, x);
        }
    }

    // Phương thức giải phương trình bậc 2
    void giaiptb2(float a, float b, float c) {
        if (a == 0) {
            // Nếu a = 0, phương trình trở thành bậc 1
            giaiptb1(b, c);
        } else {
            float delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.printf("\nPt: %.1f.x^2 + %.1f.x + %.1f = 0 => Phương trình vô nghiệm\n", a, b, c);
            } else if (delta == 0) {
                float x = -b / (2 * a);
                System.out.printf("\nPt: %.1f.x^2 + %.1f.x + %.1f = 0 => Phương trình có nghiệm kép x = %.1f\n", a, b, c, x);
            } else {
                float x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                float x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.printf("\nPt: %.1f.x^2 + %.1f.x + %.1f = 0 => Có hai nghiệm phân biệt x1 = %.1f và x2 = %.1f\n", a, b, c, x1, x2);
            }
        }
    }

    public static void main(String[] args) {
        float a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("a:");
        a = sc.nextFloat();
        System.out.print("b:");
        b = sc.nextFloat();
        System.out.print("c:");
        c = sc.nextFloat();
        Lab02_BTH4 g = new Lab02_BTH4();
        g.giaiptb1(a, b);
        g.giaiptb2(a, b, c);


    }
}
