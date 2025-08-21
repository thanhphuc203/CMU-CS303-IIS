
package Lec4Ex;
    import java.util.Scanner;
public class bai1sochanle {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhap so nguyen: ");
         int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.print(" la so chan: ");
        } else {
            System.out.print(" la so le: ");       
        }
    }
}
