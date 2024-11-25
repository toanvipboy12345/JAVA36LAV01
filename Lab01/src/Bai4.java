import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nhập một số nguyên: ");
        int n = sc.nextInt();


        System.out.print("Nhập một số thực: ");
        double m = sc.nextDouble();
        sc.nextLine();


        System.out.print("Nhập một xâu ký tự: ");
        String str = sc.nextLine();


        System.out.println("Số nguyên bạn vừa nhập: " + n);
        System.out.println("Số thực bạn vừa nhập: " + m);
        System.out.println("Xâu ký tự bạn vừa nhập: " + str);

    }
}
