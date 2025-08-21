
package Lec4Ex;
import java.util.Scanner;

public class Bai10Phanloai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao can 1: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap vao can 2: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap vao canh 3: ");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Day la tam giac deu.");
            } else if (a == b || b == c || a == c) {
                System.out.println("day la tam giac can.");
            } else {
                System.out.println("day la mot tam giac thuong.");
            }
        } else {
            System.out.println("khong the tao thanh tam giac.");
        }

    }
}

   
