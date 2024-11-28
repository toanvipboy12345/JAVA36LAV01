import java.util.Scanner;

public class DuBaoThoiTiet {
    int status;

    void nhapDuLieu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chương trình dự báo thời tiết chuồn chuồn");
        System.out.println("1. Bay Thấp");
        System.out.println("2.Bay cao");
        System.out.println("3.Bay vừa");
        System.out.println("4.Say rượu cmn rồi!");
        System.out.println("Mời nhập từ 1 đến 4:");
        status = sc.nextInt();
        System.out.println("Cảm ơn đã nhập.");
    }

    void hienThiDuBao() {
        switch (status) {
            case 1:
                System.out.println("Dự báo: Mưa. Ra khỏ nhà nhớ mang áo mưa");
                break;
            case 2:
                System.out.println("Dự báo: Nắng. Nhớ mang ô nhé !");
                break;
            case 3:
                System.out.println("Dự báo: Râm, mát giời !");
                break;
            case 4:
                System.out.println("Dự báo: Xin lỗi, do nhậu say nên ko trả lời");
                break;

            default:
                System.out.println("Chuồn chuồn thử *beep* 404 lần nhưng không có kết quả");
                break;

        }
    }

    public static void main(String[] args) {
            DuBaoThoiTiet db =  new DuBaoThoiTiet();
            db.nhapDuLieu();
            db.hienThiDuBao();

    }
}
