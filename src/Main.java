import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap ho ten cua ban: ");
        String hoTen = input.nextLine();

        System.out.println("Ho ten cua ban la: " + hoTen);

        input.close();
        System.out.println("Bai tap tuan 2");
    }
}
