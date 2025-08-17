
package Lec3EX;
    import java.util.Scanner;
public class bai6 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten day du cua ban: ");
        String fullName = scanner.nextLine(); 
        System.out.println("Ten day du cua ban la: " + fullName);
        scanner.close();
    }
}
