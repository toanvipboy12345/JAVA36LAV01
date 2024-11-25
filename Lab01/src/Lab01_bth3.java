import java.util.Scanner;

public class Lab01_bth3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên của bạn ");
        String ten = sc.nextLine();
        System.out.println("Nhập tuổi:");
        int tuoi = sc.nextInt();
        System.out.println("Nhập điểm l thuyết");
        float diemlt = sc.nextFloat();
        System.out.println("Nhập điểm thực hành");
        float diemth = sc.nextFloat();
        float diemtb = (diemth + diemlt)/2;
    System.out.println("\n Xin chào "+ten+", "+tuoi+" tuoi");
    System.out.println("Diem trung binh cua ban:" +diemtb);
    }
}
