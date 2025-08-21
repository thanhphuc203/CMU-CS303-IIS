
package Lec4Ex;
    import java.util.Scanner;
public class Bai9Giatrituyetdoi {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap: ");
        int num = scanner.nextInt();
        int absValue = (num >= 0) ? num : -num;
        System.out.println("gia tri tuyet doi la " + absValue);
    }
}
   
