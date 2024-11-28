import java.util.Scanner;

public class Lab02_BTH3 {
    String name;
    String ma;
    float diemLT;
    float diemTH;
    float diemTb = (diemLT + diemTH) / 2;

    void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhập mã");
        ma = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết:");
        diemLT = sc.nextFloat();
        System.out.println("Nhập điểm thực hành:");
        diemTH = sc.nextFloat();
    }

    void xepLoai() {

        diemTb = (diemLT + diemTH) / 2;

        if (diemLT < 4) {
            System.out.println("Thi lại lý thuyết");
        }
        if (diemTH < 4) {
            System.out.println("Thi lại thực hành");
        }

        if (diemLT >= 4 && diemTH >= 4) {
            if (diemTb >= 7) {
                System.out.println("Sinh viên đạt xuất sắc môn Java");
            } else if (diemTb >= 4) {
                System.out.println("Sinh viên đạt môn Java");
            } else {
                System.out.println("Sinh viên học lại");
            }
        } else {
            System.out.println("Sinh viên học lại!");
        }
    }

    public static void main(String[] args) {
        Lab02_BTH3 n = new Lab02_BTH3();
        n.nhapThongTin();
        n.xepLoai();
    }
}
