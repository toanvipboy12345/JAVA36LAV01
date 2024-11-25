import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n1: ");
        int n1 = sc.nextInt();
        System.out.println("Nhập m1: ");
        int m1 = sc.nextInt();
        System.out.println("Nhập n2");
        double n2 = sc.nextDouble();
        System.out.println("Nhập m2");
        double m2 = sc.nextDouble();
        int nm1 = n1+m1;
        double nm2 = n2 + m2;
        double n1n2 = n1 + n2;
        System.out.println("Tong 2 so nguyen: "+nm1 );
        System.out.println("Tong 2 so thuc: "+nm2 );
        System.out.print("Tong  cua n1 va n2: "+n1n2);

    }
}
