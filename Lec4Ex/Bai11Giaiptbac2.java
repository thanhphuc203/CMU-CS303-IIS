
package Lec4Ex;
    import java.util.Scanner;
public class Bai11Giaiptbac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhap he so c: ");
        double c = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem.");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                double root = -c / b;
                System.out.println("Day la phuong trinh bac nhat. Nghiem la: x = " + root);
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Phuong trinh khong co nghiem thuc..");
            } else if (delta == 0) {
                double root = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: x1 = x2 = " + root);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co hai nghiem phan biet.”: x1 = " + x1 + " and x2 = " + x2);
            }
        }
    }
}


