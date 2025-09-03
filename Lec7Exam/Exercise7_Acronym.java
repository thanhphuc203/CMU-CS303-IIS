
package Lec7Exam;
    import java.util.Scanner;
public class Exercise7_Acronym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        String[] words = input.split("\\s+");
        StringBuilder acronym = new StringBuilder();
        for (String word : words) {
            acronym.append(Character.toUpperCase(word.charAt(0)));
        }
        System.out.println(acronym.toString());
    }
}

