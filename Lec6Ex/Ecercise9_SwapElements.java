
package Lec6Ex;
import java.util.Arrays;
import java.util.Scanner;

public class Ecercise9_SwapElements {
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();

        swap(arr, index1, index2);
        System.out.println("Array after swap: " + Arrays.toString(arr));
    }
}
