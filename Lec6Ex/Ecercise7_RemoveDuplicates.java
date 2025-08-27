
package Lec6Ex;
  import java.util.ArrayList;
import java.util.Scanner;
public class Ecercise7_RemoveDuplicates {
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer num : list) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            input.add(sc.nextInt());
        }
        ArrayList<Integer> output = removeDuplicates(input);
        System.out.println(output);
    }
}


