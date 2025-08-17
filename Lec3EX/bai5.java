
package Lec3EX;
import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("nhap gia tri boolean (true/false): ");
        boolean value = scanner.nextBoolean();
        if (value) {
            System.out.println("nhap dung : (true)");
        } else {
            System.out.println(" nhap sai : (false)");
        }
        scanner.close();
    }
}
