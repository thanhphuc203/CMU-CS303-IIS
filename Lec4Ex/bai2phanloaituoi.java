package Lec4Ex;
import java.util.Scanner;

public class bai2phanloaituoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tuoi: ");
        int n = sc.nextInt();

        if (n >= 0 && n <= 12) {
            System.out.println("Tre em");
        } else if (n >= 13 && n <= 19) {
            System.out.println("Thieu nien");
        } else if (n >= 20 && n <= 59) {
            System.out.println("Nguoi lon");
        } else if (n >= 60) {
            System.out.println("Nguoi cao tuoi");
        } else {
            System.out.println("Tuoi khong hop le!");
        }

    }
}
