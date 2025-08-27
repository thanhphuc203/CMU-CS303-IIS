package Lec6Ex;
  import java.util.Arrays;
import java.util.Scanner;
public class Exercise10_ConcatenateTwoArrays {
 static int[] concatenate(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            result[i] = a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            result[a1.length + i] = a2[i];
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

        int[] result = concatenate(a1, a2);
        System.out.println("New array: " + Arrays.toString(result));
    }
}

