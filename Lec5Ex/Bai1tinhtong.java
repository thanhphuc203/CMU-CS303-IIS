
package Lec5Ex;
    import java.util.Scanner;
public class Bai1tinhtong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap so: ");
        int sum = 0;
        System.out.print("Nhap vao so nguyen: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += i; // same as sum = sum + i
        }
        System.out.println("Tong cac so tu 1 den 100 la " + sum);

        }
    }
}
