
package Lec6Ex;
import java.util.ArrayList;
import java.util.Scanner;
public class Ecercise5_FilterEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        ArrayList<Integer> evens = filterEven(numbers);
        System.out.println("Cac so chan la: " + evens);

        sc.close();
    }
    public static ArrayList<Integer> filterEven(int[] arr) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }
        return evenList;
    }
}
