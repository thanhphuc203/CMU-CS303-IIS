
package Lec6Ex;
 import java.util.Arrays;
import java.util.Scanner;
public class Ecercise13_MergeTwoSorted {
    public static int[] merge(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int i = 0, j = 0, k = 0;

        while (i < a1.length && j < a2.length) {
            if (a1[i] <= a2[j]) {
                result[k++] = a1[i++];
            } else {
                result[k++] = a2[j++];
            }
        }

        while (i < a1.length) {
            result[k++] = a1[i++];
        }

        while (j < a2.length) {
            result[k++] = a2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }

        int[] merged = merge(a1, a2);
        System.out.println("Merged array: " + Arrays.toString(merged));
    }
}

