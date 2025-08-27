
package Lec6Ex;
import java.util.Scanner;
public class Ecercise2_ReverseArray {
    public static void reverseArray(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - 1 - i];
            numbers[n - 1 - i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);

        System.out.println("Mang sau khi dao nguoc:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}

