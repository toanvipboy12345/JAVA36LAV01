import java.util.Scanner;

public class SimpleCaculator {

    public static void main(String[] args) {
        int soA, soB;
        float kq;
        String pheptinh = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        soA = sc.nextInt();
        System.out.println("Enter the second number: ");
        System.out.println("Nhập phép tính: ");
        soB = sc.nextInt();
        switch (pheptinh) {
            case "+":
                kq = soA + soB;
                break;
            case "-":
                kq = soA - soB;
                break;
                case "*":
                    kq = soA * soB;
                    break;
                    case "/":
                        kq =  soA/soB;
                        break;
            case "%":
                kq = soA%soB;
                break;
            default:
                System.out.println("Lỗi");
        }

    }
}
