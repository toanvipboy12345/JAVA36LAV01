import java.util.Scanner;

class Person {
    private String name;
    private String address;
    private double salary;

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên: ");
        name = sc.nextLine();

        System.out.print("Nhập địa chỉ: ");
        address = sc.nextLine();

        System.out.print("Nhập lương: ");
        salary = sc.nextDouble();
    }
    // Hàm view(): Hiển thị thông tin cho Person
    public void view() {
        System.out.println("Thông tin Person:");
        System.out.println("Tên: " + name);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Lương: " + salary);
    }
    // Hàm main() để kiểm tra chương trình
    public static void main(String[] args) {
        Person person = new Person();

        person.input();

        person.view();
    }
}
