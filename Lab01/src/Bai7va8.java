import java.util.Scanner;

public class Bai7va8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter number 3: ");
        int num3 = sc.nextInt();


        int max12 = (num1 > num2) ? num1 : num2;
        int min12 = (num1 < num2) ? num1 : num2;


        int maxAll = (max12 > num3) ? max12 : num3;
        int minAll = (min12 < num3) ? min12 : num3;

        // In kết quả
        System.out.println("Max của num 1 và num 2: " + max12);
        System.out.println("Max của num 1 và num 2: " + min12);
        System.out.println("Max của ba số : " + maxAll);
        System.out.println("Min của 3 só: " + minAll);
    }
}
