
package Lec4Ex;
    import java.util.Scanner;
public class Bai7timsolonnhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so thu 1: ");
        int num1 = scanner.nextInt();
        int solonnhat;

        System.out.print("Nhap vao so thu 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Nhap vao so thu 3: ");
        int num3 = scanner.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            solonnhat = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            solonnhat = num2;
        } else {
            solonnhat = num3;
        }
        System.out.println("So lon nhat la " + solonnhat);

    }
}
    

