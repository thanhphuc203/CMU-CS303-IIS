
package Lec7Exam;
import java.util.Scanner;
public class Exercise6_LongestWord {
    public static String findLongestWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) return "";

        String[] words = sentence.split("\\s+");
        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap cau: ");
        String sentence = sc.nextLine();
        String longest = findLongestWord(sentence);
        System.out.println("Tu dai nhat: " + longest);
    }
}

