import java.util.Scanner;

public class pt1 {
    float a, b;

    // Phương thức nhập liệu
    void nhaplieu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a:");
        a = sc.nextFloat();
        System.out.println("Nhập b:");
        b = sc.nextFloat();
    }

    // Phương thức giải phương trình bậc nhất
    void Giaipt(){
        if(a != 0){
            float x = -b / a;
            System.out.println("Phương trình có nghiệm: " + x);
        }
        else{
            if(b == 0){
                System.out.println("Phương trình có vô số nghiệm");
            }
            else{
                System.out.println("Phương trình có vô nghiệm");
            }
        }
    }

    public static void main(String[] args) {
        pt1 p = new pt1();
        p.nhaplieu();
        p.Giaipt();
    }
}
