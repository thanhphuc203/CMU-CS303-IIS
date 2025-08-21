
package Lec4Ex;
import java.util.Scanner;
public class Bai8gocphantu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap toa đo x: ");
        double x = scanner.nextDouble();

        System.out.print("Nhap toa đo y: ");
        double y = scanner.nextDouble();

        String result;
        if (x > 0 && y > 0) {
            result = "Điem nam o goc phan tu thu 1.";
        } else if (x < 0 && y > 0) {
            result = "Điem nam o goc phan tu thu 2.";
        } else if (x < 0 && y < 0) {
            result = "Điem nam o goc phan tu thu 3.";
        } else if (x > 0 && y < 0) {
            result = "Điem nam o goc phan tu thu 4.";
        } else if (x == 0 && y == 0) {
            result = "Điem nam tai goc toa đo";
        } else {
            result = "diem nam tren mot truc toa do.";
        }
        System.out.println(result);

        scanner.close();
    }
}
