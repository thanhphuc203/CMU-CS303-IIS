
package Lec7Exam;
    import java.util.Scanner;
public class Exercise8_WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.trim();
        if (input.isEmpty()) {
            System.out.println("The number of words in the string is: 0");
            return;
        }
        String[] words = input.split("\\s+");
        System.out.println("The number of words in the string is: " + words.length);
    }
}

