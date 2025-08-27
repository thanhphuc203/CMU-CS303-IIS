
package Lec6Ex;
import java.util.Scanner;
public class Ecercise3_CountOccurrences {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Nhap so can tim: ");
        int x = sc.nextInt();
        int count = 0;
        for (int num : arr) {
            if (num == x) {
                count++;
            }
        }
        System.out.println("So " + x + " xuat hien " + count + " lan trong mang.");
    }
}
