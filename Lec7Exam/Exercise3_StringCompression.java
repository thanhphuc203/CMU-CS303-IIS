
package Lec7Exam;
 import java.util.Scanner;
public class Exercise3_StringCompression {
    public static String compressString(String s) {
        if (s == null || s.isEmpty()) return "";
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        compressed.append(s.charAt(s.length() - 1)).append(count);
        return compressed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String input = sc.nextLine();
        String output = compressString(input);
        System.out.println("Ket qua: " + output);
    }
}

