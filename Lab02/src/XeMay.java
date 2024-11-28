import java.util.Scanner;

class XeMay {

    private String ten;
    private String nhaSanXuat;
    private int soLuongBanhXe;

    // Phương thức nhập thông tin
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên xe: ");
        ten = sc.nextLine();

        System.out.print("Nhập nhà sản xuất: ");
        nhaSanXuat = sc.nextLine();

        System.out.print("Nhập số lượng bánh xe: ");
        soLuongBanhXe = sc.nextInt();
    }


    public void hienThiThongTin() {
        System.out.println("Thông tin xe máy:");
        System.out.println("Tên xe: " + ten);
        System.out.println("Nhà sản xuất: " + nhaSanXuat);
        System.out.println("Số lượng bánh xe: " + soLuongBanhXe);
    }


    public static void main(String[] args) {
        XeMay xeMay = new XeMay();
        xeMay.nhapThongTin();
        xeMay.hienThiThongTin();
    }
}
