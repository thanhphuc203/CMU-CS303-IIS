
package Lec7Exam;
    import java.util.Scanner;
public class Exercise10_LongestCommonSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().trim();
        String s2 = sc.nextLine().trim();
        String longer = s1.length() >= s2.length() ? s1 : s2;
        String shorter = s1.length() < s2.length() ? s1 : s2;
        String longest = "";
        for (int i = 0; i < shorter.length(); i++) {
            for (int j = i + 1; j <= shorter.length(); j++) {
                String sub = shorter.substring(i, j);
                if (longer.contains(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }
        System.out.println(longest);
    }
}

