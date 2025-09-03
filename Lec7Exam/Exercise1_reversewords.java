
package Lec7Exam;
  import java.util.Scanner;
public class Exercise1_reversewords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap cau: ");
        String input = sc.nextLine();
        
        String[] words = input.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }
        System.out.println("Ket qua: " + reversedSentence.toString());
    }
}
