
package Lec7Exam;
 import java.util.Scanner;
public class Exercise2_CapitalizeName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            String normalized = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            result.append(normalized).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
