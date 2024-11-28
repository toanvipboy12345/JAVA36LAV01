import java.util.Scanner;
public class sinhvien {
    String name;
    String address;
    int soLanThi;
    float diemJava;
    double lePhiThi;
    char GioiTinh;
    void NhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sinh viên: ");
        name = sc.nextLine();

        System.out.print("Nhập địa chỉ: ");
        address = sc.nextLine();

        System.out.print("Nhập số lần thi: ");
        soLanThi = sc.nextInt();

        System.out.print("Nhập điểm Java: ");
        diemJava = sc.nextFloat();

        System.out.print("Nhập lệ phí thi: ");
        lePhiThi = sc.nextDouble();

        System.out.print("Nhập giới tính (M/F): ");
        GioiTinh = sc.next().charAt(0);
    }
    public static void main(String[] args) {
        sinhvien sinhvien = new sinhvien();
        sinhvien.NhapThongTin();
        System.out.println("Họ và tên: " + sinhvien.name);
        System.out.println("Đia chỉ: " + sinhvien.address);
        System.out.println("Số lần thi: " + sinhvien.soLanThi);
        System.out.println("Diem Java: " + sinhvien.diemJava);
        System.out.println("Giới tính: " + sinhvien.GioiTinh);
    }
}
